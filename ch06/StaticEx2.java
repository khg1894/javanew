package ch06;
/*
 * static 필드 및 메소드는 클래스명.필드 or 메소드 일때
 * 메모리 로딩이 되지만 non-static필드 및 메소드는
 * 반드시 객체를 생성해야 메모리 로딩된다/
 * 그래서 non-static필드 및 메소드는 static필드 및 메소드에서 사용할 수 없다.*/

public class StaticEx2 {
	static int a =10;
	int b = 10;//non-static
	
	static void prn() {
		System.out.println(a);
		//System.out.println(b); static메소드에는 static 변수만 사용가능
	}
	
	void prn2() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		StaticEx2 st = new StaticEx2();
		StaticEx2.prn();//prn()의 경우 static 선언을 했기때문에 객체인 st를 사용하지않고 이와 같은 형태로 사용이 가능하다.
		st.prn2();//prn2는 static 선언이 안되어있기에 객체.메소드 형태로 된다.

	}

}
