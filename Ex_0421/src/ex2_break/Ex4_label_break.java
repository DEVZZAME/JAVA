package ex2_break;

public class Ex4_label_break {

	public static void main(String[] args) {

		//label : ���� ����� �ݺ������� ����Ǵ� break, continue�ʹ� �޸�
		//������ ���� �ݺ������� ��� �����ϵ��� �ϴ� Ű����
		//�ѹ��� �ΰ� �̻��� �ݺ����� ������ �� �� ����
		
		out : for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j%2==0) {
					break out;//break �ڿ� label�� ���̸�
							//�ش� �̸�(out)�� ���� for���� ��°�� ��������
				}//if
				
				System.out.print(j+" ");
				
			}//inner
			System.out.println();
		}//outer
		
		
		
	}//main

}
