package ex2_break;

public class Ex3_break {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			switch(i) {
			case 1:
				System.out.println("1���");
				break;//break�� switch�� �ȿ� �ִٸ�
				//for���� ���������� ���� �ƴ϶� switch���� ��������
				
			case 2:
				System.out.println("2���");
				break;
				
			case 3:
				System.out.println("3���");
				break;
			}//switch
			
		}//for
		
	}//main

}
