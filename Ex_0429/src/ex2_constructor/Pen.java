package ex2_constructor;

public class Pen {

	private String company = "monami";
	private String colour = "white";
	private int price = 500;
	
	public Pen() {
		
	}
	
	
	public Pen(String colour, int price) {//생성자 오버로딩, Setter, Getter보다 보안성은 높지만 수정이 어려움
		this.colour = colour;
		this.price = price;
	}
	
	

	
	
	
	public void myPen() {
		System.out.println("제조사 : "+company);
		System.out.println("색   상 : "+colour);
		System.out.println("가   격 : "+price);
		System.out.println("------------------");
	}
	
}
