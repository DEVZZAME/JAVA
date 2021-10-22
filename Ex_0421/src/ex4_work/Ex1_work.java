package ex4_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		//키보드에서 정수를 두 개 입력받아서 두 수의 최소공배수를 구하기
		
		//수1 : 4
		//수2 : 6
		//최소공배수 : 12
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
			for(int i=1; i<=n1*n2; i++) {
				
				if(i%n1==0 && i%n2==0) {
					System.out.println(i);
					break;
				}
				
			}
			
			
//				소수 *(n1/소수의 몫*n2/소수의 몫)
//					i==n > 소수
//					i!=소수아님
		
	}//main

}
