package ex5_overlaod;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	} //1
		
	public void makeBread(int n) {
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println("빵을 만들었습니다");
				System.out.printf("요청하신 %d개의 빵을 만들었습니다\n", i);
			}else {
				System.out.println("빵을 만들었습니다");
			}//if
		}//for
	} //2
	
	
	public void makeBread(String s, int n) {
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println(s+"을 만들었습니다");
				System.out.printf("요청하신 %d개의 "+ s+"을 만들었습니다\n", i);
			}else {
				System.out.println(s+"을 만들었습니다");
			}//if
		}//for
	} //3
	
}
