package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			FileReader fr =  myRead("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static FileReader myRead(String name) 
			throws FileNotFoundException { //아래 메소드 실행중에 예외(파일을 찾을 수 없음)가 발생한다면 
		FileReader fr = new FileReader(name);
		return fr;
	}

}
