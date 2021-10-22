package ex1_try_catch;

public class Ex1_Try_Catch {
	public static void main(String[] args) {
		
		//Try-Catch(����ó��)
		//�ڹٿ��� ���α׷��� ����Ǵ� ���߿� ����(����, ����)�� �߻��ϸ�
		//�� �������� ���α׷��� ���������� ����ȴ�.
		//�̰��� �ùٸ� �Ǵ�������, ���δ� ���������� ������ ���� ���α׷���
		//������ �������� �ʰ�, ������ �۾��� �����ϰ��� �� ���� �ִ�.
		//����ó�� ������ ���� ���α׷��� ���������� ���Ḧ �ٿ�����!!
		
		//try{
		//   ���ܹ߻� �ڵ�
		//}catch( Exception e ){
		//    try���� ������ �߻��� ��� ����Ǵ� ����
		//}
		
		int n = 2;
		int result = 0;
		
		int[] arr = new int[3];
		
		
		try {
			result = 10 / n;
			arr[2] = 100;
					
		} catch (ArithmeticException e) {
			//�߻��� ������ �̸��� ������ִ� �޼���
			//e.printStackTrace();
			
			//try���� ������ �߻��� ��� ����Ǵ� ����
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array�� index�� �߸��Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		} finally{
			//���ܹ߻� ���ο� ������� �ݵ�� �ѹ��� ȣ��Ǵ� ����
			System.out.println("finally ����");
		}
		
		System.out.println("��� : "+result);
		
		
	}//main
}
