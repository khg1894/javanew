package ch11;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "Java Programming";

		int len = str.length();
		System.out.println("len : " + len);// 공백도 길이에 포함
		System.out.println(str.toLowerCase());// 소문자 변환
		System.out.println(str.toUpperCase());// 대문자 변환

		String str2 = str.substring(5);// 5까지 자르고 출력
		String str3 = str.substring(5, 10);// 이 사이만 출력
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		// 8번째 문자
		char c1 = str.charAt(8);
		System.out.println("8번째 문자 : " + c1);
		// 작수 자리 문자만 출력하세요
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
		//a문자는 몇번째 자리에 있는가?
		int idx1 =str.indexOf('a');
		System.out.println("\n" + "idx1:"+idx1);
		int idx2 = str.lastIndexOf('a');
		System.out.println("idx2: "+idx2);
		//a를 q로 변환 출력하시오. : charAt
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				System.out.println('q');
			}else {
				System.out.println(str.charAt(i));
			}
			
		}
		String str4 = str.replace('a', 'q'); //특정 문자를 교체 a=>q
 		System.out.println(str4);
 		//str을 반대로 출력
 		StringBuffer str5 = new StringBuffer(
 				);
 		String reversestr = str5.reverse().toString();
 		System.out.println(reversestr);
 		
 		for(int i = len-1;i >=0;i--) {
 			System.out.println(str.charAt(i));
 		}
 		String str6 = "Java&JSP&Android&Iot&Spring";
 		String str7[] = str6.split("&");
 		for(int i =0;i<str7.length;i++) {
 			System.out.println(str7[i]);
 		}
 		String str8 = "       JSPstudy          ";
 		System.out.println(str8.trim());//공백제거
 		int idx3 = 22;
 		String str9 = String.valueOf(idx3);
 		String str10 = idx3+"";
 		System.out.println(str9 + ":"+str10);
	}

}
