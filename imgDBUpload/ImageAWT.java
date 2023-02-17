package imgDBUpload;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

public class ImageAWT extends MFrame implements ActionListener{

	Button btn[] = new Button[3];
	String str[] = {"불러오기", "DB저장", "이미지확인"};
	FileDialog read;
	Image img;
	MyCanvas canvas;
	String filename;
	String dirfile;
	File file;
	ImageMgr mgr;
	Choice ch;
	
	public ImageAWT() {
		super(500,500);
		setTitle("ImageAWT");
		mgr = new ImageMgr();
		Panel p = new Panel();
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}
		ch = new Choice();
		ch.add("번호선택");
		Vector<Integer> vlist = mgr.getNumList();
		for (int i = 0; i < vlist.size(); i++) {
			ch.add(vlist.get(i).toString());
		}
		p.add(ch);
		p.setBackground(Color.ORANGE);
		add(p, BorderLayout.SOUTH);
		add(canvas = new MyCanvas());
		
		validate();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btn[0]) {
			if(read==null) {
				read = new FileDialog(this, "이미지열기" ,FileDialog.LOAD);
			}
			read.setVisible(true);
			try {
				filename = read.getFile();
				dirfile = read.getDirectory() + File.separator + filename;
				file = new File(dirfile);
				img = ImageIO.read(file);
				canvas.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(obj==btn[1]) {
			mgr.insertImg(file);
			img = null;
			canvas.repaint();
		}else if(obj==btn[2]) {
			int idx = Integer.parseInt(ch.getSelectedItem());
			if(idx==0)
				return;
			file = mgr.selectImg(idx);
			try {
				img = ImageIO.read(file);
				canvas.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	class MyCanvas extends Canvas{
		
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, this);
		}
		
	}
	
	public static void main(String[] args) {
		new ImageAWT();
	}

}
