package ex2_set_get;

public class PersonMain {
	public static void main(String[] args) {

		Person p1 = new Person();
//		p1.setName("ȫ�浿");
//		p1.setAge(20);
		p1.setInfo("ȫ���", 32);
		p1.printResult();
		
		Person p2 = new Person();
		p2.setInfo("������", 29);
		p2.printResult();
	}//main
}
