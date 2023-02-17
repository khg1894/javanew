package ch06;
/*
 * static : 필드, 메소드, 클래스에 사용가능
 * static : 필 드 및 메소드는 객체를 생성하지 않아옫 사용가능
 * 사용시점 : 클래스 이름으로 접근하기 때문에 그때 메모리에 로딩
 * */
class Static1{
	static int i =0;
	int j =0;
	
	static void prn() {}
	void prn2() {}
	static class Inner{//내부 클래스 앞에는 static이 올 수 있다.
		
	}
}
public class StaticEx1 {

	public static void main(String[] args) {
		int a= Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i =new Integer(23);
		int c = i.parseInt("23");//pasreInt : 23이라는 문자를 정수로 변환한다.
		int d = Integer.parseInt("23");//위보다는 아래가 올바른형태
		//parseInt와 같이 누워지는 명령어의 경우 클래스명.명령어(Integer.parseInt) 와 같은 형태로 사용한다
		
		//반지름이 5인 원의 넓이를 구하시오
		System.out.println(5*5*Math.PI);
	}

}
