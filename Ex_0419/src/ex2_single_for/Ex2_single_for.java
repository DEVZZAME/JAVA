package ex2_single_for;

import java.util.Scanner;

public class Ex2_single_for {

	public static void main(String[] args) {

		// Ű���忡�� 2~9 ������ ���� �Է� �޾� �Է¹��� ���� �ش�Ǵ� �������� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("2~9 ������ ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			if (num >= 10 || num <= 1) {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
				break;
			} // if
			System.out.println(num + " * " + i + " = " + num * i);
		} // for
	}// main
// ctrl+shift+f = ���� ���߱�(for �ڵ� ������)

}
