package ex5_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("���� �� : "+bear.getEye());
		System.out.println("���� �ٸ� : "+bear.getLeg());
		System.out.println("���� Ư¡ : "+bear.woong);
		
		System.out.println("----------------------");
		
		Lion lion = new Lion();
		System.out.println("������ �� : "+lion.getEye());
		System.out.println("������ �ٸ� : "+lion.getLeg());
		System.out.println("������ Ư¡ : "+lion.galgi);
		
		System.out.println("----------------------");
		
		Snake snake = new Snake();
		System.out.println("���� �� : "+snake.getEye());
		System.out.println("���� �ٸ� : "+snake.getLeg());
		System.out.println("���� Ư¡ : "+snake.tongue);
	
		System.out.println("----------------------");
		
		Spider spider = new Spider();
		System.out.println("�Ź��� �� : "+spider.getEye());
		System.out.println("�Ź��� �ٸ� : "+spider.getLeg());
		System.out.println("�Ź��� Ư¡ : "+spider.web);
	
	}//main

}
