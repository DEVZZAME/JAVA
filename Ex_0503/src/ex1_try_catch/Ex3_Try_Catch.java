package ex1_try_catch;

import java.util.Scanner;

public class Ex3_Try_Catch {
	public static void main(String[] args) {

		//스캐너를 통해 키보드에서 정수값을 입력받고록 한다.
		//정상적인 값을 입력받지 않았을 때 오류메세지를 출력하도록 하자.
		
		//정수 : 5
		//결과 : 5
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		try{
			int num = sc.nextInt();
			System.out.print("결과 : "+num);
		}catch(Exception e) {
			System.out.println("정수만 입력하세요.");
		}
		
		
	}

}
