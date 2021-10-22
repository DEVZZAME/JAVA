package ex1_single_method;

import java.util.Scanner;

public class Ex1_SingleMethod {

	public static void main(String[] args) {
		//키보드에서 사용자의 이메일을 입력받고 @앞의 문장이 6미만 10초과인 경우에는
		//형식이 올바르지 않다는 메시지 출력하기
		
		//이메일 : hdturtleman
		// ~님 환영합니다
		//이메일 형식이 올바르지 않습니다
		
		//입력하고, @가 몇번째에 있는지 확인 charAt, @가 몇번째에 있을 때, 0부터 몇번째 전까지의 범위가 해당하는지
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력해 주세요.");
		String email = sc.next();
		
		for(int i =0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				if(4>email.substring(0, i).length()||email.substring(0, i).length()>16) {
					System.out.println("올바르게 입력하세요");
				}else{
					System.out.println("환영합니다");
				}//if2
			}//if1
			
		}//for
		
	}//main

}
