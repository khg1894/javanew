package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx2 extends MFrame {

	Button move;

	public KeyEventEx2() {
		super(400, 500, new Color(100, 200, 100));
		setLayout(null);
		move = new Button("move");
		move.setBounds(200, 250, 50, 30);
		move.addKeyListener(new KeyAdapter() {// Adapter는 내부에서 오버라이드가 완료된 상태이기때문에 필요한 생성자만 받아사용하면된다.
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();// up38,right39, left37, down40
				String txt = KeyEvent.getKeyText(code);
//				System.out.println(code + ":" + txt);
				int x = move.getX();
				int y = move.getY();
				int width = move.getWidth();
				int height = move.getHeight();
				System.out.println(x);
				System.out.println(y);
				
				if (txt.equals("Right")) {
					x += 5;
				} else if (txt.equals("Left")) {
					x -= 5;
				} else if (txt.equals("Up")) {
					y -= 5;
				} else if (txt.equals("Down")) {
					y += 5;
				}
				if (x + width >= getWidth()){
					return;
				}else if (y + height >= getHeight()){
					return;
				}else if (x <0){
					return;
				}else if(y<height) {
					return;
				}
				
				move.setLocation(x, y);
			}
		});
		add(move);
		move.requestFocus();
		validate();
	}

	public static void main(String[] args) {
		new KeyEventEx2();

	}

}
