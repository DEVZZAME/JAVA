package ex2_set_get;

public class Person {
	private String name;
	private int age;
	
	public void setInfo( String name, int age) {
		//this : ���� Ŭ����(Person)�ڽ�
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;

	}
	
	public void printResult() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
