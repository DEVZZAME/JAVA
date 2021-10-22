package ex1_button_listener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonEvent {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 500, 300);
		f.setLayout(null);// �ڵ���ġ ����

		Button btn1 = new Button("Ȯ��");
		Button btn2 = new Button("���");

		btn1.setBounds(100, 100, 100, 70); // ��ư ��ġ,ũ�� ����
		btn2.setBounds(300, 100, 100, 70);

		// �� ���� ��ư�� ������ ������
		ActionListener al = new ActionListener() { // �׼Ǹ����ʸ� ��üȭ ���ױ� ������ -->

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("��ư Ŭ��"); -->�� ��ư�� �ٸ� ����� �ϴµ� �Ȱ��� ����� �ϸ� �ȵ�
				// e.getActionCommand() : Ŭ���� ��ư�� �����Ǿ� �ִ� �ؽ�Ʈ�� �����´�
				// System.out.println(e.getActionCommand());

				if (e.getActionCommand().equals("Ȯ��")) {
					System.out.println("Ȯ�� ����");
				} else if (e.getActionCommand().equals("���")) {
					System.out.println("��� ����");
					f.dispose();// ������ ����
				}

			}
		};

		btn1.addActionListener(al); // -->������ ���� �ٷ� �׼������带 ���� ����
		btn2.addActionListener(al);

		f.add(btn1); // ��ư �߰�
		f.add(btn2);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
				// f.dispose(); --> ���� �����Ӹ� ����
			};
		}); // ���� �����ư Ȱ��ȭ �ڵ�

	}// main

}
