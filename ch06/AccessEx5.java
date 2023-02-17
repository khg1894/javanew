package ch06;

import java.awt.Color;
import java.awt.Graphics;

public class AccessEx5 extends MFrame {
	
	public AccessEx5() {
		super(500, 500, new Color(255, 255, 255), false);
	}
	

	public void paint(Graphics g) {
		// g.setColor(Color.blue);// 색 지정을 먼저 해준다.
		g.drawString(paramString(), 50, 50);

	}

	@Override
	protected String paramString() {
		return super.paramString();
	}

	public static void main(String[] args) {
		new AccessEx5();

	}
}
