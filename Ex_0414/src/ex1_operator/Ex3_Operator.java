package ex1_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
//		�������� : �񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
		int age = 20;
		int limit = 25;
		
//		&&(and)������: ���� ������ false�̸� ���� ������ �������� �ʴ´�
//					true && true   �� true
//					true && false  �� false
//					false && true  �� false
//					false && false �� false
		boolean res = limit - age >= 5 && (age+=2) > 20;
		System.out.println("&&���� : "+res);
		System.out.println("age : "+age);
		
//		||(or)������ : ���� ������ true��� ���� ������ �������� �ʴ´�
		int n1 = 10;
		int n2 = 20;
//		              true || true   �� true
//		              true || false  �� true
//		             false || ture   �� true
//		             false || false  �� false
		res = (n1+=10) > 20|| n2-10 == 11;
		System.out.println("||���� : "+res);
		
		boolean bo = true;
//		!(not)���� : true�� false��, false�� true�� ��ȯ
		System.out.println("!���� : "+!bo); //������ ���������� ������ ���� �ٲ��� �ʴ´�
		System.out.println(!bo); //!������ ������ ������ ���� ���
		
		boolean b = true;
		b = !b; //b�� ���� !�����ڸ� ����Ͽ� boolean ���� �ٲٰ� �� ��� ���������� ���� ��
		System.out.println(b);
		
		
		
	} //main

}
