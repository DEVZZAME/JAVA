package ex4_interface;

public interface InterParent {
	//인터페이스는 서비스 요청에 따른 중개자 역할을 하는 클래스
	
	//구성
	//접근제한 interface 인터페이스명{
	//  상수;
	//  추상메서드;
	//}
	
	//인터페이스에는 상수와 추상 메서드만 들어갈 수 있다.
	final int VALUE = 10;
	abstract int getVALUE();
}
