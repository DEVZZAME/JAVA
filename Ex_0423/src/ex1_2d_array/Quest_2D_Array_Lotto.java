package ex1_2d_array;

import java.util.Random;

public class Quest_2D_Array_Lotto {

	public static void main(String[] args) {

		Random r = new Random();
		int lotto[][] = new int[5][6];
		int c;
		for (i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++)
			{
				int temp = r.nextInt(45) + 1;
				for(c=0; c<j; c++) {
					//중복 내용 체크
					if(lotto[i][c]==temp) {
						break;
					}
				}
			}
		}

	}

}
