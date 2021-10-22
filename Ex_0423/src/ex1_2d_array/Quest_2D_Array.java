package ex1_2d_array;

public class Quest_2D_Array {

	public static void main(String[] args) {
		//
		// 1. 정수형 2차원 배열 5행 5열짜리 생성
		// 2. 아래 형태 데이터를 전부 반복문 중첩을 이용해서 셋팅 후 출력
		//
		//     1    2   3   4   5
		//     6    7   8   9  10
		//     11  12  13  14  15
		//     16  17  18  19  20
		//     21  22  23  24  25
		//
		
		// 1. 데이터 저장하기
		
		int arr1[][]=new int[5][5];
		int n = 1;
		System.out.println(arr1.length+"행"+arr1[0].length+"열");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = n;
				n++;
			}//inner
		}//outer
		
		//2. 출력하기
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}//inner
			System.out.println();
		}//outer	
	
		
		
		
		
		
	}

}
