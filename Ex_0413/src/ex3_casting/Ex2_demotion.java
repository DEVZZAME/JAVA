package ex3_casting;

public class Ex2_demotion {

	public static void main(String[] args) {

//		명시적 형변환 Demotion Casting
//		- 작은 자료형에 큰 자료형을 대입되는 것
		char c = 'B';//2byte
		int n = c;//4byte promotion casting 적용 B→66
		c=66;
//		c=n; int가 4byte를 갖고 있었는데 char에 대입을 할 경우 2byte의 손실이 일어나기 때문에 컴파일러가 경고(red underline)→
		c=(char)n; //((char)→'2byte의 데이터 손실을 알고서도 대입하겠다'고 notice)
		System.out.println(c); 
		
		float f = 5.5f;
		n=0;
//		n=f; 정수형 자료형에 실수형 자료형을 저장하게 될 경우 실수의 소수점 자리는 버려지게 되므로 컴파일러가 경고 →
		n=(int)f; //((int)→ '소수점 자리의 데이터 손실을 알고서도 대입하겠다'고 notice)
		System.out.println(n); //0.5의 소수점 값을 버리고 정수만 출력 됨
		
		float ff = (float)n; // n은 정수이기 때문에 실수에 그냥 담을 수도 있지만 (float)을 통해 notice를 해주기도 함
//		Promotion Casting은 자동으로 형변환이 이루어지지만, Demotion Casting은 자동으로 형변환이 이루어지지 않기도 함
		System.out.println(ff);
		
		
		
		
		
	} //main

}
