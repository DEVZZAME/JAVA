package ex2_control_statement;

public class Ex3_switch {

	public static void main(String[] args) {
//		Switch���� �񱳰���, ����(long�� ����), ������, ���ڿ��� ��� ���� / boolean, long, float, double ��� �Ұ�
		
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
