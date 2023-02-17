package ch11;

public class WrapperEx2 {
	public static void main(String[] args) {
		char c1 = 'j';
		System.out.print(c1);
		if(Character.isLetter(c1)) {//boolean 타입의 메소드, 문자인지 확인
			System.out.println(" : 문자입니다.");
		}
		char c2 = 'a'; //대 소문자 구분
		if(Character.isLowerCase(c2)) {
			System.out.println("소문자 입니다.");
		}else {
			System.out.println("대문자 입니다");
		}
		char c3 =2;//숫자인지
		if(Character.isDigit(c3)) {
			System.out.println("문자입니다.");
		}else {
			System.out.println("숫자입니다.");
		}
		char c4 = ' ';//공백 문자인지
		if(Character.isWhitespace(c4)) {
			System.out.println("공백 문자입니다.");
		}else {
			System.out.println("일반문자입니다");
		}
		Long l;
		Boolean b;
		Short s;
		Double d;
		Float f;
		Byte bt;
		Integer i;
		Character c; 
		
		
	}

}
