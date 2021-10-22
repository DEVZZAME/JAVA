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
		f.setLayout(null);//자동배치 끄기
		
		//준비된 이미지 가져오기
		ImageIcon back_img = new ImageIcon("back.jpg");
		JLabel j1 = new JLabel(back_img);
		j1.setBounds(0, 0, 500, 700);
		
		ImageIcon btn_img = new ImageIcon("btn.jpg");
		
		JButton btn = new JButton();
		btn.setIcon(btn_img);
		btn.setBounds(50, 100, 100, 100);
		
		//f의 add()는 먼저 호출 될수록 화면 위쪽에 보여진다
		f.add(btn);
		f.add(j1);
		
		f.setVisible(true);
	
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
				// f.dispose(); --> 현재 프레임만 종료
			};
		}); // 우상단 종료버튼 활성화 코드
		
		
		
	}

}
