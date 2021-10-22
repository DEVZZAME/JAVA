package ex4_interface;

public class InterMain {
	public static void main(String[] args) {
		
		//인터페이스 역시 미완성의 메서드를 가지고 있으므로
		//자식을 통해 함께 생성되지 않는 이상 스스로 인스턴스를 가질 수 없다.
		//InterParent p = new InterParent();
		
		InterChild c = new InterChild();
		c.getVALUE();
		
		
	}//main

}
