package ex3_casting;

public class Ex1_promotion {

	public static void main(String[] args) {

//	��	����� ����ȯ Promotion Casting
//		1) ���θ�� ĳ����
//		 - ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n; //�Ǽ��� �ڷ����� ������ �ڷ����� ������ ��� ������ �Ǽ��� ��ȯ�Ǿ� ��� ��(����ȯ)
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n2 = 100; //4byte
		n2=c;
		System.out.println(n2);//������ �ڷ����� ������ �ڷ����� ������ ��� ���ڰ��� ������ ��ȯ�Ǿ� ��� �� by ASCII
		
//		
		
		
		
		
		
		
		
		
	} //main

}
