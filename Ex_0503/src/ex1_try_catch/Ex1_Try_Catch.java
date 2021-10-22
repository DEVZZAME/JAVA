package ex1_try_catch;

public class Ex1_Try_Catch {
	public static void main(String[] args) {
		
		//Try-Catch(예외처리)
		//자바에서 프로그램이 실행되는 도중에 예외(에러, 버그)가 발생하면
		//그 시점에서 프로그램이 강제적으로 종료된다.
		//이것은 올바른 판단이지만, 때로는 예측가능한 오류에 대해 프로그램을
		//강제로 종료하지 않고, 이후의 작업을 진행하고자 할 때가 있다.
		//예외처리 구문을 통해 프로그램의 비정상적인 종료를 줄여보자!!
		
		//try{
		//   예외발생 코드
		//}catch( Exception e ){
		//    try에서 오류가 발생한 경우 실행되는 영역
		//}
		
		int n = 2;
		int result = 0;
		
		int[] arr = new int[3];
		
		
		try {
			result = 10 / n;
			arr[2] = 100;
					
		} catch (ArithmeticException e) {
			//발생한 오류의 이름을 출력해주는 메서드
			//e.printStackTrace();
			
			//try에서 오류가 발생한 경우 실행되는 영역
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array의 index가 잘못되었습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		} finally{
			//예외발생 여부에 상관없이 반드시 한번은 호출되는 영역
			System.out.println("finally 영역");
		}
		
		System.out.println("결과 : "+result);
		
		
	}//main
}
