package ch11;

class point3{}

public class StringEx1 {
	public static void main(String[] args) {
		point3 p1 = new point3();
		point3 p2 = new point3();
		System.out.println(p1==p2); //주소값이 다르기 때문에 flase 가 출력된다
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		//new 연산자 없이 객체를 생성하는 유일한 클래스
		//new 없이 만들어진 string 객체는 string 저장소에 만들어진다.
		//생성시에 동일한 문자열 값이 있으면 참조하게된다.
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";//new없이 생성가능, 초기 생성
		String s4 = "Java";//string 저장소에서 java를 참조했기때문에 s3와 같다 
		System.out.println(s1 == s2);//false
		System.out.println(s2 == s3);//false
		System.out.println(s3 == s4);//true
		//객체의 문자열 내용을 비교
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(p1.equals(p2));//오브젝트는 안됨
		
		String s5 = "APPLE";
		String s6 = "apple";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6)); //대소문자 무시하고 비교
	}
	
}
