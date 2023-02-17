
import java.awt.Button;

import awt.MFrame;

public class NullLayoutEx1 extends MFrame {
	
	Button btn1, btn2;
	
	public NullLayoutEx1() {
		setLayout(null);
		btn1 = new Button("��ư1");
		btn2 = new Button("��ư2");
		btn1.setBounds(10,50,50,50);
		btn2.setBounds(100,50,50,50);
		add(btn1);
		add(btn2);
		
	}
	public static void main(String[] args) {
		new NullLayoutEx1();
	}

}
