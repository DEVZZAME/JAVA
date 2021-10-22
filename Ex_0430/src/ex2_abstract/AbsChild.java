package ex2_abstract;

public class AbsChild extends AbsParent{

	//추상 클래스를 상속 받은 자식 클래스는
	//부모가 가지고 있는 추상 메서드를 반드시 오버라이딩 해 둬야 한다.
	//사용할 일이 없다고 해도 가지고 있는 것이 약속
	//이를 조건부 상속이라고 한다
	
	
	@Override
	public void setValue(int n) {
		System.out.println("자식 사정에 맞게 재정의");
	}

}
