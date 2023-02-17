package imgDBUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class ImageMgr {

	private DBConnectionMgr pool;
	
	public ImageMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public void insertImg(File file) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "insert tblImageLoad values(null, ?, ?)";
			pstmt = con.prepareStatement(sql);
			InputStream is = new FileInputStream(file);
			pstmt.setString(1, file.getName());
			pstmt.setBinaryStream(2, is);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	public File selectImg(int num) {
		System.out.println("num : " + num);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		File file = null;
		InputStream is = null;
		FileOutputStream fos = null;
		try {
			con = pool.getConnection();
			sql = "select name, img from tblImageLoad where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				file =  new File("imgDBUpload/"+rs.getString("name"));
				fos = new FileOutputStream(file);
				is = rs.getBinaryStream("img");
				int i;
				while((i=is.read())!=-1) {
					fos.write(i);
				}
			}
			if(fos!=null) fos.close();
			if(is!=null) is.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return file;
	}
	
	public Vector<Integer> getNumList(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<Integer> vlist = new Vector<Integer>();
		try {
			con = pool.getConnection();
			sql = "select num from tblImageLoad";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vlist.addElement(rs.getInt("num"));
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	
}








