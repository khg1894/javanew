package ch11;

import java.util.Iterator;

public class StringEx3 {
	public static void main(String[] args) {
		String str = "전지현이가 백화점에서 팬사인회를 연다."
				 + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
				 + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
				 + " 홍보를 위한 팬사인회에 참석한다.";
		int len = str.length();
		/*1번. 순방향으로 공백문자의 index번호를 출력하시오indexOf*/
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				System.out.print(str.indexOf(" ",i)+",");
			}
		}
		System.out.println("");
		
		int idx = -1;
		do {
			idx = str.indexOf(' ',idx+1);
			if(idx>=0)System.out.print(idx + ",");
		} while (idx>=0);
		System.out.println("");
		/*2번. 역방향으로 공백문자의 index 번호를 출력하시오,lastIndexOf*/
		for (int i = len-1; i > 0; i--) {
			if (str.charAt(i) == ' ') {
				System.out.print(str.lastIndexOf(" ",i)+",");
			}
		}
		System.out.println("");
		/*3번.빈칸을  '_'출력하시오.*/
 		System.out.println(str.replace(' ', '_'));
 		for (int i =0;i<len;i++) {
 			char c = str.charAt(i);
 			if(c!=' ')System.out.print(c);
 			else System.out.print('_');
 		}
		System.out.println("");

		/*4번 첫단어 출력하기 : substring, indexOf*/
 		int FirstWord = str.indexOf(" ");
 		System.out.println(str.substring(0,FirstWord)); 
		/*5번 마지막단어 출력하기 : substring, lastIndexOf*/
 		int LastWord = str.lastIndexOf(" ");
 		System.out.println(str.substring(LastWord+1,len)); 

	}
}
