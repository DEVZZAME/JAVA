package ex2_single_for;

public class Ex1_single_for {

	public static void main(String[] args) {

//		for문 : 특정 명령을 원하는 만큼 반복적으로 수행하고자 할 때 사용
//		for(초기식 ; 조건식; 증감식){
//		조건식이 참일 때 실행되는 영역
//		}
		int n = 10; // 전역 변수
//		    int i=지역변수, for문 내에서만 사용 가능
//		for(int i=1; i<4; i++) {
//			
//			n += 10;
//			System.out.println(i);
//		}
//		System.out.println(n);
//		
//		Q. 10부터 1씩 줄어들며 출력하는 for문을 만드시오.
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
//		Q. 1부터 100까지의 반복하는 for문에서 3의 배수만 출력하시오.
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}//main

}
