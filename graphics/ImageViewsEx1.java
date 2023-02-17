package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//사진을 가져올때 class파일과 image 파일이 동일한 경로에 존재해야 한다.
public class ImageViewsEx1 extends MFrame {
	Image img;
	public ImageViewsEx1() {
		super(500,300);
		img = Toolkit.getDefaultToolkit().getImage("graphics/aaa.png");
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewsEx1();
	}

}
