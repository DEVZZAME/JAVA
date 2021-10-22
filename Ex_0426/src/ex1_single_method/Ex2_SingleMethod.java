package ex1_single_method;

import java.util.Scanner;

public class Ex2_SingleMethod {

	public static void main(String[] args) {
		//회문수 구하기
		//회문수란 앞으로 읽어도, 뒤로 읽어도 똑같이 읽히는 숫자
		//키보드에서 아무값이나 입력받고, 그 값이 회문수인지를 판단
		
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
