package ex1_single_array;

public class Ex2_single_array {

	public static void main(String[] args) {

		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		// JAVA

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		} // for

		System.out.println();

		// �迭�� ����, ����, �ʱ�ȭ�� �ѹ���
		String[] str = { "�ȳ�", "����", "�Ѽ��̶��", "�ؿ�!" };

//		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]+" ");
//		}//for

		// ������ ����(���� for��)
		// for�� list�� ���� ��� ������ �ϳ��� �������� ����ϰ��� �ϴ� �뵵�� ���ߵ� ����
		for (String s : str) {
			System.out.print(s+" ");
		}

	}// main

}
