package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {

		String path = "C:/web1_����_java/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];

		if (f.exists()) {// ������ ���������� �����ϴ� ��� true

			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(b_read);

				//StringŬ������ �����ڸ� ���� byte[]�� ���ڿ��� ������
				String res = new String(b_read);

				System.out.println(res);
				
				//��� �Ϸ�� ��Ʈ���� �ݾ�����!
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}// main

}
