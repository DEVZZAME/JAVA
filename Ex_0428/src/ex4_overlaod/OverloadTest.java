package ex4_overlaod;

public class OverloadTest {
		
		//�����ε��� �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡
		//������ ���ǵǴ� ���� �ǹ�.
	
		//�����ε� �޼����� ��Ģ
		//1) ������ ���� �ٸ����
		//2) ������ ���� ������� Ÿ���� �ٸ� ��
		//3) ������ ���� Ÿ���� ���� ��� ��ġ ������ �ٸ� ��
		
		public void test1() {
			System.out.println("���ڰ� ���� �޼���");
		}
		
		public void test1(int n) {//�Ķ���Ϳ��� ������ �߿����� ����, ������ Ÿ�Ը� �߿�
			System.out.println("���ڸ� ������ �޴� �޼���");
		}
		
		public void test1(char c) {
			System.out.println("���ڸ� ���ڷ� �޴� �޼���");
		}
		
		public void test1(String s) {
			System.out.println("���ڸ� ���ڿ��� �޴� �޼���");
		}
		
		public void test1(int n, char c) {//Ÿ���� ������ �޶� ����
			System.out.println("����, ���ڸ� ���ڷ� �޴� �޼���");
		}
		
		public void test1(char c, int n) {//Ÿ���� ������ ������ ������ �޶� ����
			System.out.println("����, ������ ���ڷ� �޴� �޼���");
		}
}
