package ch04;

public class Ex11 {

	public static void main(String[] args) {
		for(int i =1;i<11;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println("-------------------------");
		for(int i =1;i<11;i++) {
			if(i%2!=0) {
				continue;
			}
		}
		//1~20사이에 3의 배수와 합을 출력하시오.
		int sum=0;
		for(int i =1;i<20;i++) {
			if(i%3!=0) {
				continue;
			}
			else {
				sum+=i;
				System.out.print(i);
				if(i==18) {
					continue;
				}
				System.out.print("+");
			}
		}
		System.out.println("="+sum);

	}

}
