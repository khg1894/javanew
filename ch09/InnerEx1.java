package ch09;
/*내부(중첩)클래스
 * 1. 클래스 안에 선언.(주 사용처)
 * 2. 클래스안에 선언이지만 static 클래스(거의 사용안함)
 * 3. 메서드 안에 클래스 선언(잘 사용안함)
 * 4. 메서드 안에 선언을 하고 선언과 동시 생성 익명클래스(주 사용처 22)
 * */

interface MyInter{
	void prn();
}

class outer1{
	class inner1{
		
	}
	static class inner2{
		
	}
	//메서드 안에 메서드는 선언 불가
	void prn() {
		class inner3{
		}//메서드 안에 클래스
		new MyInter() {
			@Override
			public void prn() {
			}
		};
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		
	}

}
