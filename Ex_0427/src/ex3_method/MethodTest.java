package ex3_method;

public class MethodTest {
	
	public String person(String name , int age) {
		return name + "의 나이는 "+ age;
	}
	
	
	
	public int test2(int n) {
		//메서드의 파라미터는 기본적으로 복사본이 넘어가며,
		//해당 복사본은 메서드의 사용이 완료된 후 메모리에서 제거
		n+=100;
		System.out.println("n : "+n);
		return n;
		//void 이외의 반환형이 정의 되었다면, 반드시 해당 반환형 타입으로
		//return을 통해 값을 (test2()메서드를 호출했던 곳으로)반환해야 한다
		//반환형이 void였다면 return을 통해 반환할 필요 없음
		//반환형이 int라면 반드시 정수형태의 값을 return해야 하며,
		//동시에 여러개의 값을 return(반환)할 수 없다.
		//return 코드 아래에는 아무것도 넣을 수가 없다.
	}//test2
	
	
	public void test1() {
		//반환형이 void로 되어 있다면 자바의 어떤 자료형 타입으로도 값을 전달 받을 수 없음
		System.out.println("test1()메서드가 호출 됐습니다");
	}//test1

}
