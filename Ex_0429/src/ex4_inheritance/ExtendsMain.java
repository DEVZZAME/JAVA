package ex4_inheritance;

public class ExtendsMain{
	public static void main(String[] args) {

		Child c1 = new Child();
		System.out.println(c1.car);
		
		//상속관계의 객체에서 자식클래스는 부모의 속성을 마음대로 가져다가 사용할 수 있다.
		System.out.println(c1.money);
		System.out.println(c1.RealEstate);
		
		
		//자식객체(c1)가 부모클래스(Parent)와 같은 주소를 공유하는지(인스턴스가 같은지)를
		//확인하는 키워드 : instanceof
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 친자임이 확실합니다!");
		}
		
		Parent p1 = new Parent();
		//상속관계라고 할지라도 부모클래스는 자식의 속성을 마음대로 사용할 수 없다.
		System.out.println(p1.money);
		
		
	}//main

}
