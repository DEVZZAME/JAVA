package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		//IO(Input, Output)
		//IO�� ����� ��Ʈ���� �ǹ��Ѵ�.
		//��Ʈ���̶� �����͸� �ְ�ޱ� ���� ���
		//JVM���� �ַܼ� ���� ������ ��� Output, �ܼ��� ���� JVM���� �о�� �� ���� Input
		
		String path = "C:/web1_����_java/test.txt";
		File f = new File(path);
		
		System.out.println(f.length()+"byte");
		
	}//main

}
