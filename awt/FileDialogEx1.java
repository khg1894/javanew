package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogEx1 extends MFrame 
implements ActionListener{
	
	FileDialog openFile, saveFile;
	Button openBtn,saveBtn;
	public FileDialogEx1() {
		openFile = new  FileDialog(this, "파일열기",
				FileDialog.LOAD);//
		saveFile = new FileDialog(this, "파일저장",
				FileDialog.SAVE);
		Panel p =new Panel();
		p.add(openBtn = new Button("파일 열기"));
		p.add(saveBtn = new Button("파일 저장"));
		add(p);
		openBtn.addActionListener(this); //작동했을때의 변환사항을 넘겨주기위한 사전준비
		saveBtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==openBtn) {//이벤트 발생시킨 소스를 가져온다. 어느버튼을 클릭했는지 확인
			openFile.setVisible(true);//위에서 선언한 openFile 과 openBtn을 여기서 엮어준다.
		}else if(e.getSource()==saveBtn) {
			saveFile.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new FileDialogEx1();

	}
}
