package ex1_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
//		논리연산자 : 비교연산자를 통한 연산이 두 개 이상 필요할 때 사용
		int age = 20;
		int limit = 25;
		
//		&&(and)연산자: 앞쪽 연산이 false이면 뒤쪽 연산을 수행하지 않는다
//					true && true   → true
//					true && false  → false
//					false && true  → false
//					false && false → false
		boolean res = limit - age >= 5 && (age+=2) > 20;
		System.out.println("&&연산 : "+res);
		System.out.println("age : "+age);
		
//		||(or)연산자 : 앞의 연산이 true라면 뒤쪽 연산은 수행하지 않는다
		int n1 = 10;
		int n2 = 20;
//		              true || true   → true
//		              true || false  → true
//		             false || ture   → true
//		             false || false  → false
		res = (n1+=10) > 20|| n2-10 == 11;
		System.out.println("||연산 : "+res);
		
		boolean bo = true;
//		!(not)연산 : true는 false로, false는 true로 변환
		System.out.println("!연산 : "+!bo); //연산은 영구적으로 변수의 값을 바꾸지 않는다
		System.out.println(!bo); //!연산이 없으면 원래의 값을 사용
		
		boolean b = true;
		b = !b; //b의 값에 !연산자를 사용하여 boolean 값을 바꾸게 될 경우 영구적으로 변경 됨
		System.out.println(b);
		
		
		
	} //main

}
