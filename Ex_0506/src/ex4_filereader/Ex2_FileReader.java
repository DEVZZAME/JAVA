package ex4_filereader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {

	public static void main(String[] args) {

		//test.txt로 접근하여 내용을 읽어온 후 대문자와 소문자의 갯수를 출력하라
		
		String path = "C:/web1_오후_java/test.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(path);
			int code = 0; //code라는 정수에 캐스팅해서 값 저장할거임
			
			int upper = 0;//대문자 개수
			int lower = 0;//소문자 개수
			
			while((code=fr.read()) !=-1) {

				if(code>='A' && code <='Z') {
					upper++;
				}
				if(code>='a' && code <='z') {
					lower++;
				}
			}//while
			System.out.println("대문자 : "+upper);
			System.out.println("소문자 : "+lower);
			
			fr.close();
		} catch (Exception e) {
		}
		
		
		
	}//main

}
