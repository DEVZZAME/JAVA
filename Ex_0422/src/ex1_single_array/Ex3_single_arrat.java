package ex1_single_array;

public class Ex3_single_arrat {

	public static void main(String[] args) {

		//배열 arr에 담긴 모든 값의 합을 출력
		
		
		
		int[] arr = {16, 02, 20, 04, 27, 29, 21, 05, 22};
		int result = 0;
		for(int i =0; i<arr.length; i++) {
			result += arr[i];
		}
		
		float avg = (float)result/arr.length;
		System.out.println("총합:"+result);
		System.out.println("평균:"+avg);
		
		System.out.println("-------------------");
		
		result = 0;
		for(int n : arr) {
			result += n;
		}
		System.out.println("총합:"+result);
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
