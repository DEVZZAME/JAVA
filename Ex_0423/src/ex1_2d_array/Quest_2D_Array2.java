package ex1_2d_array;

public class Quest_2D_Array2 {

	public static void main(String[] args) {
		
		// 1. ������ �迭 5�� 5���� �ش��ϴ� �迭 ����
		// 2. �Ʒ� ���·� �����͸� ä�� �� ���
		// 
		//  1	2	3	4	5
		//  10	9 	8	7	6
		//	11	12	13	14	15
		//	20	19	18	17	16
		//	21	22	23	24	25
		
		//1,3,5 ���� ����, 2,4���� ����
		
		int arr1[][] = new int[5][5];
		int n = 1;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i].length%2==0) {
					arr1[i][j] = n++;
				} else {
					arr1[i][j] = n--;
				}
			}//inner
		}//outer
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
			System.out.print(arr1[i][j]+"	");
			}//inner
			System.out.println();
		}//outer
	}

}
