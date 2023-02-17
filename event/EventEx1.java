package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import awt.BorderLayoutEx1;

//2.버튼을 클릭하면 ActionEvent 이벤트 객체 발생
//이벤트 소스와 ActionEvent 객체를 연결하기 위한 ActionListener를 구현
public class EventEx1 extends MFrame 
implements ActionListener{
	
	
	//1.이벤트 소스 생성
	Button btn;
	public EventEx1() {
		add(btn = new Button("버튼"),
				BorderLayout.SOUTH);
		//4.이벤트 소스와 이벤트 핸들러 연결(addxxxListener)
		btn.addActionListener(this);
		validate();
		
	}
	//3.이벤트리스너의 메소드(이벤트 핸들러)구현
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	public static void main(String[] args) {
		
		new EventEx1();
		}
}
