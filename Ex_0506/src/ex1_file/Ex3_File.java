package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
	
		String path = "C:/web1_����_java/abc/bbb";
		File f = new File(path);
		
		//FileŬ������ path��ΰ� ���������� ��� �����ϴ��� Ȯ��
		if(!f.exists()) {//f.exists() == false
			//���� ����Ŭ������ ��ο��� ���������� abc������ �����Ƿ� if������ ���´�
			
			//���� �������� �ʴ� abc������ ������ ����
			f.mkdirs();//��������(���ϻ���X) make directory
			
		}else {
			System.out.println("������ �̹� ������");
		}
		
		//����, ���� �� path ��ο� �ִ� ������ �����͸� ����
		//��, ������ ������� �ϴ� ��� �ش� ���� �ȿ� file�� ���ԵǾ� �ִٸ�
		//�������� �ʴ´�.
		//Ư�� ���� �ȿ� file�� �Բ� �� ���� ��쿡�� 
		//�ȿ� �ִ� ������ ���� �����ϰ� ������ �����ϴ� ���·� ����
		//f.delete();
		
	}//main
}
