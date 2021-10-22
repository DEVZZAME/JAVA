package ex1_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		
//		증감연산자 : 1씩 증가 시키거나 1씩 감소 시키는 연산자
//		선행증감과 후행증감의 차이점을 알아두자
		int a = 10;
		System.out.println("a : "+ ++a);
		
		int b = 10;
		System.out.println("b : "+ b++);
		System.out.println("b : "+b);
		
		++b;
		++b;
		b++;
		--b;
		b++;
		b--;
		--b;
		System.out.println(b--);
	} //main

}
