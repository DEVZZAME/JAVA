package ex2_collection;

import java.util.*;

public class Ex2_Set {
	public static void main(String[] args) {

		//���ʸ�Ÿ���� �⺻�ڷ������� ����� �� ���� ������
		//int, boolean ���� �⺻�ڷ����� ���ʸ����� �����Ϸ���
		//�� �⺻�ڷ����� wrapperŬ������ ����ؾ� �Ѵ�
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while( true ){
			//1~45 ������ �ߺ����� �ʴ� ������ 6�� �����ϴ� �ζǹ�ȣ ������ �����
			int r = new Random().nextInt(45)+1;
			
			hs.add(r);
			
			if(hs.size()==6) {
				System.out.println(hs);
				break;
			}
		}//while

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(true) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);
			if(ts.size()==6) {

				break;
			}

		}
		//ts�� �⺻ �������� ����
		//.descendingSet() : �������� ����
		System.out.println(ts.descendingSet());
		
		//HashSet : ���ı�� ����
		//TreeSet : �������� ����
		System.out.println(ts.subSet(10, 30));
		
	}//main

}
