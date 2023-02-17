package ch11;


public class PalindromeEx1 {

	static final int MAX = 100000;

	public static void main(String[] args) {
		
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */

		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			String decimal = Integer.toString(i);
			StringBuffer str = new StringBuffer(decimal);
			String reversestr = str.reverse().toString();
			if (reversestr.equals(decimal)) {
				sum += i;
			}
		}
		System.out.println(sum);
		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int sum2 = 0;
		for (int i = 0; i < MAX; i++) {
			String binary = Integer.toBinaryString(i);
			StringBuffer str = new StringBuffer(binary);
			String reversestr = str.reverse().toString();
			if (reversestr.equals(binary)) {
				sum2 += i;
			}
		}
		System.out.println(sum2);

		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int sum3 = 0;
		for (int i = 0; i < MAX; i++) {
			String decimal = Integer.toString(i);
			StringBuffer str1 = new StringBuffer(decimal);
			String reversestr1 = str1.reverse().toString();
			String binary = Integer.toBinaryString(i);
			StringBuffer str2 = new StringBuffer(binary);
			String reversestr2 = str2.reverse().toString();
			if (reversestr1.equals(decimal) && reversestr2.equals(binary)) {
				sum3 += i;
			}
		}
		System.out.println(sum3);

	}

}
