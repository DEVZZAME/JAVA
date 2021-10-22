package ex4_work;

import java.util.Scanner;

public class Ex3_work {

	public static void main(String[] args) {

		// 키보드에서 정수를 입력 받고, 입력 받은 수가 소수인지 아닌지를 판단하시오.
		// 소수(약수가 1과 나 자신만 존재하는 수)

		Scanner sc = new Scanner(System.in);
		System.out.print("수 : ");
		int n = sc.nextInt();

		int i = 0;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			System.out.println(n + "(은)는 소수가 맞습니다!");
		} else {
			System.out.println(n + "(은)는 소수가 아닙니다~");
		}
	}

}
