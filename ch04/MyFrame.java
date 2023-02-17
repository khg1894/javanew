package ch04;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends Frame{
	public MyFrame() {
		setSize(300,300);
		setBackground(setColor());
		Button btn = new Button("Button");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(setColor());	
			}
		});
		add(btn,"south");
		setVisible(true);
	}
	public Color setColor() {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		return new Color(r,g,b);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
