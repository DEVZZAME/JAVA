package ex3_casting;

public class Ex2_demotion {

	public static void main(String[] args) {

//		����� ����ȯ Demotion Casting
//		- ���� �ڷ����� ū �ڷ����� ���ԵǴ� ��
		char c = 'B';//2byte
		int n = c;//4byte promotion casting ���� B��66
		c=66;
//		c=n; int�� 4byte�� ���� �־��µ� char�� ������ �� ��� 2byte�� �ս��� �Ͼ�� ������ �����Ϸ��� ���(red underline)��
		c=(char)n; //((char)��'2byte�� ������ �ս��� �˰��� �����ϰڴ�'�� notice)
		System.out.println(c); 
		
		float f = 5.5f;
		n=0;
//		n=f; ������ �ڷ����� �Ǽ��� �ڷ����� �����ϰ� �� ��� �Ǽ��� �Ҽ��� �ڸ��� �������� �ǹǷ� �����Ϸ��� ��� ��
		n=(int)f; //((int)�� '�Ҽ��� �ڸ��� ������ �ս��� �˰��� �����ϰڴ�'�� notice)
		System.out.println(n); //0.5�� �Ҽ��� ���� ������ ������ ��� ��
		
		float ff = (float)n; // n�� �����̱� ������ �Ǽ��� �׳� ���� ���� ������ (float)�� ���� notice�� ���ֱ⵵ ��
//		Promotion Casting�� �ڵ����� ����ȯ�� �̷��������, Demotion Casting�� �ڵ����� ����ȯ�� �̷������ �ʱ⵵ ��
		System.out.println(ff);
		
		
		
		
		
	} //main

}
