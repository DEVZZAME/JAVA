package ex5_override;

public class Spider extends Animal{

	String web = "�Ź��� ��~";

	@Override
	public int getEye() {
		return 6;
	}
	
	@Override
	public int getLeg() {
		return 8;
	}
	
}
