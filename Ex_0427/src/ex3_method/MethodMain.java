package ex3_method;

public class MethodMain {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		mt.test1();
		
		int su = 100;
		su = mt.test2(su);
		
		System.out.println("su : "+su);
		
		
		String res = mt.person("ȫ�浿", 20);
		System.out.println(res);
		
	}//main

}
