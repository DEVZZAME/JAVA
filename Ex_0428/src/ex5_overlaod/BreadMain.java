package ex5_overlaod;

public class BreadMain {
	public static void main(String[] args) {

		Bread bread = new Bread();
		//빵을 만들었습니다 <--- 1번 메서드 호출시
		//-----------------------------
		//빵을 만들었습니다 <--- 2번 메서드 호출시
		//빵을 만들었습니다 (내가 만들고 싶은 개수만큼)
		//요청하신 2개의 빵을 만들었습니다
		//-----------------------------
		//팥빵을 만들었습니다 <--- 3번 메서드 호출시
		//팥빵을 만들었습니다 (내가 만들고 싶은 빵을 만들고 싶은 개수만큼)
		//요청하신 팥빵을 만들었습니다
		
		
		bread.makeBread(); //1
		
		System.out.println("-------------");
		
		bread.makeBread(2); //2
		
		System.out.println("-------------");
		
		bread.makeBread("팥빵", 3); //3
		
		System.out.println("-------------");
		
		
	}//main

}
