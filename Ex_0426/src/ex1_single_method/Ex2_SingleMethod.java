package ex1_single_method;

import java.util.Scanner;

public class Ex2_SingleMethod {

	public static void main(String[] args) {
		//ȸ���� ���ϱ�
		//ȸ������ ������ �о, �ڷ� �о �Ȱ��� ������ ����
		//Ű���忡�� �ƹ����̳� �Է¹ް�, �� ���� ȸ���������� �Ǵ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please type anything you want : \n");
		String front = sc.next();
		String back ="";
		sc.close();
		
		int len = front.length();
		
		for(int i=len-1; i>=0; i--) {
			back += front.charAt(i);
		}//for
		
		if(front.equals(back)) {
			System.out.println("It's the same as the original.");
		}else {
			System.out.println("It's different from the original.");
		}//if
		
				
	}

}
