package ex4_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex_Image {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 100, 500, 700);
		f.setLayout(null);//�ڵ���ġ ����
		
		//�غ�� �̹��� ��������
		ImageIcon back_img = new ImageIcon("back.jpg");
		JLabel j1 = new JLabel(back_img);
		j1.setBounds(0, 0, 500, 700);
		
		ImageIcon btn_img = new ImageIcon("btn.jpg");
		
		JButton btn = new JButton();
		btn.setIcon(btn_img);
		btn.setBounds(50, 100, 100, 100);
		
		//f�� add()�� ���� ȣ�� �ɼ��� ȭ�� ���ʿ� ��������
		f.add(btn);
		f.add(j1);
		
		f.setVisible(true);
	
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
				// f.dispose(); --> ���� �����Ӹ� ����
			};
		}); // ���� �����ư Ȱ��ȭ �ڵ�
		
		
		
	}

}
