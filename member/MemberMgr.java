package member;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {

	private DBConnectionMgr pool;

	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
	}

	// 모든 리스트 : SELECT - DB1
	public Vector<MemberBean> selectAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "SELECT * FROM tblMember"; // 쿼리문 삽입 공간
			pstmt = con.prepareStatement(sql);// 쿼리문에 넣을 명령문을 가져옴
			rs = pstmt.executeQuery();// 실행한 결과를 에 저장한다.
			while (rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setAddress(rs.getString("address"));
				bean.setTeam(rs.getString("team"));
				vlist.addElement(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// 저장 : INSERT - DB2
	public boolean insert(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert tblMember values(null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			// 첫번째 ?에 매개변수로 들어온 빈즈에 name값 세팅 : 'aaa'
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			// insert, update, delete 적용된 레코드 개수
			int cnt = pstmt.executeUpdate();
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	// 한개의 레코드 : SELECT - DB1
	public MemberBean select(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember where id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);//물음표 첫째자리에 매개변수로 받은 id 값을 대입한다.
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setAddress(rs.getString("address"));
				bean.setTeam(rs.getString("team"));
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	// 수정 : UPDATE - DB2 ->insert와 유사
	public boolean update(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblMember set name = ?, phone = ?,address = ?, team = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			pstmt.setInt(5, bean.getId());
			//insert, update, delete는 실행을 하면 적용된 레코드 개수가 리턴된다.
			int cnt = pstmt.executeUpdate();//명령문을 실행시키고 결과값을 가지고오는게 아니라 위에서 set을 통해 먼저 값이 대입된 후에 명령문이 실행된다
			if(cnt ==1)flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	// 삭제 : DELETE - DB2
	public boolean delete(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
		
	}

	// 주소검색(우편 번호 검색) : SELECT - DB1
	public Vector<ZipcodeBean> zipcodeSearch(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblzipcode " + "where area3 like ?";//?에 조건 삽입예정
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+area3+"%");
			//like %`강남대로`%
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				//select뒤에 가져오는 컬럼의 index
				bean.setZipcode(rs.getString(1));
				bean.setArea1(rs.getString(2));
				bean.setArea2(rs.getString(3));
				bean.setArea3(rs.getString(4));
				vlist.addElement(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	
	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
//		MemberBean bean_insert = new MemberBean();
//		bean_insert.setName("강호동");
//		bean_insert.setPhone("010-5555-2323");
//		bean_insert.setAddress("부산시 연제구");
//		bean_insert.setTeam("창원대");
//		boolean flag = mgr.insert(bean_insert);
//		System.out.println(flag);
		
		
		//배열과 vector밑에는 항상 for문 존재
//		Vector<MemberBean> vlist_select = mgr.selectAll();
//		for (int i = 0; i < vlist_select.size(); i++) {
//			MemberBean bean_select = vlist_select.get(i);
//			System.out.println(bean_select.getId()+"\t"
//							+bean_select.getName()+"\t"
//							+bean_select.getPhone()+"\t"
//							+bean_select.getAddress()+"\t"
//							+bean_select.getTeam());
//		}
	}
}
/*
 * Classpath 설정 jdk or jre -> 기본클래스가 필요 현재 실행중인 class jvm인식 외부 클래스들 -> .jar 형식으로
 * 압축
 */
