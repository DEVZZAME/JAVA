package ex2_control_statement;

public class Ex5_switch {

	public static void main(String[] args) {

				int month = 4;
				switch (month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					System.out.println(month+"���� 31�� ���� �ֽ��ϴ�.");
				break;
				case 2:
					System.out.println(month+"���� 28�� ���� �ֽ��ϴ�.");
				break;
				case 4: case 6: case 9: case 11:
					System.out.println(month+"���� 30�� ���� �ֽ��ϴ�.");
				break;
				default: System.out.println("1���� 12������ ���ڸ� �Է����ּ���.");
					break;
				}
		
		
	}//main

}
