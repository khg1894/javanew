package ch08;

abstract class Tv{
	String color;
	boolean power;
	int ch;
	void poweronoff() {
		power=!power;
	}
	void upch() {
		ch++;
	}
	void downch() {
		ch--;
	}
	abstract void setModel();//리턴 타입 앞에 abstract 라는 키워드가 붙는다
}
class SMTv extends Tv implements remotecontrol{

	@Override
	void setModel() {
	}

	@Override
	public void turnon() {
	}

	@Override
	public void turnoff() {
	}
	
}
class LGTv extends Tv implements remotecontrol{

	@Override
	void setModel() {
	}

	@Override
	public void turnon() {
	}

	@Override
	public void turnoff() {
	}
	
}
interface remotecontrol{
	void turnon();
	void turnoff();
}
public class InterfaceEx4 {

}
