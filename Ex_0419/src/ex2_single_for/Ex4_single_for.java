package ex2_single_for;

import java.util.Scanner;

public class Ex4_single_for {

	public static void main(String[] args) {
		
//		Scanner를 통해 정수 n1과 n2를 입력받는다.(Scanner)
//		n1부터 n2까지의 합을 계산하여 출력(for문)
//		n1의 값이 n2의 값보다 클 경우에는 작은 수부터 연산하도록 출력 해야 함 (if문, 스왑)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 값 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수 값 : ");
		int n2 = sc.nextInt();
		int sum = 0;
		
//		스왑(변수 두개의 값을 서로 교환)
		if (n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		} // if

		for (int i = n1; i <= n2; i++) {
			sum += i;
		} // for
		System.out.println(n1 + "부터  " + n2 + "까지의 합은 " + sum + "입니다.");
	}// main
}
