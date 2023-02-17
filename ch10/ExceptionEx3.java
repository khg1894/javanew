package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		Scanner s= null;
		try {
			int a,b;
			s = new Scanner(System.in);
			System.out.println("첫번째 숫자 :");
			a=s.nextInt();
			System.out.println("두번째 숫자 :");
			b=s.nextInt();
			System.out.println(a+"/"+b+"="+(a/b));
		} catch (ArithmeticException e) {//다중 catch일때는 하위 Exception 즉 세밀한 예외조건이 위로와야한다.
			System.out.println("0으로 입력하면 안되요");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야합니다");
		} finally {
			s.close(); //try에서 선언한건 다른 곳에서는 작동안됨, Scanner선언 후에는 닫아주는 과정이 필요 
		}
	}
}
