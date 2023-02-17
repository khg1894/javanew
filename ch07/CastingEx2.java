package ch07;

import java.util.Vector;

class Person2{
	String name;
	Person2(String name) {
		this.name = name;
	}
}

class Student2 extends Person2{
	String grade;
	public Student2(String name) {
		super(name);
	}
}
public class CastingEx2 {

	public static void main(String[] args) {
		Person2 p;
		Student2 s =new Student2("홍길동");
		p= s;//업캐스팅 발생
		System.out.println(p.name);
		System.out.println(s.name);
		Student2 s2;
		Person2 p2 = new Person2("홍길자");
		//s2=p2; 상위개체가 하위로 들어갈 수 없다.
		//s2 = (Student2)p2;//다운 캐스팅 실행시에 오류가 발생한다.
		Vector v = new Vector();
		String str = new String();
		Student2 s3 =new Student2("장동건");
		v.add(str);
		v.add(s3);
		String str1 = (String)v.get(0);
		Student2 s4 = (Student2)v.get(0);
	}

}
