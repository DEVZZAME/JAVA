package ex1_control_statement;

public class Ex2_if_else {

	public static void main(String[] args) {

//		if-else�� : 
//		if(���ǽ�) {
//			���ǽ��� ���� �� ����Ǵ� ����
//		}else{ ��else���� �׻� �Ұ�ȣ�� ���� ����
//			���ǽ��� ������ �� ����Ǵ� ����
//		}
		
		int n=48;
		String str = "";
		
		if( ++n >= 50 ) {
			str = "n�� 50 �̻��� ��";
		}else {
			str = "n�� 50 �̸��� ��";
		}
		System.out.println(str);
		System.out.println("-----------------");
		
//		�˹ٻ��� �̱�� �ߴ�.
//		�����̸鼭 20�� �̻��� ����� '�հ�'
//		�׷��� ������ '���հ�'
		char gender = '��';
		int age = 22;
		if(gender == '��' && age >= 20) {
			System.out.println("�Կ� ����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
//		 ���� �ڵ带 ���׿����ڷ� �����Ͻÿ�.
		String res = gender == '��' && age >= 20 ? "�հ�" : "���հ�";
		System.out.println(res);
		
		
	}//main

}
