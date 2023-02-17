package ch07;

//추상 틀래스 : 도형
abstract class shape {
	int x, y;

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract void draw();
}

//삼각형
class Triangle extends shape {
	@Override
	void draw() {System.out.println("삼각형 그리기");
	}
}
//사각형
class Rectangle extends shape {
	@Override
	void draw() {System.out.println("사각형 그리기");
	}
}
//원
class Circle extends shape {
	@Override
	void draw() {System.out.println("원 그리기");
	}
}
public class AbstractEx4 {
	public static void main(String[] args) {

	}

}
