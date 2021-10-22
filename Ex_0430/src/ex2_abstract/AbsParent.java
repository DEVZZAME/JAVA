package ex2_abstract;

abstract public class AbsParent {
	//추상메서드를 한개라도 가지고 있는 클래스는 
	//abstract 키워드를 사용하여 추상클래스임을 명시해줘야 한다.
	
	int value = 100;
	String str = "hi";
	
	public int getValue() {
		return value;
	}
	
	//추상 메서드는 abstract 키워드를 통해 만들어지며
	//메서드의 몸체(body)가 없다.
	abstract public void setValue(int n);
	//추상메서드는 몸체가 없기 때문에 이를 '미완성의 개념'이라고 부른다.
	//그러므로 이 미완성된 개념을 자식이 물려받아서
	//완성시키는 것을 목적으로 한다.
}
