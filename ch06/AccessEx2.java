package ch06;

class Access2 {

	private int a = 0;
	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0)
			age = 0;
		this.age = age;
	}
}

public class AccessEx2 {
	public static void main(String[] args) {
		Access2 ac = new Access2();
	//	ac.a = 10;
	}
}
