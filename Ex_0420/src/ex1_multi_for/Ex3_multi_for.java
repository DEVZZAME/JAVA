package ex1_multi_for;

public class Ex3_multi_for {

	public static void main(String[] args) {

		// 1****
		// *2***
		// **3**

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i < j) {
					System.out.print("*");
				} else if (i > j) {
					System.out.print("*");
				} else {
					System.out.print(i);
				} // if
			} // inner
			System.out.println();
		} // outer
		
		System.out.println("-----------");
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//4 5 6 7 8 9 10 1 2 3 
		//			...
		//10 1 2 3 4 5 6 7 8 9
		
		
		for(int i=1; i<=10; i++) {
			for(int j=0; j<10; j++) {
				int num = i+j;
				if(num>10) {
					num-=10;
				}
				System.out.print(num +" ");
			}//inner
			System.out.println();
		}//outer

	}

}
