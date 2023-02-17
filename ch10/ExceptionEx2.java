package ch10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[0] =10;
			arr[1] =10;
			arr[2] =10;
			arr[3] =10;//이 시점에서 예외가 발생해서 catch로 넘어간다
			System.out.println("실행 되나요.");
		} catch (Exception e) {
			System.out.println("배열 예외입니다.");
		}
	}
}
