package ex2_break;

public class Ex2_break {

	public static void main(String[] args) {

		int n = 1;

		while (true) {

			System.out.println(n);
			n++;
			
			if(n>10) {
				break;
			}
				
		}//while
	}//main

}
