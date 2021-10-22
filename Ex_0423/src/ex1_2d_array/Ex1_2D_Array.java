package ex1_2d_array;

public class Ex1_2D_Array {

	public static void main(String[] args) {
		//������ 2���� �迭 4�� 3��
		int arr1[][] = new int[4][3];
		int arr2[][] = {
//				0��,1��,2��
				{1,2,3},//0��
				{4,5,6},//1��
				{7,8,9},//2��
				{10,11,12}//3��
				
		};
		//arr2.length == "2���� �迭�� �� ����"
		for(int i=0; i<arr2.length; i++) {
			//arr2[i].length == "2���� �迭�� i��° �� ����"
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
		
		//-------------------------------------
		
		//arr1�� ������ �����ϱ�
		System.out.println("---------------------");
		System.out.println(arr1.length + "��" + arr1[0].length + "��");
		int n = 1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = n;
				n++;
			}//inner
			
		}//outer
		
		//���� ��� ���
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
