package ex1_control_statement;

public class Ex2_if_else {

	public static void main(String[] args) {

//		if-else문 : 
//		if(조건식) {
//			조건식이 참일 때 실행되는 영역
//		}else{ ←else에는 항상 소괄호가 붙지 않음
//			조건식이 거짓일 때 실행되는 영역
//		}
		
		int n=48;
		String str = "";
		
		if( ++n >= 50 ) {
			str = "n은 50 이상의 수";
		}else {
			str = "n은 50 미만의 수";
		}
		System.out.println(str);
		System.out.println("-----------------");
		
//		알바생을 뽑기로 했다.
//		남자이면서 20세 이상인 사람은 '합격'
//		그렇지 않으면 '불합격'
		char gender = '남';
		int age = 22;
		if(gender == '남' && age >= 20) {
			System.out.println("입영 대상입니다");
		} else {
			System.out.println("면제입니다");
		}
//		 위의 코드를 삼항연산자로 변경하시오.
		String res = gender == '남' && age >= 20 ? "합격" : "불합격";
		System.out.println(res);
		
		
	}//main

}
