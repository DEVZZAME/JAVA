package ex1_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		
//		���������� : 1�� ���� ��Ű�ų� 1�� ���� ��Ű�� ������
//		���������� ���������� �������� �˾Ƶ���
		int a = 10;
		System.out.println("a : "+ ++a);
		
		int b = 10;
		System.out.println("b : "+ b++);
		System.out.println("b : "+b);
		
		++b;
		++b;
		b++;
		--b;
		b++;
		b--;
		--b;
		System.out.println(b--);
	} //main

}
