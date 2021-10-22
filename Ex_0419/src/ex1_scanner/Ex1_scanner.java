package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {

	public static void main(String[] args) {
//		Scanner 클래스를 통해 키보드에서 값을 직접 입력받을 수 있다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		System.out.println("입력 받은 값 : "+num1);
		
		System.out.println("문장 : ");
		String str = sc.next(); // 키보드에서 문자열과 문자형을 입력받기 위한 기능
		System.out.println("받은 문장 : "+str);
		
		System.out.println("문장 : "); 
		String str1 = sc.nextLine(); // 띄어쓰기 사용하려면 nextLine 사용해야 함
		System.out.println("받은 문장 : "+str1);

	}

}
