package ex5_overlaod;

public class Bread {

	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	} //1
		
	public void makeBread(int n) {
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println("���� ��������ϴ�");
				System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�\n", i);
			}else {
				System.out.println("���� ��������ϴ�");
			}//if
		}//for
	} //2
	
	
	public void makeBread(String s, int n) {
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println(s+"�� ��������ϴ�");
				System.out.printf("��û�Ͻ� %d���� "+ s+"�� ��������ϴ�\n", i);
			}else {
				System.out.println(s+"�� ��������ϴ�");
			}//if
		}//for
	} //3
	
}
