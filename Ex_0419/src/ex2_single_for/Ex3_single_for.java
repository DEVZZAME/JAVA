package ex2_single_for;

import java.util.Scanner;

public class Ex3_single_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수의 값을 입력하시오.");
		int n = sc.nextInt();
		int sum = 0; //1부터 입력 받은 값까지의 합을 더해서 저장할 변수
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		} // for
		
		System.out.println("1부터 정수 " + n + "까지의 값은 " + sum + "입니다.");
	}// main

}
