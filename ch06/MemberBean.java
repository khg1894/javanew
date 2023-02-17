package ch06;

public class MemberBean {
	private String id;
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id; //this.id는 위에있는 필드로 지정되어있는 id라는 변수를 뜻한다.
							//메소드안의 id 를 객체 속성으로 꺼내서 쓴다
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


}
