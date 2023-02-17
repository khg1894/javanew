package ch07;

class A4{
}
class B4{
}
//class C4 extends A4,B4{ 오류 C4가 한번에 2개를 상속할 수는 없다
//}

//인터페이스에서는 가능하다
interface D4{};
interface E4{};
interface F4 extends D4,E4{};//동시 2개 상속가능

public class InheritanceEx4 {

	public static void main(String[] args) {

	}

}
