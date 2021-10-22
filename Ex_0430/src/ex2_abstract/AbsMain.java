package ex2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 자신이 미완성한 개념을 자식이 생설될 때
		//완성시키도록 조건부 상속을 하고 있다.
		AbsChild c = new AbsChild();
		c.setValue(10);
		
		//추상클래스는 미완성된 개념을 가지고 있기 때문에
		//new를 통해 직접적인 인스턴스를 가질 수 없다.
//		AbsParent p = new AbsParent();
		
	}//main
}
