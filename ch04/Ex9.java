package ch04;

public class Ex9 {

	public static void main(String[] args) {
		// while문을 이용해서 1~10까지 합을구하시오

		int sum=0;
		int i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		System.out.println("sum : "+sum);
		
		while(true) {
			System.out.println("while문 실행");
			if(true) {
				break;
			}
		}
		do {
			System.out.println("do문은 무조건 한번만실행");
		}while(true);
	}

}
