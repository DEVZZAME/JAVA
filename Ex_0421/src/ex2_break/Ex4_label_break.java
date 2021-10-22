package ex2_break;

public class Ex4_label_break {

	public static void main(String[] args) {

		//label : 가장 가까운 반복문에만 적용되는 break, continue와는 달리
		//가깝지 않은 반복문까지 제어가 가능하도록 하는 키워드
		//한번에 두개 이상의 반복문에 영향을 줄 수 있음
		
		out : for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j%2==0) {
					break out;//break 뒤에 label을 붙이면
							//해당 이름(out)을 가진 for문을 통째로 빠져나감
				}//if
				
				System.out.print(j+" ");
				
			}//inner
			System.out.println();
		}//outer
		
		
		
	}//main

}
