package ex1_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
//		if(�ܼ� ���ǹ�)
//		else-if(���� ���ǹ�) : �������� ���� �񱳰� �ʿ��� ���
/*		if(���ǽ� 1){
				���ǽ� 1�� ���� �� ����Ǵ� ����
				}else if(���ǽ� 2){
				���ǽ� 2�� ���� �� ����Ǵ� ����
				}.......(){
				}else{
				}
				
*/
		int num = 0;
		String str = "";
		if(num >= 90) {
			str = "A";
		}else if(num >= 80) {
			str = "B";
		}else if(num >= 70) { //�� ���ǹ��� ���� ���ϴٰ� ���� ����� ������ ���� ���Ŀ��� �񱳸� ���� �ʰ� ���� ��
			str = "C";
		}else if(num >= 60) {
			str = "D";
		}else{
//			���� if�� else if���� ������ �ִ� ��� ������ ������ ��
//			���������� �ݵ�� ����Ǵ� ����
			str = "F";
		}
		System.out.println(str);
		
		
		
} //main
}
