package ex2_single_for;

public class Ex1_single_for {

	public static void main(String[] args) {

//		for�� : Ư�� ����� ���ϴ� ��ŭ �ݺ������� �����ϰ��� �� �� ���
//		for(�ʱ�� ; ���ǽ�; ������){
//		���ǽ��� ���� �� ����Ǵ� ����
//		}
		int n = 10; // ���� ����
//		    int i=��������, for�� �������� ��� ����
//		for(int i=1; i<4; i++) {
//			
//			n += 10;
//			System.out.println(i);
//		}
//		System.out.println(n);
//		
//		Q. 10���� 1�� �پ��� ����ϴ� for���� ����ÿ�.
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
//		Q. 1���� 100������ �ݺ��ϴ� for������ 3�� ����� ����Ͻÿ�.
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}//main

}
