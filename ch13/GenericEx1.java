package ch13;

class Box1{
	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}

class Box2<T>{
	private T data;
	public void set(T data) {this.data = data;}
	public T get() {
		return data;
	}
}
public class GenericEx1 {
	public static void main(String[] args) {
		Box1 b= new Box1();
		b.set(Integer.valueOf(22));
		Integer i = (Integer)b.get();
		b.set("하하");
		Integer i2 = (Integer)b.get();
		Box2<String> b2 = new Box2<String>();
		b2.set("하하");
		//b2.set(Integer.valueOf(23)); 위에서 b2의 타입을 String으로 지정했기에 오류가 발생한다.
		
	}

}
