package ex2_single_for;

import java.util.Scanner;

public class Ex5_single_for {

	public static void main(String[] args) {

//		�Ǻ���ġ ���� �����
		
		
//		�ݺ�Ƚ�� : 6 = int n
//		Ű���忡�� 6�̶�� ������ �Է� ������
//		1 1 2 3 5 8 �� ���
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ�Ƚ�� : ");
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			num2=num3;
			num3=num1;
			num1=num2+num3;
			
			System.out.print(num3+ " ");
		}//for
		
	}//main

}
