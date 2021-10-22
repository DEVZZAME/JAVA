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
		
		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 250, 400);
		frame.setBackground(Color.PINK);
		frame.setLayout(null);//자동배치 끄기
		
		//북쪽단---------------------------
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		
		//화면 상단에 두개의 컴포넌트(자식객체들)를 하나로 묶자
		Panel pNorth = new Panel();
		pNorth.setLayout(null);
		pNorth.setBackground(Color.YELLOW);
		pNorth.setBounds(0, 31, 250, 50);
		
		//키보드값을 입력받기 위한 한 객체
		TextField tf = new TextField(10);
		tf.setBounds(10, 5, 170, 40);
		tf.setFont(font);
		
		//확인버튼
		Button btn = new Button("OK");
		btn.setBounds(190, 5, 50, 40);
		btn.setEnabled(false);//버튼 비활성화
		
		
		pNorth.add(tf);
		pNorth.add(btn);
		frame.add(pNorth);
		
		//북쪽단 끝---------------------------

		//중앙단 ----------------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.CYAN);
		ta.setBounds(8, 80, 235, 263);
		ta.setEditable(false);//ta에 값을 직접 입력하는 것이 불가능해짐.
		
		frame.add(ta);
		//중앙단 끝 --------------------------
		
		//남쪽단---------------------------
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.WHITE);
		pSouth.setLayout(null);
		pSouth.setBounds(0, 343, 250, 50);
		
		Button btnSave = new Button("저장");
		Button btnClose = new Button("종료");
		
		btnSave.setBounds(20, 5, 100, 40);
		btnClose.setBounds(130, 5, 100, 40);
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		frame.add(pSouth);
		//남쪽단 끝---------------------------
		
		//TextField에 한글자라도 값이 들어갔다면 OK버튼을 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);//버튼 활성화
				}
				
			}
		});
		
		//OK버튼 클릭시 tf의 내용을 ta로 추가
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ta.setText(tf.getText());
				ta.append(tf.getText()+"\n");
				
				tf.setText("");
				tf.requestFocus();//커서가 자동으로 tf로 이동
			}
		});
		
		//닫기버튼으로 프레임 종료
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//저장버튼 클릭시 ta의 내용을 txt문서로 저장
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				FileDialog fd = new FileDialog(frame, "종로로 갈까요? 청량리로 갈까요?", FileDialog.SAVE);
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile();
				System.out.println("저장경로 : "+path);
				
				try {
					//character 기반의 스트림을 통해 path경로에 내용을 저장
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					
					if(fd.getDirectory() == null){
						JOptionPane.showMessageDialog(frame, "저장취소");
					}else {
						JOptionPane.showMessageDialog(frame, "저장성공");
					}
					
					fw.close();
					
				} catch (Exception e2) {

				
				}
			}
		});
		
		frame.setResizable(false);//프레임 크기 조절 불가
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
				// frame.dispose(); --> 현재 프레임만 종료
			};
		}); // 우상단 종료버튼 활성화 코드
		
	}//main
}
