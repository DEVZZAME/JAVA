package ex4_inheritance;

public class ExtendsMain{
	public static void main(String[] args) {

		Child c1 = new Child();
		System.out.println(c1.car);
		
		//��Ӱ����� ��ü���� �ڽ�Ŭ������ �θ��� �Ӽ��� ������� �����ٰ� ����� �� �ִ�.
		System.out.println(c1.money);
		System.out.println(c1.RealEstate);
		
		
		//�ڽİ�ü(c1)�� �θ�Ŭ����(Parent)�� ���� �ּҸ� �����ϴ���(�ν��Ͻ��� ������)��
		//Ȯ���ϴ� Ű���� : instanceof
		if(c1 instanceof Parent) {
			System.out.println("c1�� Parent�� ģ������ Ȯ���մϴ�!");
		}
		
		Parent p1 = new Parent();
		//��Ӱ����� ������ �θ�Ŭ������ �ڽ��� �Ӽ��� ������� ����� �� ����.
		System.out.println(p1.money);
		
		
	}//main

}
