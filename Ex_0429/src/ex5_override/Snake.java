package ex5_override;

public class Snake extends Animal{

	String tongue = "���� �ΰ���";

	//�޼����� �������̵� : '�޼����� ������'�� �ǹ̤��� ������,
	//��Ӱ����� ��ü���� �θ��� �޼��带 �״�� ��������,
	//���븸 �ڽ�Ŭ���� ������ �µ��� ������ �ϴ� ��
	
	@Override
	public int getLeg() {
		return 0;
	}
}
