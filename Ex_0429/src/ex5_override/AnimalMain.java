package ex5_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("°õÀÇ ´« : "+bear.getEye());
		System.out.println("°õÀÇ ´Ù¸® : "+bear.getLeg());
		System.out.println("°õÀÇ Æ¯Â¡ : "+bear.woong);
		
		System.out.println("----------------------");
		
		Lion lion = new Lion();
		System.out.println("»çÀÚÀÇ ´« : "+lion.getEye());
		System.out.println("»çÀÚÀÇ ´Ù¸® : "+lion.getLeg());
		System.out.println("»çÀÚÀÇ Æ¯Â¡ : "+lion.galgi);
		
		System.out.println("----------------------");
		
		Snake snake = new Snake();
		System.out.println("¹ìÀÇ ´« : "+snake.getEye());
		System.out.println("¹ìÀÇ ´Ù¸® : "+snake.getLeg());
		System.out.println("¹ìÀÇ Æ¯Â¡ : "+snake.tongue);
	
		System.out.println("----------------------");
		
		Spider spider = new Spider();
		System.out.println("°Å¹ÌÀÇ ´« : "+spider.getEye());
		System.out.println("°Å¹ÌÀÇ ´Ù¸® : "+spider.getLeg());
		System.out.println("°Å¹ÌÀÇ Æ¯Â¡ : "+spider.web);
	
	}//main

}
