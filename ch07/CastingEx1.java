package ch07;

public class CastingEx1 {

	public static void main(String[] args) {
		int a =1234567;
		short s =(short)a;//명시적 형변환 : 큰타입 -> 작은타입
		System.out.println(a);
		System.out.println(s);//기존값과 달라진다.
		long l =a;//묵시적 형변환 
		System.out.println(l);
	}
}
