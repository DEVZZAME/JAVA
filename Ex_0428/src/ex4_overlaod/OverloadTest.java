package ex4_overlaod;

public class OverloadTest {
		
		//오버로딩은 메서드의 '중복정의'라고 하며, 하나의 클래스 내에서 같은 이름을 가진 메서드가
		//여러개 정의되는 것을 의미.
	
		//오버로딩 메서드의 규칙
		//1) 인자의 수가 다른경우
		//2) 인자의 수가 같은경우 타입이 다를 때
		//3) 인자의 수와 타입이 같을 경우 배치 순서가 다를 때
		
		public void test1() {
			System.out.println("인자가 없는 메서드");
		}
		
		public void test1(int n) {//파라미터에서 변수는 중요하지 않음, 오로지 타입만 중요
			System.out.println("인자를 정수로 받는 메서드");
		}
		
		public void test1(char c) {
			System.out.println("인자를 문자로 받는 메서드");
		}
		
		public void test1(String s) {
			System.out.println("인자를 문자열로 받는 메서드");
		}
		
		public void test1(int n, char c) {//타입의 개수가 달라도 인정
			System.out.println("정수, 문자를 인자로 받는 메서드");
		}
		
		public void test1(char c, int n) {//타입의 개수가 같은데 순서가 달라도 인정
			System.out.println("문자, 정수를 인자로 받는 메서드");
		}
}
