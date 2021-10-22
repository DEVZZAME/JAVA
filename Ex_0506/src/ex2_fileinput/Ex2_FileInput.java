package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {

		String path = "C:/web1_오후_java/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];

		if (f.exists()) {// 파일이 물리적으로 존재하는 경우 true

			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(b_read);

				//String클래스의 생성자를 통해 byte[]을 문자열로 재조합
				String res = new String(b_read);

				System.out.println(res);
				
				//사용 완료된 스트림은 닫아주자!
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}// main

}
