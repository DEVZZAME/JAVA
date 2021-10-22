package ex1_operator;

public class Ex5_Operator {

	public static void main(String[] args) {

//		삼항(조건)연산자
//		하나의 조건식을 두고, 해당 조건식이 참일 때와 거짓일 때에 대한 결과를 다르게 얻어낼 수 있도록 해주는 연산자
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b-- ? true : false; // 조건의 결과 값이 참일 경우 ? 이하 전항, 거짓일 경우 ? 이하 후항
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = (n1+=n1) == n2 ? 'O' : 'X';
			System.out.println(res2);
			
			a=10;
			b=12;
			//a=11                     a=11+12=23  (23%11=1) -> 22>10
			//++a>=b||2+(12-5)<=b&&13-b>=0&&(a+=b)-(a%b)>10?1:2;
//			   11>=12 || 9<=12 && 1>=0 && 12>10
//				거짓		   참             참              참   	   
			
			int A = ++a >= b || 2+(12-7) <= b && 13-b >= 0 && (a+=b)-(a%b) > 10 ? 1 : 2;
			System.out.println(A);
		
			int nn1 = 23;
			int nn2 = 11;
			int nn3=nn1%nn2;
					System.out.println("nn1 % nn2 : " + nn3);
	}

}
