package ex5_interface;

public class Kitchen implements Menu3{
	//�������̽��� �߻�޼��常 �����ϱ� ������ ���߱����� ����
	
	@Override
	public String jjajang() {
		return "�߸�  + ���� + �ϵ���";
	}
	
	@Override
	public String jjambbong() {
		return "��ġ + ��¡�� + �öѱ�";
	}

	@Override
	public String tangsuyuck() {
		return "������� + ��� + ����";
	}

	@Override
	public String nanjawans() {
		return "���� + �Ͻ�";
	}

	@Override
	public String friedrice() {
		return "¥��ҽ� + �ް�";
	}






}
