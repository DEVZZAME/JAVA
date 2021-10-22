package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {

		String path = "C:/web1_����_java/test.txt";
		File f = new File(path);

		if (f.exists()) {

			try {
				FileInputStream fis = new FileInputStream(f);

				int code = 0;
				
				//fis.read()�� ���� test.txt�� ������ �ѱ���(1byte)�� �о�´�
				//�о���� ������ int ������ code�� �����Ͽ� ����ϵ�
				//���̻� ������ ���� ��Ȳ(-1)�� EOF(End Of File������ ��)�� ���� �� ����
				//while�� �ݺ��ϰ� ��
				while ((code = fis.read()) != -1) {
					//fis�� 1byte������ �����͸� �о���Ƿ�
					//�ƽ�Ű�ڵ忡 �������� �ʴ� �ѱ۵����� ���� ������ �Ѿ�´�.
					System.out.print((char)code);

				} // while

				//��� ��Ʈ������ new�� ���ؼ� ��θ� ������ �� ����ߴٸ�
				//����� ��ġ�� close()�� ���� ��θ� �ݾ���� �Ѵ�.
				fis.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}// main

}
