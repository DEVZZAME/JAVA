package ex1_computer;
//설계도에서는 메인 메서드를 만들면 안됨
public class Computer {
	//클래스의 구성 요소
	//1) 변수, 속성, 멤버 (모두 같은 의미/ssd, ram, cpu 등)
	//2) 메서드, 기능, 함수 (모두 같은 의미/info)
	//클래스를 만들려면 속성이나 메서드 둘 중 하나는 가지고 있어야 함
	
	//설계도를 만드는 작업
	private String company = "apple";
	int ssd = 512;
	int ram = 256;
	float cpu = 2.5f;
	String color = "black";
	
	//메서드 : 어떤 작업을 수행하기 위한 명령문의 집합
	//메서드를 통해 반복적으로 사용되는 코드를 줄일 수 있다.
	public void info() {
		System.out.println("제조사 : "+company);
		System.out.println("SSD : "+ssd+"GB");
		System.out.println("RAM : "+ram+"GB");
		System.out.println("CPU : "+cpu+"GHz");
		System.out.println("COLOUR : "+color);
		System.out.println("-------------------------");
	}
		
	//메서드의 구성
	//접근제한자	반환형	메서드명( 파라미터, 인자, 매개변수, argument ){ 메서드 호출시 실행되는 영역 }
	//public	void	info(){  }
		
	//접근제한자
	//1) public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	//2) private : 현재 클래스에서만 사용을 허가, 다른 클래스에서는 접근이 안됨. 변경 X
	//3) protected : 상속관계의 객체들에게만 사용을 허가
	//4) default : 같은 패키지 내의 객체들에게만 사용을 허가
		
		
		
		
		
		
		
		
		
		
		
		

}
