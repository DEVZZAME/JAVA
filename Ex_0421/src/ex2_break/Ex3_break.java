package ex2_break;

public class Ex3_break {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			switch(i) {
			case 1:
				System.out.println("1출력");
				break;//break가 switch문 안에 있다면
				//for문을 빠져나가는 것이 아니라 switch문만 빠져나감
				
			case 2:
				System.out.println("2출력");
				break;
				
			case 3:
				System.out.println("3출력");
				break;
			}//switch
			
		}//for
		
	}//main

}
