package ex3_fileoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex3_FileInput {
	public static void main(String[] args) {

		// work.txt�� �о ȸ�������� �ƴ����� �Ǵ��Ͻÿ�

		String path = "C:/web1_����_java/work.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		String ori = "";//����
		String rev = "";//������ ������ ���ڿ�
		
		try {
			FileInputStream fis = new FileInputStream(f);
			fis.read(b_read);
			ori = new String(b_read).trim();//�о�� ����
			
			//������ ����� rev ��ü�� ����
			for(int i = ori.length()-1; i>=0; i--) {
				rev+=ori.charAt(i);
					}
			//ȸ���� �Ǻ�
			if(ori.equals(rev)) {
				System.out.println(ori+"�� ȸ�����Դϴ�.");
			}else {
				System.out.println(ori+"�� ��ȸ����");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} //main
}
