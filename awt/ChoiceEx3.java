package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener {
	Choice name, star;
	String ms[] = { "현 빈", "원 빈", "이민호", "김수현", "김우빈", "이종석" };
	String fs[] = { "고아라", "이연희", "이하늬", "문채원", "수 지", "김연아" };

	public ChoiceEx3() {
		name = new Choice();
		name.add("남자 연예인");
		name.add("여자 연예인");
		star = new Choice();
		for (int i = 0; i < ms.length; i++) {
			star.add(ms[i]);
		}
		add(name);
		add(star);
		name.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (name.getSelectedItem() == "여자 연예인") {
			inputItem(star, fs);
		} else if (name.getSelectedItem() == "남자 연예인"){
			inputItem(star, ms);
		}
	}

	public static void main(String[] args) {
		new ChoiceEx3();
	}

	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);

		}
	}

}
