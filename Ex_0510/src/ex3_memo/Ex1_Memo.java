package ex3_memo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Ex1_Memo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("�޸���");
		frame.setBounds(500, 200, 250, 400);
		frame.setBackground(Color.PINK);
		frame.setLayout(null);//�ڵ���ġ ����
		
		//���ʴ�---------------------------
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		
		//ȭ�� ��ܿ� �ΰ��� ������Ʈ(�ڽİ�ü��)�� �ϳ��� ����
		Panel pNorth = new Panel();
		pNorth.setLayout(null);
		pNorth.setBackground(Color.YELLOW);
		pNorth.setBounds(0, 31, 250, 50);
		
		//Ű���尪�� �Է¹ޱ� ���� �� ��ü
		TextField tf = new TextField(10);
		tf.setBounds(10, 5, 170, 40);
		tf.setFont(font);
		
		//Ȯ�ι�ư
		Button btn = new Button("OK");
		btn.setBounds(190, 5, 50, 40);
		btn.setEnabled(false);//��ư ��Ȱ��ȭ
		
		
		pNorth.add(tf);
		pNorth.add(btn);
		frame.add(pNorth);
		
		//���ʴ� ��---------------------------

		//�߾Ӵ� ----------------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.CYAN);
		ta.setBounds(8, 80, 235, 263);
		ta.setEditable(false);//ta�� ���� ���� �Է��ϴ� ���� �Ұ�������.
		
		frame.add(ta);
		//�߾Ӵ� �� --------------------------
		
		//���ʴ�---------------------------
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.WHITE);
		pSouth.setLayout(null);
		pSouth.setBounds(0, 343, 250, 50);
		
		Button btnSave = new Button("����");
		Button btnClose = new Button("����");
		
		btnSave.setBounds(20, 5, 100, 40);
		btnClose.setBounds(130, 5, 100, 40);
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		frame.add(pSouth);
		//���ʴ� ��---------------------------
		
		//TextField�� �ѱ��ڶ� ���� ���ٸ� OK��ư�� Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);//��ư Ȱ��ȭ
				}
				
			}
		});
		
		//OK��ư Ŭ���� tf�� ������ ta�� �߰�
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ta.setText(tf.getText());
				ta.append(tf.getText()+"\n");
				
				tf.setText("");
				tf.requestFocus();//Ŀ���� �ڵ����� tf�� �̵�
			}
		});
		
		//�ݱ��ư���� ������ ����
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//�����ư Ŭ���� ta�� ������ txt������ ����
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				FileDialog fd = new FileDialog(frame, "���η� �����? û������ �����?", FileDialog.SAVE);
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile();
				System.out.println("������ : "+path);
				
				try {
					//character ����� ��Ʈ���� ���� path��ο� ������ ����
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					
					if(fd.getDirectory() == null){
						JOptionPane.showMessageDialog(frame, "�������");
					}else {
						JOptionPane.showMessageDialog(frame, "���强��");
					}
					
					fw.close();
					
				} catch (Exception e2) {

				
				}
			}
		});
		
		frame.setResizable(false);//������ ũ�� ���� �Ұ�
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
				// frame.dispose(); --> ���� �����Ӹ� ����
			};
		}); // ���� �����ư Ȱ��ȭ �ڵ�
		
	}//main
}
