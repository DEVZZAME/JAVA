package ex2_control_statement;

public class Ex6_switch {

	public static void main(String[] args) {
		
		//���� �־���� ������ ���� �� �� �ڵ带 �����ϸ� 10*5 =50�̶�� ����� �����Ͻÿ�.
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

		default: System.out.println(op+"�� �ùٸ� �����ڰ� �ƴմϴ�");
			break;
		}
		
		
		
		
	} //main

}
