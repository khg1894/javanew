package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

public class GridLayoutEx2 extends MFrame {

	String s[] = {"add","remove","removeall","exit"};
	Button []btn = new Button[4];//버튼에 글자 추가 가능하도록 선언
	public GridLayoutEx2 () {
		setLayout(new BorderLayout());
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(s[i]);//각 버튼에 s배열의 글자 추가
			p.add(btn[i]);//패널에 버튼을 추가
		}
		add(p, BorderLayout.EAST);//패널은 오른쪽에 배치하는걸로 추가
		validate();
	}
	
	public static void main(String[] args) {
		new GridLayoutEx2();
	}

}
