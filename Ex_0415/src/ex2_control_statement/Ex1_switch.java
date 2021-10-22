package ex2_control_statement;

public class Ex1_switch {

	public static void main(String[] args) {
		
//		switch-case문
//		if문이 조건식을 비교하는 것과 달리
//		switch문은 비교값과 조건값이라는 개념을 통해 결과를 수행
		
//		switch(비교값){
//			case 조건값:
//				비교값과 조건값이 일치할 때 실행되는 영역
//				break;
//		}
		
		int num = 5;
		
		//비교값과 자료값의 자료형 타입은 같아야 함
		System.out.println("Choose your favourite city in the United Kingdom");
		switch(num) {//괄호 안에 들어갈 값은 비교값(비교값이 들어가야 하는 것이지 조건식이 들어가서는 안됨 gotta put only key)
		case 1: //조건값
			System.out.println("London");
			break; //해당 switch문을 완전히 빠져나오면서 종료
		case 2: 
			System.out.println("Brighton");
			break;
		case 3: 
			System.out.println("Edinburg");
			break;
		case 4: 
			System.out.println("Glasgo");
			break;
			
		default:
			//비교값과 조건값이 한개도 일치하지 않을 때, 마지막으로 반드시 호출되는 영역
			System.out.println("Actually, Paris's better than The UK's cities");
			break;
			}//switch
//		else-if문은 비교값과 조건식을 순차적으로 비교하는데 반해,
//		switch문은 순차적으로 비교하는 것이 아니라, 비교값만 골라 찾아내어 바로 호출
//		검색 속도는 더욱 빠르나, 조건식 사용이 불가라는 단점 존재
		
		
		
		
		
		
		
		
		
		
		
		
/*		int month = 5;
		String monthstring = "";
		switch(month) {
			case 1 : monthstring = "JAN";
					break;
			case 2 : monthstring = "FEB";
					break;
			case 3 : monthstring = "MAR";
					break;
			case 4 : monthstring = "APR";
					break;
			case 5 : monthstring = "MAY";
					break;
			case 6 : monthstring = "JUN";
					break;
			case 7 : monthstring = "JUL";
					break;
			case 8 : monthstring = "AUG";
					break;
			case 9 : monthstring = "SEP";
					break;
			case 10 : monthstring = "OCT";
					break;
			case 11 : monthstring = "NOV";
					break;
			case 12 : monthstring = "DEC";
					break;
		}
		System.out.println(monthstring); */

		
	}//main

}
