package ex6_variable_arguments;

public class VaTest {

	
	//variable arguments(��������) : 
	//���ڷ� �Ѿ���� �������� ���� ������ ���ִ� ����
	
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
