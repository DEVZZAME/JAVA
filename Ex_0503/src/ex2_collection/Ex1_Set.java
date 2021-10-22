package ex2_collection;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {

		//collection : 배열과 달리 index의 갯수제한이 없어
		//다수의 데이터를 쉽고 효과적으로 처리할 수 있도록 동적인
		//index 관리 체계를 제공하는 클래스 개념
		
		//Set( HashSet, TreeSet )
		//Map( HashMap, TreeMap )
		//List(ArrayList )
		
		//Set은 java.util패키지에 있는 인터페이스
		//특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용.
		
		//<E> : 컬렉션이 사용할 자료형의 타입을 지정하기 위한 제너릭 타입.
		//제너릭 타입에 명시되어 있는 클래스(기본자료형 x)타입을 통해
		//앞으로 컬렉션 객체가 관리할 자료형을 지정해 둘 수 있다.
		HashSet<String> hs = new HashSet<String>();
		hs.add("가위");
		hs.add("바위");
		hs.add("보자기");
		hs.add("보");
		hs.remove("가위");
		
		
		//set, map, list 모두 배열의 length와 같은 용도로 size()메서드를 사용
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}//main

}
