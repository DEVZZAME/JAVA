package ex3_static;

public class Bank {

	private String point;//은행위치
	private String tel;//전화
	
	//static변수나 메서드는 해당 클래스(Bank)가 아무리 많이 객체를 생성해도
	//static이라는 메모리 영역에 오직 한개만 만들어진다.
	static float interest;//이자율
	
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}	
	
	public void getBank(){
		System.out.println("Location : "+point);
		System.out.println("Contact ; "+tel);
		System.out.println("Rate ; "+interest+"%");
		System.out.println("-----------------------");
	}
}

