package ex3_method;

public class MethodTest {
	
	public String person(String name , int age) {
		return name + "�� ���̴� "+ age;
	}
	
	
	
	public int test2(int n) {
		//�޼����� �Ķ���ʹ� �⺻������ ���纻�� �Ѿ��,
		//�ش� ���纻�� �޼����� ����� �Ϸ�� �� �޸𸮿��� ����
		n+=100;
		System.out.println("n : "+n);
		return n;
		//void �̿��� ��ȯ���� ���� �Ǿ��ٸ�, �ݵ�� �ش� ��ȯ�� Ÿ������
		//return�� ���� ���� (test2()�޼��带 ȣ���ߴ� ������)��ȯ�ؾ� �Ѵ�
		//��ȯ���� void���ٸ� return�� ���� ��ȯ�� �ʿ� ����
		//��ȯ���� int��� �ݵ�� ���������� ���� return�ؾ� �ϸ�,
		//���ÿ� �������� ���� return(��ȯ)�� �� ����.
		//return �ڵ� �Ʒ����� �ƹ��͵� ���� ���� ����.
	}//test2
	
	
	public void test1() {
		//��ȯ���� void�� �Ǿ� �ִٸ� �ڹ��� � �ڷ��� Ÿ�����ε� ���� ���� ���� �� ����
		System.out.println("test1()�޼��尡 ȣ�� �ƽ��ϴ�");
	}//test1

}
