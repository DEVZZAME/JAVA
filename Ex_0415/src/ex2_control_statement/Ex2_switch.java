package ex2_control_statement;

public class Ex2_switch {

	public static void main(String[] args) {

		char ch = '미'; //조건값
		switch(ch) {//비교값
		case '수' : 
			System.out.println("90 ~ 100");
			break;
		case '우' : 
			System.out.println("80 ~ 89");
			break;
		case '미' : 
			System.out.println("70 ~ 79");
			break;
		case '양' :
			System.out.println("60 ~ 69");
			break;
		case '가' : 
			System.out.println("00 ~ 59");
			break;
		default : 
			System.out.println("성적을 올바르게 입력하세요");
			break;
		}
		
		
		
		
	}//main

}
