package ex2_control_statement;

public class Ex1_switch {

	public static void main(String[] args) {
		
//		switch-case��
//		if���� ���ǽ��� ���ϴ� �Ͱ� �޸�
//		switch���� �񱳰��� ���ǰ��̶�� ������ ���� ����� ����
		
//		switch(�񱳰�){
//			case ���ǰ�:
//				�񱳰��� ���ǰ��� ��ġ�� �� ����Ǵ� ����
//				break;
//		}
		
		int num = 5;
		
		//�񱳰��� �ڷᰪ�� �ڷ��� Ÿ���� ���ƾ� ��
		System.out.println("Choose your favourite city in the United Kingdom");
		switch(num) {//��ȣ �ȿ� �� ���� �񱳰�(�񱳰��� ���� �ϴ� ������ ���ǽ��� ������ �ȵ� gotta put only key)
		case 1: //���ǰ�
			System.out.println("London");
			break; //�ش� switch���� ������ ���������鼭 ����
		case 2: 
			System.out.println("Brighton");
			break;
		case 3: 
			System.out.println("Edinburg");
			break;
		case 4: 
			System.out.println("Glasgo");
			break;
			
		default:
			//�񱳰��� ���ǰ��� �Ѱ��� ��ġ���� ���� ��, ���������� �ݵ�� ȣ��Ǵ� ����
			System.out.println("Actually, Paris's better than The UK's cities");
			break;
			}//switch
//		else-if���� �񱳰��� ���ǽ��� ���������� ���ϴµ� ����,
//		switch���� ���������� ���ϴ� ���� �ƴ϶�, �񱳰��� ��� ã�Ƴ��� �ٷ� ȣ��
//		�˻� �ӵ��� ���� ������, ���ǽ� ����� �Ұ���� ���� ����
		
		
		
		
		
		
		
		
		
		
		
		
/*		int month = 5;
		String monthstring = "";
		switch(month) {
			case 1 : monthstring = "JAN";
					break;
			case 2 : monthstring = "FEB";
					break;
			case 3 : monthstring = "MAR";
					break;
			case 4 : monthstring = "APR";
					break;
			case 5 : monthstring = "MAY";
					break;
			case 6 : monthstring = "JUN";
					break;
			case 7 : monthstring = "JUL";
					break;
			case 8 : monthstring = "AUG";
					break;
			case 9 : monthstring = "SEP";
					break;
			case 10 : monthstring = "OCT";
					break;
			case 11 : monthstring = "NOV";
					break;
			case 12 : monthstring = "DEC";
					break;
		}
		System.out.println(monthstring); */

		
	}//main

}
