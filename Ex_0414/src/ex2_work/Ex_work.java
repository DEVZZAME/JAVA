package ex2_work;

public class Ex_work {

	public static void main(String[] args) {

//		과수원이 있다.
//		배, 사과, 오렌지를 키우고 있는데 하루 생산량을 각각
//		5, 7, 6개
//		1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력하시오.
//		  배+사과+오렌지 개수 출력
//		2)전체과일이 24시간에 걸쳐 1시간에 몇개씩 만들어지는지를 출력
//		 각각 24시간 나누기 생산개수
//		단, 과일의 갯수를 저장하는 변수는 int 타입으로
//		하루 생산량을 저장하는 변수도 int타입으로
//		시간당 평균 갯수를 저장할 변수는 float타입으로 만드시오.
		
		int pear=5, apple=7, orange=6;
		int total = pear+apple+orange;
		System.out.println("하루 총 생산량 : "+total+"개");
		float avg = total/24f;
		System.out.println("시간당 생산량 : "+avg+"개");
		
		/*System.out.println(시간당 총 생산량);
		int all = pear+apple+orange;
		System.out.println("하루 총 생산 개수 : "+all+"개");
		float phour = 24/pear;
		float ahour = 24/apple;
		float ohour = 24/orange;
		System.out.println("배 : "+phour+"개");
		System.out.println("사과 : "+ahour+"개");
		System.out.println("오렌지 : "+ohour+"개");
		
		float hour = 24/(5+7+6);
		System.out.println(hour);*/
		
		

		
		
		
		
	}

}
