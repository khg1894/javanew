package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame extends Frame{

	public MFrame() {
		this(300, 300, new Color(220,220,220), false);
		//this() 괄호안의 변수와 동일 형식의  매개변수를 가지는 생성자를 호출하여 
		//값을 대입한다.
	}
	
	public MFrame(int w, int h) {
		this(w, h, new Color(220,220,220), false);
		//ex)MFrame(300, 300)을 받을 경우 w = 300, h =300으로 
		//취급하여 this()의 동일한 매개변수를 가지는 생성자를 호출하여 값을 넣는다.
	}
	
	public MFrame(Color c) {
		this(300, 300, c, false);
	}
	
	public MFrame(int w, int h, Color c, boolean flag) {
		setSize(w, h);
		setBackground(c);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(flag);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//new MFrame();
		//new MFrame(Color.cyan);
		new MFrame(500, 500, 
				new Color(100,200,100), true);
		new MFrame(500,500,new Color(255,255,255), false);
	}
}






