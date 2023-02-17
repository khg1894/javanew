package awt;

import java.awt.Label;
import java.util.Iterator;


public class LabelEx1 extends MFrame {

	Label label[] = new Label[4];
	int pos[] = {Label.LEFT,Label.CENTER,Label.RIGHT,Label.LEFT};

	public LabelEx1() {
		super(200, 200);
		//setResizable(true);
		setTitle("Label Example");
		String str = "오늘은 즐거운 수요일";
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(str, pos[i]);
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		validate();//새로고침: for문이 돌아가는 과정이 결과로 출력되는 경우 새로고침을 통해 최종 결과물이 출력되도록한다.
	}

	public static void main(String[] args) {
		new LabelEx1();
	}
}
