package ex3_static;

public class Bank {

	private String point;//������ġ
	private String tel;//��ȭ
	
	//static������ �޼���� �ش� Ŭ����(Bank)�� �ƹ��� ���� ��ü�� �����ص�
	//static�̶�� �޸� ������ ���� �Ѱ��� ���������.
	static float interest;//������
	
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}	
	
	public void getBank(){
		System.out.println("Location : "+point);
		System.out.println("Contact ; "+tel);
		System.out.println("Rate ; "+interest+"%");
		System.out.println("-----------------------");
	}
}

