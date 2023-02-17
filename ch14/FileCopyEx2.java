package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	MFrame frame;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			openDialog = new FileDialog(frame,"파일열기",FileDialog.LOAD);
			openDialog.setDirectory("C:");
			openDialog.setVisible(true);
			fileReader(openDialog.getDirectory()+openDialog.getFile());
		}else if(obj==save) {
			saveDialog = new FileDialog(frame,"파일저장",FileDialog.SAVE);
			saveDialog.setDirectory("C:");
			saveDialog.setVisible(true);
			try {
				for (int i = 5; i > 0; i--) {
					ta.setText("저장하였습니다."+i+"초 후에 사라집니다.");
					Thread.sleep(1000);
				}
			} catch (Exception e2) {
			}
			ta.setText("");
			fileWriter(saveDialog.getDirectory()+saveDialog.getFile());

		}
	}
	
	//선택된 파일의 내용이 ta에 append 해야함
	public void fileReader(String file){
		try {
			FileReader fr = new FileReader(file); 
			int a; 
			while((a = fr.read()) != -1) {
				ta.append(String.valueOf((char)a));
			}
			fr.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	//ta에 오픈된 텍스트를 지정한 파일로 저장 해야함
	public void fileWriter(String file){
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(ta.getText());
			fw.flush();//write를 통해 작성한 이후에 닫는과정이 포함되어야 정상 작동한다.
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();//오류 출력
		}
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}










