package ex1_computer;
//���赵������ ���� �޼��带 ����� �ȵ�
public class Computer {
	//Ŭ������ ���� ���
	//1) ����, �Ӽ�, ��� (��� ���� �ǹ�/ssd, ram, cpu ��)
	//2) �޼���, ���, �Լ� (��� ���� �ǹ�/info)
	//Ŭ������ ������� �Ӽ��̳� �޼��� �� �� �ϳ��� ������ �־�� ��
	
	//���赵�� ����� �۾�
	private String company = "apple";
	int ssd = 512;
	int ram = 256;
	float cpu = 2.5f;
	String color = "black";
	
	//�޼��� : � �۾��� �����ϱ� ���� ��ɹ��� ����
	//�޼��带 ���� �ݺ������� ���Ǵ� �ڵ带 ���� �� �ִ�.
	public void info() {
		System.out.println("������ : "+company);
		System.out.println("SSD : "+ssd+"GB");
		System.out.println("RAM : "+ram+"GB");
		System.out.println("CPU : "+cpu+"GHz");
		System.out.println("COLOUR : "+color);
		System.out.println("-------------------------");
	}
		
	//�޼����� ����
	//����������	��ȯ��	�޼����( �Ķ����, ����, �Ű�����, argument ){ �޼��� ȣ��� ����Ǵ� ���� }
	//public	void	info(){  }
		
	//����������
	//1) public : ���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
	//2) private : ���� Ŭ���������� ����� �㰡, �ٸ� Ŭ���������� ������ �ȵ�. ���� X
	//3) protected : ��Ӱ����� ��ü�鿡�Ը� ����� �㰡
	//4) default : ���� ��Ű�� ���� ��ü�鿡�Ը� ����� �㰡
		
		
		
		
		
		
		
		
		
		
		
		

}
