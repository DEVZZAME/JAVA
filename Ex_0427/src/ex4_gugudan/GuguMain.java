package ex4_gugudan;

import java.util.Scanner;

public class GuguMain {

	public static void main(String[] args) {
		//Ű���忡�� �������� �Է� �޾�, printGugu()�޼���� �����ϸ�
		//�ش� �Է°��� ���� �������� ���
		
		//Ű���忡�� ���� �޴� �ڵ�� main����
		//���� �޾� �������� ����ϴ� �ڵ�� Gugudan Ŭ�������� �ϼ��϶�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int num = sc.nextInt();
		
		Gugudan gu = new Gugudan();
		gu.printGugu(num);
	}

}
