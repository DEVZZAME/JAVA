package ex5_button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ButtonEvent {
	static boolean b_color = false;

	public static void main(String[] args) {

		Frame f1 = new Frame();
		f1.setBounds(500, 200, 400, 400);
		f1.setLayout(null);
		
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("����");
		btnClose.setBounds(230, 90, 100, 50);
		
		f1.add(btnOk);
		f1.add(btnClose);
		
		
		//btnOk���� �̺�Ʈ ������ ���
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame f2 = new Frame();
				f2.setLayout(null);
				f2.setBounds(520, 250, 300, 200);
				
				Button btnExit = new Button("�� ����");
				btnExit.setBounds(100, 50, 100, 50);
				
				//btnExit Ŭ���� ��� �������� ����
				btnExit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);//�����ִ� ��� ������ ����
					}
				});
				
				f2.add(btnExit);
				
				f2.setVisible(true);
					
				//f2�� ���� x��ư�� Ŭ���ϸ� ��ü������ ���ᰡ �ƴ�
				//f2�����Ӹ� ���� �ϰ� �ʹ�.....
				f2.addWindowListener( new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						f2.dispose();//f2�����Ӹ� ��������
						};
				
			});

			}
		});
		
		f1.setVisible(true);
				
		f1.addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				};
		
	});

}// main
}// class
