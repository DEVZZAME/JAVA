package ex1_single_array;

import java.util.Random;

public class Ex4_single_array {

	public static void main(String[] args) {

		//���� money 10 ~ 5000 ������ ������ �߻���Ų��
		//��, �߻��� ������ 3450, 2100�� ���� 1�� �ڸ��� ���ڰ� �ݵ�� 0�̾�߸� �Ѵ�
		
		//�߻��� ���� money�� ������ �������� �ٲ��� �� ������ ���� ���� ���� ��������
		//�Ž��� �� �ִ� ������ ���
		
		//money : 2590
		//500�� : 5��
		//50�� : 1��
		//10�� : 4��
		
		
		//n%500, (n%500)%50, ((n%500)%50)%10 
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500)+1;
		money *=10;
		System.out.println("money : "+money);
		

		
		for(int i=0; i<coin.length; i++) {
			int res = money / coin[i];
			if(res>0) {
				System.out.println(coin[i]+"�� : "+coin[i]);
				res%=coin[i];
			}


		}

		
		
		
		
		
		
		
	}

}
