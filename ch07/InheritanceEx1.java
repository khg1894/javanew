package ch07;

class Car1 {
	int velocity;

	void speedup() {
		velocity++;
	}

	void speeddown() {
		velocity--;
		if (velocity < 0) {
			velocity = 0;
		}
	}

	void stop() {
		velocity = 0;
	}
}

class Taxi1 extends Car1 {
	@Override // Annotation ( Java 5.0부터 추가 됨)
	void speedup() {
		velocity += 5;
	}
}

class Bus1 extends Car1 {
	@Override
	void speedup() {
		super.speedup();
		if (velocity > 100) {
			velocity = 100;
		}
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		Taxi1 t = new Taxi1();
		t.speedup();
		System.out.println(t.velocity);
		Bus1 b = new Bus1();
		b.velocity = 110;
		b.speedup();
		System.out.println(b.velocity);
	}

}
