package ex2_abstract;

abstract public class AbsParent {
	//�߻�޼��带 �Ѱ��� ������ �ִ� Ŭ������ 
	//abstract Ű���带 ����Ͽ� �߻�Ŭ�������� �������� �Ѵ�.
	
	int value = 100;
	String str = "hi";
	
	public int getValue() {
		return value;
	}
	
	//�߻� �޼���� abstract Ű���带 ���� ���������
	//�޼����� ��ü(body)�� ����.
	abstract public void setValue(int n);
	//�߻�޼���� ��ü�� ���� ������ �̸� '�̿ϼ��� ����'�̶�� �θ���.
	//�׷��Ƿ� �� �̿ϼ��� ������ �ڽ��� �����޾Ƽ�
	//�ϼ���Ű�� ���� �������� �Ѵ�.
}
