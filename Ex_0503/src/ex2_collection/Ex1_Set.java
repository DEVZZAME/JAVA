package ex2_collection;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {

		//collection : �迭�� �޸� index�� ���������� ����
		//�ټ��� �����͸� ���� ȿ�������� ó���� �� �ֵ��� ������
		//index ���� ü�踦 �����ϴ� Ŭ���� ����
		
		//Set( HashSet, TreeSet )
		//Map( HashMap, TreeMap )
		//List(ArrayList )
		
		//Set�� java.util��Ű���� �ִ� �������̽�
		//Ư�� �ڵ忡�� �ߺ��� ���� ����� �־�� �ȵ� �� ���.
		
		//<E> : �÷����� ����� �ڷ����� Ÿ���� �����ϱ� ���� ���ʸ� Ÿ��.
		//���ʸ� Ÿ�Կ� ��õǾ� �ִ� Ŭ����(�⺻�ڷ��� x)Ÿ���� ����
		//������ �÷��� ��ü�� ������ �ڷ����� ������ �� �� �ִ�.
		HashSet<String> hs = new HashSet<String>();
		hs.add("����");
		hs.add("����");
		hs.add("���ڱ�");
		hs.add("��");
		hs.remove("����");
		
		
		//set, map, list ��� �迭�� length�� ���� �뵵�� size()�޼��带 ���
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}//main

}
