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
			break; //���� ���⿡ break; �ڵ尡 ������ ���� ���� ��� ��, ���ǰ��� �񱳰��� ��ġ ���ο� ������� ��� ��
		default: 
			System.out.println("DDDD");
			break;
		}
		
		
		
	}//main

}
