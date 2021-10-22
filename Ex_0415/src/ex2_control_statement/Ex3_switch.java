package ex2_control_statement;

public class Ex3_switch {

	public static void main(String[] args) {
//		Switch문의 비교값은, 정수(long은 제외), 문자형, 문자열만 사용 가능 / boolean, long, float, double 사용 불가
		
		String str = "Firenz";
		System.out.println("You know where Firenz is?");
		switch(str) {
		case "London" : 
			System.out.println("England");
			break;
		case "Paris" : 
			System.out.println("France");
			break;
		case "Firenz" : 
			System.out.println("Italy");
			break;
		case "Bin" : 
			System.out.println("Ostria");
			break;
		case "St.peterburg" :
			System.out.println("Russia");
		default : 
			System.out.println("Please type the right things.");
			break;
		}
		
		
		
	}

}
