package ex2_break;

public class Ex1_break {

	public static void main(String[] args) {

//		break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ����ϴ� Ű����		
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 10; j++) {
				if(j%2==0) 
				//break�� �Ʒ��� ��� �ڵ���� �����ϰ� ���� ����� �ݺ����� ������ ����������	
				break;
				System.out.print(j+" ");
				
			} // inner

			System.out.println();
			
		} // outer

	}// main

}
