package ex2_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {

		/*
		 자료형(기본자료형 Primitive data type)
		 논리형 : boolean - 1bit ... 0, 1
		 문자형 : char - 2byte ...... -128 ~ 127
	 	 정수형 : byte - 1byte ...... -32768 ~ 32767
	 	 	    short - 2byte ...... -21억 ~ 21억
	 	  		int - 4byte ...... -900경 ~ 900경
	 	  		long - 8byte
	 	 실수형 : float - 4.n byte
	 	 		double - 8.n byte
		 */
		
		/*		
 		변수 : 특정 값을 저장하여 보관하는 공간
		변수 선언의 규칙 : 
		1) 변수는 반드시 소문자로 시작
		2) 변수이름은 숫자로 시작할 수 없음
		3) _를 제외하고 특수문자를 포함할 수 없음
		4) 변수명은 한글로 짓지 않는다
		
		변수 선언 및 초기화
		자료형 변수명; (선언 Declare)
		변수명 = 값; (대입)
		자료형 변수명 = 값; (초기화)
		변수명은 반드시 다르게 설정(중복X)		
		
	★	논리형 : true|false (즉, 사실과 사실이 아니다의 두 가지 값 중 한가지만을 저장할 수 있음)*/
		boolean b; //(논리형 자료형에 b라는 변수가 선언만 된 상태)
//		b=100; (자료형이 정수형이 아니라 논리형이기 때문에 100이라는 정수를 설정할 수 없음, 반드시 true|false만 가능)
		b=true; //(자료형의 타입과 값이 같으므로 쌉가능)
		System.out.println(b);
		
		b=false; //(자료형이 같을 경우 같은 변수명으로 재선언 가능)
		System.out.println(b);

//	★	문자형 : 홑따옴표 안에 딱 한글자만 저장 가능한 자료형(문자열String과 혼동 X)
		char alpabet1 = 'A'; // char b='B'; (상단에서 이미 선언된 변수는 자료형이 다를 경우 다시 선언할 수 없음)
		System.out.println("alpabet1 : "+alpabet1);
		alpabet1 = 'a';
		System.out.println("alpabet1 : "+alpabet1); // (자료형이 같으므로 재선언 된 변수값이 변경되어 출력)
		
		char alpabet3 = 65+2; //(아스키 코드ASCII Code를 통해 정수값을 입력해도 문자형으로 출력 됨)
		System.out.println("alapabet3 : " + alpabet3);

//	★	아스키 코드
//		아스키 코드에 존재하지 않는 값을 입력하여 출력하면 쓰레기가 출력 됨, 자료형에 맞지 않는 아스키 코드를 입력할 경우에도 에러 발생 

//	★	정수형 : 
//		byte by = 128; ← 자료형이 담을 수 있는 표현 범위를 벗어나면 에러 발생
		int n = 2147483639;
//		long lo = 2200000000; (제임스 고슬링이 java를 제작하던 당시, 처리 속도를 빠르게 하기 위해 정수를 처리할 때, 모두 int로 처리하도록 설정 해놨음)
		long lo = 999999999999999999L; //(int가 아니라 long을 통해 처리하고 싶으면 값의 끝에 L 또는 l을 추가 해야 함)
		
		System.out.println(n);
		System.out.println(lo);
		
//	★	실수형 : 소수점을 가지고 있는 값을 저장하기 위한 자료형
		float f = 3.14f; //(실수형 자료형은 double가 default값으로 설정되어 있기 때문에 float을 통해 출력하고 싶으면 값의 끝에 F 또는 f를 추가 해야 함)
		double d = 3.14;
		f=100; //으로 다시 대입하게 될 경우 정수 100은 실수 타입에 맞게 100.0으로 출력
		d=100f; // 다시 대입할 경우 float와 double에 F를 추가해도 되고 안해도 됨
		System.out.println(f);
		System.out.println(d);
		
	}//main

}
