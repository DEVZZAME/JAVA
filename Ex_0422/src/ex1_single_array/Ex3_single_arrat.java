package ex1_single_array;

public class Ex3_single_arrat {

	public static void main(String[] args) {

		//�迭 arr�� ��� ��� ���� ���� ���
		
		
		
		int[] arr = {16, 02, 20, 04, 27, 29, 21, 05, 22};
		int result = 0;
		for(int i =0; i<arr.length; i++) {
			result += arr[i];
		}
		
		float avg = (float)result/arr.length;
		System.out.println("����:"+result);
		System.out.println("���:"+avg);
		
		System.out.println("-------------------");
		
		result = 0;
		for(int n : arr) {
			result += n;
		}
		System.out.println("����:"+result);
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
