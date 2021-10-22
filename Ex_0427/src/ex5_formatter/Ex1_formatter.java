package ex5_formatter;

public class Ex1_formatter {

	public static void main(String[] args) {
		
		int age = 20;
//		System.out.println("저의 나이는 "+age+"세 입니다.");
		
		System.out.printf("저의 나이는 %d세 입니다.\n", age);//enter 값이 없기 때문에 escape 코드를 추가해야 함
		System.out.printf("%d * %d = %d\n", 9, 2, 9*2);
		System.out.printf("%02d월은 %d일 까지 있습니다.\n", 5, 31);
		
		float tall = 180.0f;
		System.out.printf("저의 키는 %.1f cm입니다.\n",tall);
		
		char blood = 'A';
		System.out.printf("저의 혈액형은 %c형 입니다.\n", blood);
		
		String name = "강한솔";
		int birth = 4;
		System.out.printf("저의 이름은 %s이고, 나이는 %d세이며, 생일은 %d월 입니다.",name, age, birth);
		
		//formatting type
		//%d : 정수
		//%f : 실수
		//%c : 문자형
		//%s : 문자열
		
	}//main

}
