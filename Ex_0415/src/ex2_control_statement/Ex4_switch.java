package ex2_control_statement;

public class Ex4_switch {

	public static void main(String[] args) {

		int i = 3;
		
		switch (i) {
		case 1: 
			System.out.println("1111");
			break;
		case 2: 
			System.out.println("EEEE");
			break;
		case 3: 
			System.out.println("3333");
			break; //만약 여기에 break; 코드가 없으면 이후 값도 출력 됨, 조건값과 비교값의 일치 여부에 상관없이 출력 됨
		default: 
			System.out.println("DDDD");
			break;
		}
		
		
		
	}//main

}
