package ch12;
/*
 * 1.쓰레드 기능
 * 2.9개의 프레임 실행
 * 3.3열 3행의 위치에 세팅, 각 크기는 200*200
 * 4.원 색상은 랜덤색
 * */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RunnableFrameEx3 extends MFrame
implements Runnable{
	
	Random r = new Random();
	int x ,y;
	int local_x,local_y;
	Color c;
	int cr,cg,cb;
	public RunnableFrameEx3(int local_x, int local_y ) {
		super(200,200,local_x,local_y);
		//그냥 슈퍼 쓰고 setlocation하면 되는거임
		//이미 MFrame 단계에서 Frame포함하고 있어서 별도로 객체 선언 없이 setlocation사용해야함
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			x=r.nextInt(300);
			y=r.nextInt(300);
			cr = r.nextInt(255);
			cg = r.nextInt(255);
			cb = r.nextInt(255);
			try {
					Thread.sleep(500);
					repaint();
			} catch (InterruptedException e) {}
		}
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(c = new Color(cr,cg,cb));
		g.fillOval(x, y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	
	
	public static void main(String[] args) {
		RunnableFrameEx3[] r = new RunnableFrameEx3[9];
		for (int i = 0; i < 9; i++) {
			int x1 = 200+(200*(i%3));//0,1,2
			int y1 = 200+(200*(i/3));//3개 출력후 한칸씩 밑으로 보냄
			r[i] = new RunnableFrameEx3(x1, y1);
			new Thread(r[i]).start();//이렇게 만들어도 동시 실행가능함
		}
//		RunnableFrameEx3 r1= 
//				new RunnableFrameEx3(300,300);
//		RunnableFrameEx3 r2= 
//				new RunnableFrameEx3(300,500);
//		RunnableFrameEx3 r3= 
//				new RunnableFrameEx3(300,700);
//		RunnableFrameEx3 r4= 
//				new RunnableFrameEx3(500,300);
//		RunnableFrameEx3 r5= 
//				new RunnableFrameEx3(500,500);
//		RunnableFrameEx3 r6= 
//				new RunnableFrameEx3(500,700);
//		RunnableFrameEx3 r7= 
//				new RunnableFrameEx3(700,300);
//		RunnableFrameEx3 r8= 
//				new RunnableFrameEx3(700,500);
//		RunnableFrameEx3 r9= 
//				new RunnableFrameEx3(700,700);
//
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		Thread t3 = new Thread(r3);
//		Thread t4 = new Thread(r4);
//		Thread t5 = new Thread(r5);
//		Thread t6 = new Thread(r6);
//		Thread t7 = new Thread(r7);
//		Thread t8 = new Thread(r8);
//		Thread t9 = new Thread(r9);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		
	}

}
