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
		f.setLayout(null);// 자동배치 종료

		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");

		btn1.setBounds(100, 100, 100, 70); // 버튼 위치,크기 설정
		btn2.setBounds(300, 100, 100, 70);

		// 두 개의 버튼이 참조할 감지자
		ActionListener al = new ActionListener() { // 액션리스너를 객체화 시켰기 때문에 -->

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("버튼 클릭"); -->각 버튼이 다른 기능을 하는데 똑같은 출력을 하면 안됨
				// e.getActionCommand() : 클릭한 버튼에 부착되어 있는 텍스트를 가져온다
				// System.out.println(e.getActionCommand());

				if (e.getActionCommand().equals("확인")) {
					System.out.println("확인 누름");
				} else if (e.getActionCommand().equals("취소")) {
					System.out.println("취소 누름");
					f.dispose();// 프레임 종료
				}

			}
		};

		btn1.addActionListener(al); // -->변수를 통해 바로 액션퍼폼드를 실행 가능
		btn2.addActionListener(al);

		f.add(btn1); // 버튼 추가
		f.add(btn2);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
				// f.dispose(); --> 현재 프레임만 종료
			};
		}); // 우상단 종료버튼 활성화 코드

	}// main

}
