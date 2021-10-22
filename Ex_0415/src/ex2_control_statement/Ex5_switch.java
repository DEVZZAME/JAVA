package ex2_control_statement;

public class Ex5_switch {

	public static void main(String[] args) {

				int month = 4;
				switch (month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					System.out.println(month+"월은 31일 까지 있습니다.");
				break;
				case 2:
					System.out.println(month+"월은 28일 까지 있습니다.");
				break;
				case 4: case 6: case 9: case 11:
					System.out.println(month+"월은 30일 까지 있습니다.");
				break;
				default: System.out.println("1부터 12까지의 숫자만 입력해주세요.");
					break;
				}
		
		
	}//main

}
