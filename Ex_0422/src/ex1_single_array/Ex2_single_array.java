package ex1_single_array;

public class Ex2_single_array {

	public static void main(String[] args) {

		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		// JAVA

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		} // for

		System.out.println();

		// 배열의 선언, 생성, 초기화를 한번에
		String[] str = { "안녕", "나는", "한솔이라고", "해요!" };

//		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]+" ");
//		}//for

		// 개선된 루프(향상된 for문)
		// for나 list가 가진 모든 내용을 하나도 빠짐없이 출력하고자 하는 용도로 개발된 문법
		for (String s : str) {
			System.out.print(s+" ");
		}

	}// main

}
