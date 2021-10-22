package ex1_2d_array;

public class Ex1_2D_Array {

	public static void main(String[] args) {
		//정수형 2차원 배열 4행 3열
		int arr1[][] = new int[4][3];
		int arr2[][] = {
//				0열,1열,2열
				{1,2,3},//0행
				{4,5,6},//1행
				{7,8,9},//2행
				{10,11,12}//3행
				
		};
		//arr2.length == "2차원 배열의 행 길이"
		for(int i=0; i<arr2.length; i++) {
			//arr2[i].length == "2차원 배열의 i번째 행 길이"
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
		
		//-------------------------------------
		
		//arr1에 데이터 저장하기
		System.out.println("---------------------");
		System.out.println(arr1.length + "행" + arr1[0].length + "열");
		int n = 1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = n;
				n++;
			}//inner
			
		}//outer
		
		//저장 결과 출력
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
