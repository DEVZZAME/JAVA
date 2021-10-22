package ex2_control_statement;

import java.util.Scanner;

public class EXXX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "*";
		
		System.out.println("첫번째 정수를 입력하세요");
		int su1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
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
		default : System.out.println("숫자와 연산기호만 입력해주세요");
			break;
		}
		
		
	}

}
