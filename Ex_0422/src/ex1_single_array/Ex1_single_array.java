package ex1_single_array;

public class Ex1_single_array {

	public static void main(String[] args) {

		// �迭 : ���� �ڷ������� ��Ƶ� �ϳ��� ����
		// ȿ������ �ڷ������ ���� �ݵ�� �ʿ�

		String name1 = "ȫ�浿";
		String name2 = "����ġ";
		String name3 = "�̽��ͼ�";
		String name4 = "����Ű��";

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);

		System.out.println("-------------------");

		// 1) �迭����
		int[] arr;

		// 2) �迭����
		arr = new int[5];

		// 3) �ʱ�ȭ
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		// �迭�� �������� �ʴ� index�� �����Ͽ� ���� �ְų� ���� ���� �Ұ���
		// arr[4] = 500;

		System.out.println(arr[3]);

		// for���� ����Ͽ� arr �迭�� ��� ��� ���� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------");
		
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=i+1;
			System.out.println(arr2[i]);
		}

		
		
		
		
		
		

	}// main

}
