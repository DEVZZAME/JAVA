package ex2_single_for;

import java.util.Scanner;

public class Ex3_single_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		int sum = 0; //1���� �Է� ���� �������� ���� ���ؼ� ������ ����
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		} // for
		
		System.out.println("1���� ���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}// main

}
