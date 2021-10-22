package ex1_control_statement;

public class Ex1_if {

	public static void main(String[] args) {

//		제어문 : 프로그램의 흐름을 제어하는 문장
//		1) 분기문 : if, switch
//		2) 반복문 : for, while
		
//		단순 if문 : 
//		if( 조건식 ){
//			조건식이 참일 때 실행되는 영역
//		}
//		조건식은 항상 참 또는 거짓의 결과 값이 나오는 식이어야 함
		
		int n = 51;
		String str = "";
		
		if(n == 50) {
//			조건식이 참일 때 if 영역의 코드를 실행한 후 빠져나간다
			str = "50입니다";
		}
		
		if(n != 50) {
			str = "50이 아닙니다!";
		}
		System.out.println(str);
		
		
	}//main

}
