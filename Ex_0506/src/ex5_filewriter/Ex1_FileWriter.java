package ex5_filewriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {

		String path = "C:/web1_오후_java/fileWriter예제.txt";
		
		try {
			
			FileWriter fw = new FileWriter(path);
			String str = "나는 fileWriter의 예제\n";
			String str2 = "You can also writer second line.";
					
			fw.write(str);
			fw.write(str2);
			
			//fw.flush(); 작성하고자 하는 내용을 물리적으로 기록하는 메서드
			fw.close();//close()로 스트림을 닫을 때 내부에서 flush()메서드가 자동으로 호출
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
	}//main

}
