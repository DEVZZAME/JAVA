package ex3_casting;

public class Ex1_promotion {

	public static void main(String[] args) {

//	★	명시적 형변환 Promotion Casting
//		1) 프로모션 캐스팅
//		 - 큰 자료형에 작은 자료형이 대입되는 것
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n; //실수형 자료형에 정수형 자료형을 저장할 경우 정수가 실수로 변환되어 출력 됨(형변환)
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n2 = 100; //4byte
		n2=c;
		System.out.println(n2);//정수형 자료형에 문자형 자료형을 저장할 경우 문자값이 정수로 변환되어 출력 됨 by ASCII
		
//		
		
		
		
		
		
		
		
		
	} //main

}
