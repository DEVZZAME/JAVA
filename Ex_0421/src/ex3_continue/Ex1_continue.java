package ex3_continue;

public class Ex1_continue {

	public static void main(String[] args) {

		// continue : �ݺ��� ������ Ư�� ������ �ǳʶ� �� ����ϴ� Ű����

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 5; j++) {
				if(j%2==0) {
					//for���� �������� ���ٸ� ���ǽ����� �̵��Ѵ�
					continue;//�ش� if���� ���̶�� �ݺ����� ���� ������ ���� �ƴ϶�
							//for���� ���������� �̵��ϰ� if���� ������ �����ϰ� �ǳʶ�
				}
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
			
		}//outer

	}// main

}
