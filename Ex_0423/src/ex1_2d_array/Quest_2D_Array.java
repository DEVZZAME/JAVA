package ex1_2d_array;

public class Quest_2D_Array {

	public static void main(String[] args) {
		//
		// 1. ������ 2���� �迭 5�� 5��¥�� ����
		// 2. �Ʒ� ���� �����͸� ���� �ݺ��� ��ø�� �̿��ؼ� ���� �� ���
		//
		//     1    2   3   4   5
		//     6    7   8   9  10
		//     11  12  13  14  15
		//     16  17  18  19  20
		//     21  22  23  24  25
		//
		
		// 1. ������ �����ϱ�
		
		int arr1[][]=new int[5][5];
		int n = 1;
		System.out.println(arr1.length+"��"+arr1[0].length+"��");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = n;
				n++;
			}//inner
		}//outer
		
		//2. ����ϱ�
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}//inner
			System.out.println();
		}//outer	
	
		
		
		
		
		
	}

}
