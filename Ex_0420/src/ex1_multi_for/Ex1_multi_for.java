package ex1_multi_for;

public class Ex1_multi_for {

	public static void main(String[] args) {
//		다중for문 : for문 안에 for문이 있는 경우

//		1 2 
//		1 2

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			} // inner
			System.out.println();
		} // outer
		System.out.println("--------------------");

//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		int cnt = 0;
		for (int k = 1; k <= 3; k++) {
			for (int h = 1; h <= 4; h++) {
				System.out.print(++cnt + " ");
			} // inner
			System.out.println("");
		} // outer

		System.out.println("---------------------");

		char c = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(c + " ");
				c++;
			} // inner
			System.out.println("");
		} // outer

	}// main

}
