package ex2_label;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Label {

	static String myBloodType = "����� A�� �̱���";

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);// �ڵ���ġ ����

		// �۾� ũ��� �Ӽ��� �����ϴ� Ŭ����
		Font font = new Font("�ü�", Font.ITALIC, 20);

		// ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����(Label)
		Label question = new Label("����� �������� ����?");
		question.setBackground(Color.CYAN);
		question.setBounds(10, 50, 200, 30);

		// ���û���
		Choice bt = new Choice();
		bt.setBounds(260, 50, 230, 0);
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		bt.setFont(font);

		// Ȯ�ι�ư
		Button btn_ok = new Button("Ȯ��");
		btn_ok.setBounds(10, 90, 480, 50);

		// ��� Ȯ�ο� Lebel
		Label result = new Label();
		result.setBackground(Color.GRAY);
		result.setBounds(150, 200, 200, 50);
		result.setAlignment(Label.CENTER);

		f.add(question);
		f.add(bt);
		f.add(btn_ok);
		f.add(result);

		// Choice���� ���õ� �׸� �˾Ƴ���
		bt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				myBloodType = "����� " + bt.getSelectedItem() + "�� �̱���";

			}
		});

		// Ȯ�� ��ư Ŭ���� Choice�� � �׸��� ���õǾ� �ִ����� �����Ͽ�
		// result ���̺� �߰�
		btn_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				result.setText(myBloodType);

			}
		});

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
