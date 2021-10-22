package ex2_single_for;

import java.util.Scanner;

public class Ex5_single_for {

	public static void main(String[] args) {

//		피보나치 수열 만들기
		
		
//		반복횟수 : 6 = int n
//		키보드에서 6이라는 정수를 입력 받으면
//		1 1 2 3 5 8 가 출력
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수 : ");
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			num2=num3;
			num3=num1;
			num1=num2+num3;
			
			System.out.print(num3+ " ");
		}//for
		
	}//main

}
