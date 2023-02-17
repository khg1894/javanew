package ch10;

public class ExceptionEx6 {
	public static void main(String[] args) {
		try {//종착지이며 이전에 throws를 통해 보내진걸 try, catch를통해 마무리한다
			exce3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void exce1() throws Exception {//throws 를 통해 다음으로 처리를 넘긴다 exce1 => exce2
	}

	public static void exce2() throws Exception{//throws 를 통해 다음으로 처리를 넘긴다 exce2 => exce3
		exce1();
	}

	public static void exce3() throws Exception{
		exce2();
	}

}
