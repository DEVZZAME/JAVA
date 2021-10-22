package ex3_continue;

public class Ex1_continue {

	public static void main(String[] args) {

		// continue : 반복문 내에서 특정 문장을 건너뛸 때 사용하는 키워드

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 5; j++) {
				if(j%2==0) {
					//for문에 증감식이 없다면 조건식으로 이동한다
					continue;//해당 if문이 참이라면 반복문을 빠져 나가는 것이 아니라
							//for문의 증감식으로 이동하고 if문의 참값은 무시하고 건너뜀
				}
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
			
		}//outer

	}// main

}
