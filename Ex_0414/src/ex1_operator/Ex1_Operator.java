package ex1_operator;

public class Ex1_Operator {

	public static void main(String[] args) {
//	★	연산자(Operator)
/*		
		1. 최고연산자 : . , ()
	☆	2. 증감연산자 : ++. --
		3. 산술연산자 : +, -, *, /, %
		4. 시프트연산자 : >>, <<
	☆	5. 비교연산자 : >, <, >=, <=, ==, !=
		6. 비트연산자 : &, |, ^
	☆	7. 논리연산자 : &&, ||
		8. 삼항(조건)연산자 : ?, :
	☆	9. 대입연산자 : =, *=, /=, %=, +=, -=
*/	
		
//		산술연산자 : +, -, *, /, %
//		4칙연산과 나머지 연산자를 가지고 있다.
		int n1=20;
		int n2=7;
		int n3=n1+n2;
		System.out.println("n1 + n2 = "+n3);
		n3 = n1*n2;
		System.out.println("n1 * n2 = "+n3);
		
		n3 = n1/n2;
		System.out.println("(n1 / n2)의 몫 = "+n3); // n1을 n2로 나눈 값은 소수점 이하 자리는 버리고 몫의 값만 출력
		
		n3 = n1%n2;
		System.out.println("(n1 % n2)의 나머지 값 = "+n3); // n1을 n2로 나누었을 때 몫을 제외한 나머지의 값만 출력
		System.out.println("--------------------------");
	
//		대입연산자 : =, *=, /=, %=, +=, -=
//		특정 값을 변수에 전달하여 기억시키기 위해 사용하는 연산자
		int i1 = 10; //대입 연산자는 항상 =(equal)을 기준으로 오른쪽 항의 값이 들어 감 
		int i2 = 7;
		
		i1+=i2; //i1=i1+i2; → i1이 원래 가지고 있던 값인 10은 버리고 i1+i2의 값인 17을 i1이 갖게 됨
		System.out.println("i1 + i2 = "+i1);
		
		i1 /=2; //i1=i1/2;
		System.out.println("i1 / 2 = "+i1); //i1의 값이 위에서 17로 변경되었기 때문에 17/2=8이 됨
		
	}

}
