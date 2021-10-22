package ex2_collection;

import java.util.*;

public class Ex2_Set {
	public static void main(String[] args) {

		//제너릭타입은 기본자료형으로 사용할 수 없기 때문에
		//int, boolean 등의 기본자료형을 제너릭으로 지정하려면
		//각 기본자료형의 wrapper클래스를 사용해야 한다
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while( true ){
			//1~45 사이의 중복되지 않는 난수를 6개 저장하는 로또번호 생성기 만들기
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
		//ts는 기본 오름차순 정렬
		//.descendingSet() : 내림차순 정렬
		System.out.println(ts.descendingSet());
		
		//HashSet : 정렬기능 없음
		//TreeSet : 오름차순 정렬
		System.out.println(ts.subSet(10, 30));
		
	}//main

}
