package ex1_control_statement;

public class Ex1_if {

	public static void main(String[] args) {

//		��� : ���α׷��� �帧�� �����ϴ� ����
//		1) �б⹮ : if, switch
//		2) �ݺ��� : for, while
		
//		�ܼ� if�� : 
//		if( ���ǽ� ){
//			���ǽ��� ���� �� ����Ǵ� ����
//		}
//		���ǽ��� �׻� �� �Ǵ� ������ ��� ���� ������ ���̾�� ��
		
		int n = 51;
		String str = "";
		
		if(n == 50) {
//			���ǽ��� ���� �� if ������ �ڵ带 ������ �� ����������
			str = "50�Դϴ�";
		}
		
		if(n != 50) {
			str = "50�� �ƴմϴ�!";
		}
		System.out.println(str);
		
		
	}//main

}
