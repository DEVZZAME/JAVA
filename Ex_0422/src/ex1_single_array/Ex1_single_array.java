package ex1_single_array;

public class Ex1_single_array {

	public static void main(String[] args) {

		// 배열 : 같은 자료형끼리 모아둔 하나의 묶음
		// 효율적인 자료관리를 위해 반드시 필요

		String name1 = "홍길동";
		String name2 = "마루치";
		String name3 = "미스터손";
		String name4 = "원더키디";

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);

		System.out.println("-------------------");

		// 1) 배열선언
		int[] arr;

		// 2) 배열생성
		arr = new int[5];

		// 3) 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		// 배열에 존재하지 않는 index로 접근하여 값을 넣거나 빼는 것은 불가능
		// arr[4] = 500;

		System.out.println(arr[3]);

		// for문을 사용하여 arr 배열에 담긴 모든 값을 출력
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
