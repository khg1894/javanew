package ch06;

class Constructor4 {
	int a;
	String str;

	public Constructor4() {
		// 중복된 기능
	}

	public Constructor4(int i) {
		a = i;
		// 중복된 기능
	}

	public Constructor4(String s) {
		str = s;
		// 중복된 기능
	}
}

class Constructor5_1 {
	int a;
	String str;

	public Constructor5_1() {
//중복된 기능
	}

	public Constructor5_1(int i) {
		//this는 자신으 디폴트 생성자 호출. 반드시 생성자에 첫번째 라인에 위치, spuer 동시사용 불가
		this();
		a = i;
	}

	public Constructor5_1(String s) {
		this();
		str = s;
	}
}

public class constructorEx4 {

	public static void main(String[] args) {

	}

}
