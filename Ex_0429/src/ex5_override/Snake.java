package ex5_override;

public class Snake extends Animal{

	String tongue = "혀가 두갈래";

	//메서드의 오버라이딩 : '메서드의 재정의'의 의미ㅐ를 가지며,
	//상속관계의 객체에서 부모의 메서드를 그대로 가져오되,
	//내용만 자식클래스 사정에 맞도록 재정의 하는 것
	
	@Override
	public int getLeg() {
		return 0;
	}
}
