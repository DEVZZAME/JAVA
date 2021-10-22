package ex1_first;

public class Ex_first {
	//모든 코드는 상단에서 하단으로, 좌측에서 우측으로 이동하며 읽음
	public static void main(String[] args) {
		System.out.println(20); // 입력한 값 그대로 출력 됨
		System.out.println(1+1); // 숫자+숫자=숫자 → 사칙연산에 의해 계산되어 출력 됨
		System.out.println("1"+"1"); // "문자열"+"문자열"="문자열문자열" → 나열 되어서 출력 됨
		System.out.println("홍길동"+15+"안녕"); // 선행된 코드가 문자열이면 이후 입력된 코드가 문자열이 아니더라도 문자열처럼 나열 됨
		System.out.println(1+1+"안녕"+1+1); // 1+1은 숫자로 인식되어 계산되고 "안녕"부터는 문자열로 인식 됨
	}	//main

}
