package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		String path = "C:/web1_����_java/";
		File f = new File(path);
		
		if( f.isDirectory()) { //!f.isFile()
			
			String[] names = f.list();//��������� �̸��� String�迭�� ��Ƽ� ����
			
			for(int i=0; i<names.length; i++) {
				System.out.println(names[i]);
			}
			
			
		}
		
		
		
	}//main

}
