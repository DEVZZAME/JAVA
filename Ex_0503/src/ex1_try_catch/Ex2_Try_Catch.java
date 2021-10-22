package ex1_try_catch;

public class Ex2_Try_Catch {
	public static void main(String[] args) {

		int[] var = { 10, 20, 30 };

		for (int i = 0; i <= var.length; i++) {

			System.out.println(var[i]);
		}
		
		
		//i <= var.length
		//상태라면 i값이 3까지 증가하여 var 배열의 3번째 index로는 접근이 불가하므로
		//오류가 발생할 것.
		//이 오류는 <=를 <로 대체하면 충분히 해결 가능한 문제이므로
		//예외처리가 귀찮다는 이유로 try-catch 구문을 아무곳에서나 사용하는 것은 금물!!
	}// main

}
