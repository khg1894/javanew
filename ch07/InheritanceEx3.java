package ch07;

class Car3 {
	public Car3() {
		super();
	}

	void speedup() {

	}
}

class Taxi3 extends Car3 {
	void stop() {

	}
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		Object obj = new Car3();
		//obj.speedup(); 오류 오브젝트라는 상위 개체가 하위인 Car3를 호출하여 객체를 생성할 수는있지만 Car3의 메소드는 활용불가능하다 
		Car3 c = new Taxi3();
		//Taxi3 t =new Car3(); 오류
		c.speedup();
	}

}
