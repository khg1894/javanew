package ch06;

//별도의 클래스 선언 : ch06.Car1
//클래스 : 객체를 만드는 틀(ex-붕어빵 틀)
class Car1/* 클래스 명 */ {
	// 필드(변수):객체의 속성 (반드시 ()가 없다)
	String carName;
	int velocity;
	String carColor;

	// 메서드(사용자 지정함수) : 객체의 기능 (반드시 ()가 있다)
	void speedup() {
		velocity++;
	}// --class
	void speedDown() {
		velocity--;
		if(velocity<0)
			velocity=0;
	}
	void stop() {
		velocity = 0;
	}
}

public class CarEx1 {
//.java로 선언된 클래스만 public 사용가능
	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		//객체 생성 : new를 이용해서 객체를 생성한다
		Car1 c1;
		Car1 c2;

		c1 = new Car1();
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedup();
		
		c2 = new Car1();
		c2.carName = "마티즈";
		c2.carColor = "금색";
	
		
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
		
		System.out.println(c2.carName);
		System.out.println(c2.carColor);
		System.out.println(c2.velocity);
		for(int i =0;i<4;i++) {
			c2.speedup();
		}
		System.out.println(c2.velocity);
	}	
}