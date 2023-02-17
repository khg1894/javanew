package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe2 extends MFrame implements ActionListener {
	Button btn;
	boolean flag = false;

	public Myframe2() {
		btn = new Button("Button2");
		add(btn, BorderLayout.SOUTH);
		setBackground(Color.green);
		MyAction ma = new MyAction();
		btn.addActionListener(ma);
	}

	class MyAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (flag)
				setBackground(Color.green);
			else
				setBackground(Color.yellow);
			flag = !flag;
		}
	}

	public static void main(String[] args) {
		new Myframe2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
