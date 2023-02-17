package ch06;

class Method3{
	void prn(int...arr) {
		for(int i =0 ;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
}
public class MethodEx3 {

	public static void main(String[] args) {
		Method3 mt = new Method3();
		mt.prn(1);
		mt.prn(1,2);
		mt.prn(1,2,3);
		mt.prn(1,2,3,4);
		mt.prn(1,2,3,4,5);
	}

}
