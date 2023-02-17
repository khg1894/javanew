package ch06;
//클래스 선언 ->필드&메서드 ->객체생성(new, 필드 및 메서드 사용)
class Car2{

	String name;
	int speed;
	int gear;
	
	void stop() {
		speed=0;
	}
}
public class CarEx2 {

	public static void main(String[] args) {
		int a =10;
		int b=a+10;

		for(int i =0;i<100;i++) {
			Car2 c1 = new Car2();
//			System.out.println(c1.toString());
			//요청값 소문자 -> 대문자 출력
			String s ="asdfaddrR";
			System.out.println(s.toUpperCase());//대문자로변환
		}		
		int c = 32;
		String binaryString = Integer.toBinaryString(c);
		System.out.print(binaryString);
		
	}

}
