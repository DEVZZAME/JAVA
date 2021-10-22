package ex2_set_get;

public class PersonMain {
	public static void main(String[] args) {

		Person p1 = new Person();
//		p1.setName("È«±æµ¿");
//		p1.setAge(20);
		p1.setInfo("È«±æ¼ø", 32);
		p1.printResult();
		
		Person p2 = new Person();
		p2.setInfo("¹ÚÁö¿ø", 29);
		p2.printResult();
	}//main
}
