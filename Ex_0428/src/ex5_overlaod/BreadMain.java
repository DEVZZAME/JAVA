package ex5_overlaod;

public class BreadMain {
	public static void main(String[] args) {

		Bread bread = new Bread();
		//���� ��������ϴ� <--- 1�� �޼��� ȣ���
		//-----------------------------
		//���� ��������ϴ� <--- 2�� �޼��� ȣ���
		//���� ��������ϴ� (���� ����� ���� ������ŭ)
		//��û�Ͻ� 2���� ���� ��������ϴ�
		//-----------------------------
		//�ϻ��� ��������ϴ� <--- 3�� �޼��� ȣ���
		//�ϻ��� ��������ϴ� (���� ����� ���� ���� ����� ���� ������ŭ)
		//��û�Ͻ� �ϻ��� ��������ϴ�
		
		
		bread.makeBread(); //1
		
		System.out.println("-------------");
		
		bread.makeBread(2); //2
		
		System.out.println("-------------");
		
		bread.makeBread("�ϻ�", 3); //3
		
		System.out.println("-------------");
		
		
	}//main

}
