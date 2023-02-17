package ch09;

import ch09.outer1.inner2;

class outer2{
	int a =22;
	void p() {
		System.out.println("a="+a);
		//System.out.println("a+b=" + (a+b));내부에서 외부의 변수를 가져올 수는 있지만 외부에서 내부 변수를 가져올 수는 없다.
		//내부클래스는 외부클래스 내에서만 일반적을 사용을 하고
		//상당히 밀접한 관계가 있는 기능의 클래스로 선언
	}
	class inner2{//내부 클래스는 외부 클래스의 메소드, 변수 등을 가져와서 사용이 가능하다
		int b =23;
		void p1(){
			p();//외부 메소드
			System.out.println("a+b=" + (a+b));//int 앞에 문자가 있으면 int인 변수도 문자로 변해서 괄호처리함으로써해결
		}
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		//일반적으로 내부 클래스는 다른 클래스에서 생성하고 사용하는 것은 거의 없음
		//제 3의클래스에 사용범
		outer2 out = new outer2();//외부클래스를 먼저 선언하고
		outer2.inner2 in = out.new inner2();//내부클래스 객체선언
		in.p1();//내부클래스 객체의 메소드 실행
		

	}
}
