package ex4_overlaod;

public class OverMain {

	public static void main(String[] args) {
		
		OverloadTest ot = new OverloadTest();
		ot.test1();
		ot.test1(1);
		ot.test1('A');
		ot.test1("S");
		ot.test1(10, 'B');
		ot.test1('C', 100);
	}//main

}
