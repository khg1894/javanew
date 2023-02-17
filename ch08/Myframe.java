package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends MFrame 
implements ActionListener{
	Button btn;
	boolean flag=false;
	
	public Myframe() {
		btn = new Button("Button");
		add(btn,BorderLayout.SOUTH);
		setBackground(Color.orange);
		//actionPerformed 연결 메서드
		//내 자신이 ActionListener 타입이므로 this가 가능
		//버튼을 클릭하면 ActionEvent 객체가 내부적으로 생성됨
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
			setBackground(Color.orange);
		else
			setBackground(Color.pink);
		flag =!flag;
	}


	public static void main(String[] args) {
		new Myframe();
	}


}
