package ex2_abstract;

public class AbsChild extends AbsParent{

	//�߻� Ŭ������ ��� ���� �ڽ� Ŭ������
	//�θ� ������ �ִ� �߻� �޼��带 �ݵ�� �������̵� �� �־� �Ѵ�.
	//����� ���� ���ٰ� �ص� ������ �ִ� ���� ���
	//�̸� ���Ǻ� ����̶�� �Ѵ�
	
	
	@Override
	public void setValue(int n) {
		System.out.println("�ڽ� ������ �°� ������");
	}

}
