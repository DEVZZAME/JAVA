package ex1_operator;

public class Ex5_Operator {

	public static void main(String[] args) {

//		����(����)������
//		�ϳ��� ���ǽ��� �ΰ�, �ش� ���ǽ��� ���� ���� ������ ���� ���� ����� �ٸ��� �� �� �ֵ��� ���ִ� ������
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b-- ? true : false; // ������ ��� ���� ���� ��� ? ���� ����, ������ ��� ? ���� ����
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = (n1+=n1) == n2 ? 'O' : 'X';
			System.out.println(res2);
			
			a=10;
			b=12;
			//a=11                     a=11+12=23  (23%11=1) -> 22>10
			//++a>=b||2+(12-5)<=b&&13-b>=0&&(a+=b)-(a%b)>10?1:2;
//			   11>=12 || 9<=12 && 1>=0 && 12>10
//				����		   ��             ��              ��   	   
			
			int A = ++a >= b || 2+(12-7) <= b && 13-b >= 0 && (a+=b)-(a%b) > 10 ? 1 : 2;
			System.out.println(A);
		
			int nn1 = 23;
			int nn2 = 11;
			int nn3=nn1%nn2;
					System.out.println("nn1 % nn2 : " + nn3);
	}

}
