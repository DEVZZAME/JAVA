package ex2_constructor;

public class Pen {

	private String company = "monami";
	private String colour = "white";
	private int price = 500;
	
	public Pen() {
		
	}
	
	
	public Pen(String colour, int price) {//������ �����ε�, Setter, Getter���� ���ȼ��� ������ ������ �����
		this.colour = colour;
		this.price = price;
	}
	
	

	
	
	
	public void myPen() {
		System.out.println("������ : "+company);
		System.out.println("��   �� : "+colour);
		System.out.println("��   �� : "+price);
		System.out.println("------------------");
	}
	
}
