package ex4_filereader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {

	public static void main(String[] args) {

		//test.txt�� �����Ͽ� ������ �о�� �� �빮�ڿ� �ҹ����� ������ ����϶�
		
		String path = "C:/web1_����_java/test.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(path);
			int code = 0; //code��� ������ ĳ�����ؼ� �� �����Ұ���
			
			int upper = 0;//�빮�� ����
			int lower = 0;//�ҹ��� ����
			
			while((code=fr.read()) !=-1) {

				if(code>='A' && code <='Z') {
					upper++;
				}
				if(code>='a' && code <='z') {
					lower++;
				}
			}//while
			System.out.println("�빮�� : "+upper);
			System.out.println("�ҹ��� : "+lower);
			
			fr.close();
		} catch (Exception e) {
		}
		
		
		
	}//main

}
