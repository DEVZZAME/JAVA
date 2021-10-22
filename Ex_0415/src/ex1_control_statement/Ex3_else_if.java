package ex1_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
//		if(단순 조건문)
//		else-if(다중 조건문) : 여러개의 조건 비교가 필요한 경우
/*		if(조건식 1){
				조건식 1이 참일 때 실행되는 영역
				}else if(조건식 2){
				조건식 2가 참일 때 실행되는 영역
				}.......(){
				}else{
				}
				
*/
		int num = 0;
		String str = "";
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) { //각 조건문과 값을 비교하다가 참인 결과가 나오는 순간 이후에는 비교를 하지 않고 무시 함
			str = "C";
		}else if(num >= 60) {
			str = "D";
		}else{
//			위의 if와 else if문이 가지고 있는 모든 조건이 거짓일 때
//			마지막으로 반드시 실행되는 영역
			str = "F";
		}
		System.out.println(str);
		
		
		
} //main
}
