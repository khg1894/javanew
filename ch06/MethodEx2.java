package ch06;

class Method2 {
	// 메서드 오버로딩(over loading)
	// 동일한 메서드명으로 매개변수의 개수를 다르게 선언한다(기능은 동일하다)
	// prn이라는 동일한 메서드명을 사용하고 int a, int b 등의 매개변수 개수를 조절한다
	void prn(int a) {
		System.out.println(a);
	}

	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}

	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}

	void prn(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		// Math 클래스에 abs메소드는 절대값 리턴
		int a = Math.abs(-10);
		double d = Math.abs(3.14);
		Method2 mt = new Method2();
		mt.prn(10);
		mt.prn(10, 20);
		mt.prn(10, 20, 30);

	}

}
