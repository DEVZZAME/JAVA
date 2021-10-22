package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {

		String path = "C:/web1_오후_java/test.txt";
		File f = new File(path);

		if (f.exists()) {

			try {
				FileInputStream fis = new FileInputStream(f);

				int code = 0;
				
				//fis.read()를 통해 test.txt의 내용을 한글자(1byte)씩 읽어온다
				//읽어들인 내용을 int 변수인 code에 전달하여 출력하되
				//더이상 읽을게 없는 상황(-1)인 EOF(End Of File파일의 끝)를 만날 때 까지
				//while을 반복하게 됨
				while ((code = fis.read()) != -1) {
					//fis는 1byte단위로 데이터를 읽어오므로
					//아스키코드에 존재하지 않는 한글데이터 등은 깨져서 넘어온다.
					System.out.print((char)code);

				} // while

				//모든 스트림들은 new를 통해서 통로를 생성한 뒤 사용했다면
				//사용을 마치고 close()를 통해 통로를 닫아줘야 한다.
				fis.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}// main

}
