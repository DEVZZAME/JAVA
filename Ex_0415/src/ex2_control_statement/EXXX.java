package ex2_control_statement;

import java.util.Scanner;

public class EXXX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "*";
		
		System.out.println("ù��° ������ �Է��ϼ���");
		int su1 = sc.nextInt();
		
		System.out.println("�ι�° ������ �Է��ϼ���");
		int su2 = sc.nextInt();
		
		switch(op) {
		case "+" : 
			System.out.println(su1+"+"+su2+"="+(su1+su2));
			break;
		case "-" : 
			System.out.println(su1+"-"+su2+"="+(su1-su2));
			break;
		case "*" : 
			System.out.println(su1+"*"+su2+"="+(su1*su2));
			break;
		case "/" : 
			System.out.println(su1+"/"+su2+"="+(su1/su2));
		default : System.out.println("���ڿ� �����ȣ�� �Է����ּ���");
			break;
		}
		
		
	}

}
