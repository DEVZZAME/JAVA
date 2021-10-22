package ex4_filereader;

import java.io.File;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {

		String path = "C:/web1_¿ÀÈÄ_java/test.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			int code = 0;
			while((code=fr.read()) != -1) {
				System.out.print((char)code);
			}//while
			
			fr.close();
		} catch (Exception e) {
		}//trycatch
		
		
		
		
		
	}//main

}
