package ex1_single_method;

import java.util.Scanner;

public class Ex1_SingleMethod {

	public static void main(String[] args) {
		//Ű���忡�� ������� �̸����� �Է¹ް� @���� ������ 6�̸� 10�ʰ��� ��쿡��
		//������ �ùٸ��� �ʴٴ� �޽��� ����ϱ�
		
		//�̸��� : hdturtleman
		// ~�� ȯ���մϴ�
		//�̸��� ������ �ùٸ��� �ʽ��ϴ�
		
		//�Է��ϰ�, @�� ���°�� �ִ��� Ȯ�� charAt, @�� ���°�� ���� ��, 0���� ���° �������� ������ �ش��ϴ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸����� �Է��� �ּ���.");
		String email = sc.next();
		
		for(int i =0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				if(4>email.substring(0, i).length()||email.substring(0, i).length()>16) {
					System.out.println("�ùٸ��� �Է��ϼ���");
				}else{
					System.out.println("ȯ���մϴ�");
				}//if2
			}//if1
			
		}//for
		
	}//main

}
