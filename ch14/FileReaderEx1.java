package ch14;

import java.io.FileReader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch14/aaa.txt");   // ch14패키지 안에 있는 .. aaa.txt를 읽어와 ! 
			int a; 
			while((a = fr.read()) != -1) {
				System.out.println((char)a);
			}
			fr.close();
			System.out.println("End~~");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
