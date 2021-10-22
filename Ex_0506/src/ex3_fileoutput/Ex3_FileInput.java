package ex3_fileoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex3_FileInput {
	public static void main(String[] args) {

		// work.txt를 읽어서 회문수인지 아닌지를 판단하시오

		String path = "C:/web1_오후_java/work.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		String ori = "";//원본
		String rev = "";//원본을 뒤집은 문자열
		
		try {
			FileInputStream fis = new FileInputStream(f);
			fis.read(b_read);
			ori = new String(b_read).trim();//읽어온 원본
			
			//원본을 뒤집어서 rev 객체에 저장
			for(int i = ori.length()-1; i>=0; i--) {
				rev+=ori.charAt(i);
					}
			//회문수 판별
			if(ori.equals(rev)) {
				System.out.println(ori+"는 회문수입니다.");
			}else {
				System.out.println(ori+"는 안회문수");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} //main
}
