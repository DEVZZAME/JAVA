package ex2_single_for;

import java.util.Scanner;

public class Ex2_single_for {

	public static void main(String[] args) {

		// 키보드에서 2~9 사이의 값을 입력 받아 입력받은 값에 해당되는 구구단을 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("2~9 사이의 숫자를 입력하세요");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			if (num >= 10 || num <= 1) {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
				break;
			} // if
			System.out.println(num + " * " + i + " = " + num * i);
		} // for
	}// main
// ctrl+shift+f = 라인 맞추기(for 코드 가독성)

}
