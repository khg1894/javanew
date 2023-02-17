package ch14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx3 {//pdf, ppt 같은 이미지가 포함되어있는 파일의 경우 바이트 단위로 읽어서 와야한다.

	public static void copyFileByStream(String sourcePath, String targetPath) {
		File source = new File(sourcePath);// sourcePath의 파일명을 가진 객체 생성
		File target = new File(targetPath);
		if (!source.exists()) {// 지정된 파일명을 가진 객체가 없을때
			return;// 브레이크 역할, 소스가 없을 경우 패스하는 기능
		}
		if (!target.getParentFile().exists()) {
			target.getAbsoluteFile().mkdirs();
			// target.getAbsoluteFile().mkdir();
		}
		try {
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			int temp = 0;
			byte[] data = new byte[1024];
			while ((temp = is.read(data)) != -1) {
				os.write(data, 0, temp);
			}
			os.close();
			is.close();
			System.out.println("Copy End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		copyFileByStream("ch14/aaa.pdf", "ch14/bbb.pdf");
	}
}
