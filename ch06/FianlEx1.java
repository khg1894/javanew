package ch06;

/*final (마지막) : 클래스, 필드(인스턴스 변수), 메서드
1.클래스 : sub 클래스가 없는 클래스
2.변수 : 상수선언 (필드, 매개변수, 지역변수에도 적용가능)
3.메소드 : 오버라이딩(상위 클래스에서 정의한 메소드를 하위 클래스에서 다시 재정의하는것 ) 불가
*/
final class Final1{
	/*
	 * class Final2 extends Final1{
	 * final class Final1 이기때문에 extends를 통해서 상속이 불가능
	 * }
	 */
}
class Final3{
	final int KIA = 1;
	final int SK = 1;// final로 지정할때는 특정값으로 초기화를 해줘야한다.
	int k;
	public Final3() {
		// 위에서 final 선언을 했기대문에 KIA라는 변수는 수정이불가하고 1이라는 값으로 저장된다.
		//KIA = 2;
		System.out.println(k);
	}
	public void prn(final int a) {
		//a = 10; 위에서 final int a라고 지정했기에 메소드로 들어올 값이 a 값을 지정된다.
		final int b =10;//메소드 내부에 있기에 지역변수(local variable)라고한다.
		//b = 20;
		int c;
		//System.out.println(c);
		//위에서 변수 k는 0이라는 값을 초기화가 되지만 메소드 내부의 c의 경우에는 별도로 값이 지정되지않는다.
		//그렇기에 c의 값을 지정하지않고 c가 대입되는 print문이 실행될 때 오류가 발생한다.
		//외부에서는 메소드 내부의 변수값에 변화를 줄 수 없다.	
	}
}
class Final4{
	void prn1() {
	}
	final void prn2() {
	}
}
class Final5 extends Final4{
	@Override //상위 클래스에서 메소드를 가져올 때 사용
	void prn1() {
	}
	//@Override
//	void prn2() {} //prn2같은 경우 위 Fianl4라는 부모 클래스에서 final 지정 되었기때문에 가져오는게 불가능하다
}
public class FianlEx1 {

	public static void main(String[] args) {

	}
}
