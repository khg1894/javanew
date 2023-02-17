package graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawAllEx1 extends MFrame
implements ActionListener{
	Panel p1,p2;
	int mode=1/*0-선,1-사각형,2-원*/,color;
	Label l[];
	Checkbox fillcb;
	Checkbox cb[] = new Checkbox[3];
	CheckboxGroup cbg;
	TextField tf[];
	Button b[] = new Button[4];
	Button btn;
	MCanvas canvas;
	String sl[] = {"선","사각형","원","랜덤색"};
	String cl[] = {"R","G","B"};
	String ll[] = {"X1","Y1","X2","Y2 "};
	String rl[] = {"X","Y","W","H "};
	String ol[] = {"X","Y","너비","높이"};
	
	public DrawAllEx1() {
		super(600,300);
		setTitle("선그리기");
		makeAWT();
		p1 = new Panel();//버튼 위치 형성
		p1.setLayout(new GridLayout(4,1));
		for (int i = 0; i < b.length; i++) {
			p1.add(b[i]);
		}
		add(p1,BorderLayout.EAST);
		p2.setBackground(Color.yellow);//p2는 하단에 위치하는 패널
		for (int i = 0; i < l.length; i++) {
			p2.add(l[i]);
			p2.add(tf[i]);
		}
		for (int i = 0; i < cb.length; i++) {
			p2.add(cb[i]);
		}
		p2.add(btn);
		selectPanel(mode);
		add(p2,BorderLayout.SOUTH);
		add(canvas = new MCanvas());
		validate();
	}
	public void selectPanel(int mod) {
		setTitle(sl[mode]+"그리기");
		switch(mode) {
		case 0:
			p2.setBackground(Color.YELLOW);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(ll[i]);
				l[i].setBackground(Color.YELLOW);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.YELLOW);
			}
			p2.remove(fillcb);
			break;
		case 1:
			p2.remove(fillcb);
			p2.setBackground(Color.PINK);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(rl[i]);
				l[i].setBackground(Color.PINK);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.PINK);
			}
			p2.add(fillcb,8);
			break;
		case 2:
			p2.remove(fillcb);
			p2.setBackground(Color.CYAN);
			for (int i = 0; i < l.length; i++) {
				l[i].setText(ol[i]);
				l[i].setBackground(Color.CYAN);
			}
			for (int i = 0; i < cb.length; i++) {
				cb[i].setBackground(Color.CYAN);
			}
			p2.add(fillcb,8);
			break;
			
		
		
		}
	}
	public void makeAWT(){
		p1 = new Panel();
		p2 = new Panel();
		l = new Label[4];
		for (int i = 0; i < l.length; i++) {
			l[i] = new Label();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(sl[i]); 
			b[i].addActionListener(this); 
		}
		tf = new TextField[4];
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField("30",3);
		}
		fillcb = new Checkbox("채우기");//채우기 기능을 포함할 체크박스
		cbg = new CheckboxGroup();
		for (int i = 0; i < cb.length; i++) {
			cb[i]=new Checkbox(cl[i],cbg,false);
		}
		btn = new  Button("그리기");
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		for (int i = 0; i < b.length; i++) {
			if(obj == b[i]) {
				mode=i;
				selectPanel(mode);
				break;
			}
		}//--for
		if(obj == b[3]/*랜덤일때*/) {
			
		}else if(obj == btn/*그리기 버튼*/) {
			/*채우기, RGB(color)*/
			Checkbox cbx= cbg.getSelectedCheckbox();
			for (int i = 0; i < cb.length; i++) {
				if(cbx == cb[i]) {
					color =i;
					break;
				}
			}
			canvas.repaint();
		}
	}
	
	class MCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			
			//4개의 tf의 값을 정수형으로 리턴
			int i[] = new int[4];
			for (int j = 0; j < i.length; j++) {
				i[j] = Integer.parseInt(tf[j].getText());
			}
			//color : 0(R),1(G),2(B)세팅
			switch(color) {
			case 0:g.setColor(Color.red);
			break;
			case 1:g.setColor(Color.green);
			break;
			case 2:g.setColor(Color.blue);
			break;
			
			}
			//mode : 0:선그리기 ,1: 사각형(채우기),2:원 그리기(채우기)
			switch(mode) {
			case 0:
				g.drawLine(i[0], i[1], i[2], i[3]);
				break;
			case 1:
				g.drawRect(i[0], i[1], i[2], i[3]);
				if(fillcb.getState()) {
					g.fillRect(i[0], i[1], i[2], i[3]);	
				}
				break;
			case 2:
				g.drawOval(i[0], i[1], i[2], i[3]);
				if(fillcb.getState()) {
					g.fillOval(i[0], i[1], i[2], i[3]);	
				}
			}
		}
	}
	public static void main(String[] args) {
		new DrawAllEx1();
	}
	
}
	




