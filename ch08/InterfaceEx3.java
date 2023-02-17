package ch08;

interface InterfaceA3{
	void prn1();
}
interface InterfaceB3{
	void prn2();
}
//implements한 클래스는 implements의 내용을 다 사용해야 한다.
//implements의 경우 부모의 메소드를 반드시 오버라이딩해야한다
class MyClass implements InterfaceA3,InterfaceB3{

	@Override
	public void prn2() {
	}

	@Override
	public void prn1() {
	}
	
}
public class InterfaceEx3 {

}
