package ch13;

import java.util.Vector;

public class VectorEx1 {//키 값을 지정해줘서 덮어쓰기를 방지
	public static void main(String[] args) {
		Vector vlist = new Vector();
		System.out.println(vlist.size());//요소가 들어가있는 칸
		System.out.println(vlist.capacity());//요소가 들어갈 수 있는 칸
//		vlist.add(vlist); 저장되었다면 true를 반환
		vlist.add(new String("하하"));
		vlist.add("하하");
		vlist.add(Integer.valueOf(22));
		vlist.add(23);
		System.out.println(vlist.size());//결과값이 4가 출력된다, 위에서 4개를 add했기 때문
		//배열과 vector 밑에는 항상 for
		for (int i = 0; i < vlist.size(); i++) {
			System.out.println(vlist.get(i));//vlist.get을통해 자리마다의 요소 추출
		}
		for(Object obj:vlist) {
			System.out.println(obj);
		}
	}
}
