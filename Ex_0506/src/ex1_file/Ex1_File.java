package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		//IO(Input, Output)
		//IO는 입출력 스트림을 의미한다.
		//스트림이란 데이터를 주고받기 위한 통로
		//JVM에서 콘솔로 값을 보내는 경우 Output, 콘솔의 값을 JVM에서 읽어야 할 때는 Input
		
		String path = "C:/web1_오후_java/test.txt";
		File f = new File(path);
		
		System.out.println(f.length()+"byte");
		
	}//main

}
