package ch07;

import java.awt.Color;
import java.awt.Frame;

class MFrame2 extends Frame {
	public MFrame2() {//기본 생성자
	}
	public MFrame2(Color c, int w, int h, boolean flag) {//오버로딩된 생성자
		setBackground(c);
		setSize(w, h);
		setVisible(flag);
	}
}

public class InheritanceEx2 {
public InheritanceEx2(){
	
}
	public static void main(String[] args) {
		MFrame2 m = new MFrame2();
		m.setBackground(Color.orange);
		m.setSize(300, 300);
		m.setVisible(true);
		MFrame2 m2 = new MFrame2(Color.red, 200, 150, true);
		
	}

}
