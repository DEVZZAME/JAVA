package ex2_single_for;

import java.util.Scanner;

public class Ex4_single_for {

	public static void main(String[] args) {
		
//		Scanner�� ���� ���� n1�� n2�� �Է¹޴´�.(Scanner)
//		n1���� n2������ ���� ����Ͽ� ���(for��)
//		n1�� ���� n2�� ������ Ŭ ��쿡�� ���� ������ �����ϵ��� ��� �ؾ� �� (if��, ����)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �� : ");
		int n1 = sc.nextInt();
		System.out.print("�ι�° ���� �� : ");
		int n2 = sc.nextInt();
		int sum = 0;
		
//		����(���� �ΰ��� ���� ���� ��ȯ)
		if (n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		} // if

		for (int i = n1; i <= n2; i++) {
			sum += i;
		} // for
		System.out.println(n1 + "����  " + n2 + "������ ���� " + sum + "�Դϴ�.");
	}// main
}
