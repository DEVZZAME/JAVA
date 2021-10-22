package ex1_single_array;

import java.util.Random;

public class Ex4_single_array {

	public static void main(String[] args) {

		//변수 money 10 ~ 5000 사이의 난수를 발생시킨다
		//단, 발생된 난수의 3450, 2100과 같이 1의 자리의 숫자가 반드시 0이어야만 한다
		
		//발생한 난수 money를 각가의 동전으로 바꿨을 때 가능한 가장 적은 수의 동전으로
		//거스를 수 있는 갯수를 출력
		
		//money : 2590
		//500원 : 5개
		//50원 : 1개
		//10원 : 4개
		
		
		//n%500, (n%500)%50, ((n%500)%50)%10 
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500)+1;
		money *=10;
		System.out.println("money : "+money);
		

		
		for(int i=0; i<coin.length; i++) {
			int res = money / coin[i];
			if(res>0) {
				System.out.println(coin[i]+"원 : "+coin[i]);
				res%=coin[i];
			}


		}

		
		
		
		
		
		
		
	}

}
