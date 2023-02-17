package ch05;
import java.util.Iterator;
public class Ex2 {
	public static void main(String[] args) {
		//다차원 배열 : n차 만큼 for문이 존재한다.
		int arr[][] = new int[2][3];
		for (int i = 0; i < arr.length; i++) { //arr.length는 1차배열의 크기 즉 2
			for (int j = 0; j < arr[i].length; j++) { //arr[i].length는 각 1차배열마다의 크기 즉 3
				arr[i][j] = i+j;
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		//문제1 arr2의 모든값의 합을 구하시오
		int sum1=0;
		int arr2[][] = {{1,2},
				{3,4,5},
				{6},
				{1,2,3,4},
				{2,3,4}
				};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum1 = sum1 + arr2[i][j];
			}
		}
		System.out.println("총합 : " + sum1);
		//문제2 arr3의 평균을 구하시오.
		double avr =0, b=0;
		double sum2 = 0;
		double arr3[][] = {{1.0},
				{2.3,3.4},
				{4.5,6.2,4.3},
				{9.0}
				};
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				sum2 = sum2 + arr3[i][j];
			}
			b= b+arr3[i].length;
		}
		avr = sum2/b;
		System.out.println("평균 : "+sum2/b);	
	}
}