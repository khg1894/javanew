package ch14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferdReaderEx1 {
	public static void main(String[] args) {
	//	InputStream is = System.in;
	//	InputStreamReader isr = new InputStreamReader(is);
	//BufferedReader br =new BufferedReader(isr);
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));//위 주석처리를 축소한것
		String s = "";
		while(true) {
			try {
				s = br.readLine();
				System.out.println("출력 : "+ s);
			} catch (Exception e) {
			}
		}
	}
}
