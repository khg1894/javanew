package ch09;

interface Myinter1 {
	void prn();
}

abstract class Myabst1 {
	abstract void prn();
}

class A implements Myinter1 {
	@Override
	public void prn() {
		System.out.println("일반적인 구현방법");
	}
}

class B extends Myabst1{
	@Override
	void prn() {
		System.out.println("일반적인 구현 방법2");
	}
}
public class AnonymousEx1 {
	public static void main(String[] args) {
		A a = new A();
		a.prn();
		B b= new B();
		b.prn();
		//클래스화를 시켜 다른곳에서 사용할 목적이 아닌 여기에서만 간단하게 사용 하기위함
		new Myinter1() {//인터페이스 이지만 클래스 선언가능, 익명클래스는 파일로 확인할때는 1,2 등 숫자로 확인된다 
			
			@Override
			public void prn() {
				System.out.println("익명 클래스 구현 방법");
			}
		}.prn();;
		new Myabst1() {
			
			@Override
			void prn() {
				System.out.println("익명 클래스 구현 방법 2");
			}
		}.prn();;
	}
	
	
}
