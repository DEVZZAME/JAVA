package ex5_formatter;

public class Ex1_formatter {

	public static void main(String[] args) {
		
		int age = 20;
//		System.out.println("���� ���̴� "+age+"�� �Դϴ�.");
		
		System.out.printf("���� ���̴� %d�� �Դϴ�.\n", age);//enter ���� ���� ������ escape �ڵ带 �߰��ؾ� ��
		System.out.printf("%d * %d = %d\n", 9, 2, 9*2);
		System.out.printf("%02d���� %d�� ���� �ֽ��ϴ�.\n", 5, 31);
		
		float tall = 180.0f;
		System.out.printf("���� Ű�� %.1f cm�Դϴ�.\n",tall);
		
		char blood = 'A';
		System.out.printf("���� �������� %c�� �Դϴ�.\n", blood);
		
		String name = "���Ѽ�";
		int birth = 4;
		System.out.printf("���� �̸��� %s�̰�, ���̴� %d���̸�, ������ %d�� �Դϴ�.",name, age, birth);
		
		//formatting type
		//%d : ����
		//%f : �Ǽ�
		//%c : ������
		//%s : ���ڿ�
		
	}//main

}
