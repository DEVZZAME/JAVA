package ex4_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		//Ű���忡�� ������ �� �� �Է¹޾Ƽ� �� ���� �ּҰ������ ���ϱ�
		
		//��1 : 4
		//��2 : 6
		//�ּҰ���� : 12
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
			for(int i=1; i<=n1*n2; i++) {
				
				if(i%n1==0 && i%n2==0) {
					System.out.println(i);
					break;
				}
				
			}
			
			
//				�Ҽ� *(n1/�Ҽ��� ��*n2/�Ҽ��� ��)
//					i==n > �Ҽ�
//					i!=�Ҽ��ƴ�
		
	}//main

}
