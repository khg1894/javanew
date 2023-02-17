package ch06;

class Car3 {
	String carName;
	int velocity;
	String carColor;

	void speedup() {
		velocity++;
	}

	void speedDown() {
		velocity--;
		if (velocity < 0)
			velocity = 0;
	}
}

public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		c1.carName = "아반떼";
		c2.carName = "소나타";
		System.out.println("c1 : "+c1.carName);
		System.out.println("c2 : "+c2.carName);
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		
		c2 =c1;/*참조형의 '='은 call by reference 방식이다. c2에게 c1값을 집어넣는다*/
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		System.out.println("c1 : "+c1.carName);
		System.out.println("c2 : "+c2.carName);
		c1.carName = "그렌저";

		System.out.println("c1 : "+c1.carName);
		System.out.println("c2 : "+c2.carName);
		
		int a = 10;
		int b = a;
		a=20;
		System.out.println(a+b);
	}

}
