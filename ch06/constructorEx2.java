package ch06;

import java.awt.Dialog;

class Constructor2{
//JVM은 생성자가 하나라도 선언되어 있으면 디폴트 생성자 제공 안함
	public Constructor2(int i) {//int i 라는 매개변수를 가지는 생성자가 있기 때문에 추가적인 디폴트 생성자를 제공하지 않는다
		
	}
}
public class constructorEx2 {
	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2(22);
	}
	//Dialog 클래스는 디폴트 생성자가 존재하지 않음
	//Dialog d = new Dialog();
}
