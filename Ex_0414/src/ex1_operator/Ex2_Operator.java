package ex1_operator;

public class Ex2_Operator {

	public static void main(String[] args) {

//		비교 연산자 : >, <, >=, <=, ==, !=
//		변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2; //res의 자료형은 비교연산자를 통해 비교한 결과값을 갖고 싶다면 boolean이 되어야 함
//								비교연산자를 통한 연산의 결과는 반드시 boolean 형태로 돌아온다
		System.out.println("n1 < n2 : "+res);
		
		res = (n1+=10) >= n2;
		System.out.println("(n1+=10) >= n2 : "+res); // n1+10=20은 n2와 같으므로 참
		
		res = n1 == n2;
		System.out.println("n1 == n2 : "+res);
		
		res = n1!=n2;
		System.out.println("n1! = n2 : "+res);
		
//		gt(greater than) >, lt(little than) <, le(little equal) <=, ge(greater equal)>=, ne(not equal)!=, eq(equal)=
		
		
	}//main

}
