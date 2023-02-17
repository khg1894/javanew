package ch06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.util.Iterator;
import java.util.Random;

public class MyFrame extends MFrame {

	Random r;

	public MyFrame() {
		super(500, 500, new Color(255, 255, 255), false);
		r = new Random();
	}

	public void paint(Graphics g) {
		//g.setColor(Color.blue);// 색 지정을 먼저 해준다.
		// g.drawString("반갑습니다", 50, 50);
		for (int i = 0; i < 1000; i++) {
			g.setColor(rColor());
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			int w = r.nextInt(9) + 5;
			int h = r.nextInt(9) + 5;
			g.fillRect(x, y, w, h);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}

	public static void main(String[] args) {
		new MyFrame();

	}

}
