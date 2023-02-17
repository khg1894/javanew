package ch11;

class point2{
	int x,y;
	public point2(int x,int y) {
		this.x = x;
		this.y =y ;
	}
	@Override
	public String toString() {
		return "("+x+"," + y + ")" ;
	}
}
public class ObjectEx2 {
	public static void main(String[] args) {
		point2 p = new point2(10, 20);
		System.out.println(p);
	}

}
