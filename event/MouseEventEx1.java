package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx1 extends MFrame implements MouseListener, ActionListener {

	TextField tf;
	TextArea ta;
	Button bt1, bt2, bt3;
	
	
	public MouseEventEx1() {
		super(400, 500);
		setTitle("MouseEventEx1");
		tf = new TextField("안녕하세요!!!", 30);
		ta = new TextArea();
		bt1 = new Button("마우스시험용");
		bt2 = new Button("인사하기");
		bt3 = new Button("종료");
		Panel p1 = new Panel(); //버튼 위치를 묶기위한 패널 지정
		
		//패널에 버튼 추가
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		
		//텍스트 필드 위치 지정을 위한 패널
		Panel p2 = new Panel();
		p2.add(tf);//패널2에 텍스트 필드 추가
		add(p1, BorderLayout.SOUTH);//보더레이아웃이 있어야 위치 지정 가능
		add(p2, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);//텍스트 에리어는 패널에 따로 넣지않고 위치 지정
		//클릭이나 엔터에 반응하는건 addActionListener를 사용 마우스의 호버링이나 클릭 등에 반응하는건 mouseListener
		tf.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt1.addMouseListener(this);
		validate();//새로 고침, 안될때는 있는지 없는지 확인해봅시다
		
	}
	//위에서 임플리먼트 후에 오버라이드해서 사용 
	//오버라이드 내부에서는 위에서 addActionListener로 지정한 객체들이 작동했을 때 그에 맞는 반응하도록설정
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==tf){
			ta.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
		}else if(o==bt2){
			ta.append("인사하기 버튼을 눌렀군요.\n");
		}else if(o==bt3){
			setVisible(false);
			System.exit(0);;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {//클릭 과정이 완료되었을때 
		ta.append("##mouseClicked\n");
	}

	@Override
	public void mousePressed(MouseEvent e) {//지정한 패널이나 버튼위에서 마우스가 클릭되었을 때
		ta.append("##mousePressed\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {//지정한 패널이나 버튼위에 올라온 마우스가 떼어졌을때
		ta.append("##mouseReleased\n");
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {//마우스가 들어왔을 때
		ta.append("##mouseEntered\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {//지정한 패널이나 버튼위에 마우스가 나갔을 때 감지
		ta.append("##mouseExited\n");
	}

	public static void main(String[] args) {
		new MouseEventEx1();
	}

}
