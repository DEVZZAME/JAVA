package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {

		Frame f = new Frame("Button TEST");
		f.setBounds(500, 200, 400, 400);
		
		f.setLayout(null);//�ڵ���ġ �Ӽ��� ����.
		//�������� �ڵ���ġ�� ���� �� ���� add�� �ڽ� ��ҵ�(������Ʈ)��
		//������ ũ��� ��ġ���� �ݵ�� ������ �־�� �Ѵ�.
		
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);
		Button btnCancel = new Button("���");
		btnCancel.setBounds(230, 90, 100, 50);
		f.setLayout(null);//�ڵ���ġ ����
		
		Button btn1 = new Button("Ȯ��");
		Button btn2 = new Button("���");
		
		
		f.add(btnOk);//�����ӿ� ��ư �߰�
		f.add(btnCancel);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
					
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				};
			} );
		
		
	}//main

}
