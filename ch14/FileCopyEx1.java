package ch14;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;

public class FileCopyEx1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("원본 파일 :  ");
			String sFile = sc.nextLine();
			System.out.println("복사 파일 :  ");
			String cFile = sc.nextLine();
			FileReader fr = new FileReader("ch14/"+sFile);
			
			//파일 생성 역할
			FileWriter fw = new FileWriter("ch14/" +cFile);
			int a;
			while((a=fr.read())!=-1) {
				System.out.println(a);
				fw.write((char)a);
			}
			fw.close();
			fr.close();
			System.out.println("Copy End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
