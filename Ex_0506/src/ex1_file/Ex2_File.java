package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		String path = "C:/web1_오후_java/";
		File f = new File(path);
		
		if( f.isDirectory()) { //!f.isFile()
			
			String[] names = f.list();//하위목록의 이름을 String배열로 담아서 전달
			
			for(int i=0; i<names.length; i++) {
				System.out.println(names[i]);
			}
			
			
		}
		
		
		
	}//main

}
