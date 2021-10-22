package ex2_set_get;

public class Person {
	private String name;
	private int age;
	
	public void setInfo( String name, int age) {
		//this : 현재 클래스(Person)자신
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
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
