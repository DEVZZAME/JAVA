package ex6_variable_arguments;

public class VaTest {

	
	//variable arguments(가변인자) : 
	//인자로 넘어오는 데이터의 갯수 제한을 없애는 구조
	
	public void test(int... n) {
//		n[0] -> 1
//		n[1] -> 2
//		......
//		n[n-1] -> n
		
		for(int i =0; i<n.length; i++) {
			System.out.print(n[i]);
		}
		
		
	}
}
