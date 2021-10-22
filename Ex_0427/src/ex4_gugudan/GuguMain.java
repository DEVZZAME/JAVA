package ex4_gugudan;

import java.util.Scanner;

public class GuguMain {

	public static void main(String[] args) {
		//키보드에서 정수값을 입력 받아, printGugu()메서드로 전달하면
		//해당 입력값에 대한 구구단을 출력
		
		//키보드에서 값을 받는 코드는 main에서
		//값을 받아 구구단을 출력하는 코드는 Gugudan 클래스에서 완성하라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int num = sc.nextInt();
		
		Gugudan gu = new Gugudan();
		gu.printGugu(num);
	}

}
