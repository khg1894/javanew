package ch06;

class SuperClass4 {
	// super라는 키워드는 부모를 지칭하는것
	// super()는 반드시 첫번째 라인에 삽입(생략)
	// public SuperClass4() {
//
//	}

	public SuperClass4(int i) {
		System.out.println("int 매개변수");
	}

	public SuperClass4(String s) {
		System.out.println("String 매개변수");
	}
}

class SubClass4 extends SuperClass4 {
	public SubClass4() {
		super("c");
	}
}

public class constructorEx3 {

	public static void main(String[] args) {
		SubClass4 s1 = new SubClass4();

	}

}
