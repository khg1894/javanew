package ch13;

import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		String str[] = { "노르웨이", "스위스", "뉴질랜드", "덴마크", "캐나다" };
		Vector vlist1 = new Vector();
		Vector<String> vlist2 = new Vector<String>();// 벡터 저장타입 지정
		for (int i = 0; i < str.length; i++) {
			vlist1.add(str[i]);
			vlist2.add(str[i]);
		}
		for (int i = 0; i < vlist1.size(); i++) {
			String s = (String) vlist1.get(i);
			String s1 = vlist2.get(i);// 위에서 지정했기때문에 vlist2는 형태 지정 해줄필요없음
		}
		for (Object obj : vlist1) {

		}
		for (String string : vlist2) {

		}
	}

}
