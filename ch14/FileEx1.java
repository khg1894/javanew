package ch14;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		File f= new File("ch14/FileEx1.java");//특정경로에 있는 파일을 f 라는 객체로 생성
//		System.err.println(f.exists());//f 객체로 지정한 파일이 존재할 시에 true 반환
		
		if(f.exists()) {
			System.err.println("파일이름 "+f.getName());
			System.err.println("상대경로 "+f.getPath());
			System.err.println("절대경로 "+f.getAbsolutePath());
			System.err.println("쓰기가능 "+f.canWrite());
			System.err.println("읽기가능 "+f.canRead());
			System.err.println("파일크기 "+f.length()+"byte");
		}else {
			System.err.println("파일이 존재하지 않습니다.");
		}
	}
}
