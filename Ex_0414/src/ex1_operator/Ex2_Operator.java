package ex1_operator;

public class Ex2_Operator {

	public static void main(String[] args) {

//		�� ������ : >, <, >=, <=, ==, !=
//		������ ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2; //res�� �ڷ����� �񱳿����ڸ� ���� ���� ������� ���� �ʹٸ� boolean�� �Ǿ�� ��
//								�񱳿����ڸ� ���� ������ ����� �ݵ�� boolean ���·� ���ƿ´�
		System.out.println("n1 < n2 : "+res);
		
		res = (n1+=10) >= n2;
		System.out.println("(n1+=10) >= n2 : "+res); // n1+10=20�� n2�� �����Ƿ� ��
		
		res = n1 == n2;
		System.out.println("n1 == n2 : "+res);
		
		res = n1!=n2;
		System.out.println("n1! = n2 : "+res);
		
//		gt(greater than) >, lt(little than) <, le(little equal) <=, ge(greater equal)>=, ne(not equal)!=, eq(equal)=
		
		
	}//main

}
