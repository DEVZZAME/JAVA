package ex1_try_catch;

import java.util.Scanner;

public class Ex3_Try_Catch {
	public static void main(String[] args) {

		//��ĳ�ʸ� ���� Ű���忡�� �������� �Է¹ް�� �Ѵ�.
		//�������� ���� �Է¹��� �ʾ��� �� �����޼����� ����ϵ��� ����.
		
		//���� : 5
		//��� : 5
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		try{
			int num = sc.nextInt();
			System.out.print("��� : "+num);
		}catch(Exception e) {
			System.out.println("������ �Է��ϼ���.");
		}
		
		
	}

}
