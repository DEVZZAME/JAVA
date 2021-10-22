package ex2_random;

import java.util.Random;

public class Ex1_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Random 클래스를 사용한 난수 만들기
		
		// 437~54829 사이의 난수 만들기
		// new Random().nextInt(발생시킬 난수의 범위) + 시작 수;
		// new Random().nextInt(큰 수 - 작은 수 + 1) + 시작 수;
		int rnd = new Random().nextInt(54829-437+1) + 437;
		System.out.println(rnd);
				
				
				
				
				
				
				
				
				
				
				
		
	}//main

}
