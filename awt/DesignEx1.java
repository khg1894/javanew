package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;

public class DesignEx1 extends MFrame {

	Label label;
	Checkbox cb1,cb2,cb3;
	CheckboxGroup cbg;
	Button btn1,btn2;
	String fruit[] = { "사과", "딸기", "앵두" };
	String str[] = { "start", "end" };

	public DesignEx1() {
		super(250, 150);
		setLayout(new BorderLayout());
		Panel p1,p2,p3;
		setTitle("디자인 예제1");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p1.add(label = new Label("과일중에선택", Label.CENTER));
		p1.setBackground(MColor.rColor());
		add(p1,BorderLayout.NORTH );
		cbg = new CheckboxGroup();
		add(cb1 = new Checkbox("라디오1", cbg, true));
		add(cb2 = new Checkbox("라디오2", cbg, true));
		add(cb3 = new Checkbox("라디오3", cbg, true));
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		add(p2,BorderLayout.LINE_END);
		p3.add(btn1 = new Button("start"));
		p3.add(btn2 = new Button("end"));
		add(p3, BorderLayout.SOUTH);
		
		
		validate();



		
		
//		for (int i = 0; i < btn.length; i++) {
//			btn[i] = new Button(str[i]);
//			add(BorderLayout.SOUTH,btn[i]);
//		}

	}

	public static void main(String[] args) {
		new DesignEx1();
	}

}
