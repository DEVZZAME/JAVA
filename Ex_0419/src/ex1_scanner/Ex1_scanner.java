package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {

	public static void main(String[] args) {
//		Scanner Ŭ������ ���� Ű���忡�� ���� ���� �Է¹��� �� �ִ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num1 = sc.nextInt();
		System.out.println("�Է� ���� �� : "+num1);
		
		System.out.println("���� : ");
		String str = sc.next(); // Ű���忡�� ���ڿ��� �������� �Է¹ޱ� ���� ���
		System.out.println("���� ���� : "+str);
		
		System.out.println("���� : "); 
		String str1 = sc.nextLine(); // ���� ����Ϸ��� nextLine ����ؾ� ��
		System.out.println("���� ���� : "+str1);

	}

}
