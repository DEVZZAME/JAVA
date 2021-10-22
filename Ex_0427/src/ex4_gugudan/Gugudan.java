package ex4_gugudan;

public class Gugudan {

	public void printGugu(int num) {
		System.out.println(num);
		
		for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n", num,j,num*j);
		}//for
		
	}//printGugu
}
