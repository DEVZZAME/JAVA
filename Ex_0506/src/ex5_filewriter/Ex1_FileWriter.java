package ex5_filewriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {

		String path = "C:/web1_����_java/fileWriter����.txt";
		
		try {
			
			FileWriter fw = new FileWriter(path);
			String str = "���� fileWriter�� ����\n";
			String str2 = "You can also writer second line.";
					
			fw.write(str);
			fw.write(str2);
			
			//fw.flush(); �ۼ��ϰ��� �ϴ� ������ ���������� ����ϴ� �޼���
			fw.close();//close()�� ��Ʈ���� ���� �� ���ο��� flush()�޼��尡 �ڵ����� ȣ��
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
	}//main

}
