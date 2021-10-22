package ex2_constructor;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.myPen();
		
		//한정판으로 만들고 싶다면
		Pen p2 = new Pen("skyblue", 50000);
		p2.myPen();
		

		
	}//main

}
