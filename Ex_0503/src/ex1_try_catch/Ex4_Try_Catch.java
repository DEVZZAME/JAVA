package ex1_try_catch;

import java.util.*;

public class Ex4_Try_Catch {

	public static void main(String[] args) {

		//���� : 100
		//��� : 100
		
		//���� : aa
		//aaa��(��) ������ �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = sc.next();
		
		try {
			int num = Integer.parseInt(str);
			System.out.println("��� : "+str);
		} catch (Exception e) {
			System.out.println(str+"��(��) ������ �ƴմϴ�.");
		}
		
		
	}//main

}
