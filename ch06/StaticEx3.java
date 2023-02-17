package ch06;

import common.util.StringUtil;

class Static3{
	//static 필드는 동일한 클래스의 모든 객체가 공의 목적으로 하나의 메모리에 만들어 진다.
	static int a;
	int b;
}
public class StaticEx3 {
	public static void main(String[] args) {
		Static3 st1= new Static3();
		Static3 st2= new Static3();
		st1.b=10;
		st2.b=20;
		System.out.println(st1.b);
		System.out.println(st2.b);
		
		st1.a=10;
		st2.a=20;
		System.out.println(st1.a);
		System.out.println(st2.a);
	String str = "1000000000000000";
	System.out.println(StringUtil.addComma(str));
	}
}
/*결과값
10
20
20 static변수는 메모리가 하나만 생성되기 때문에 st1.a에서 메모리에 10이라는 값이 들어갔다가 st2.a에서 20이라는 값으로 덮어 씌워진다
st1.b 와 st2.b의 경우 각 각별도의 메모리가 생성되어 값이 다르게 들어가지만 a라는 변수는 하나의 값만 저장한다
20

 * */
