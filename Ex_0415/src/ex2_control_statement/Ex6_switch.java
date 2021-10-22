package ex2_control_statement;

public class Ex6_switch {

	public static void main(String[] args) {
		
		//값을 넣어놓고 실행을 했을 때 위 코드를 실행하면 10*5 =50이라는 결과를 도출하시오.
		int su1 = 10;
		int su2 = 5;
		String op = "*";
		
		switch (op) {
		case "+":
			System.out.println(su1+"+"+su2+"="+(su1+su2));
			break;
		case "-":
			System.out.println(su1+"-"+su2+"="+(su1-su2));
		break;
		case "*":
			System.out.println(su1+"*"+su2+"="+(su1*su2));
		break;
		case "/":
			System.out.println(su1+"/"+su2+"="+(su1/su2));
			break;

		default: System.out.println(op+"는 올바른 연산자가 아닙니다");
			break;
		}
		
		
		
		
	} //main

}
