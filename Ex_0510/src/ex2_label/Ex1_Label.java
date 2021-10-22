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

	static String myBloodType = "당신은 A형 이군요";

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);// 자동배치 끄기

		// 글씨 크기와 속성을 변경하는 클래스
		Font font = new Font("궁서", Font.ITALIC, 20);

		// 화면에 텍스트를 출력하는 클래스(Label)
		Label question = new Label("당신의 혈액형은 무엇?");
		question.setBackground(Color.CYAN);
		question.setBounds(10, 50, 200, 30);

		// 선택상자
		Choice bt = new Choice();
		bt.setBounds(260, 50, 230, 0);
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		bt.setFont(font);

		// 확인버튼
		Button btn_ok = new Button("확인");
		btn_ok.setBounds(10, 90, 480, 50);

		// 결과 확인용 Lebel
		Label result = new Label();
		result.setBackground(Color.GRAY);
		result.setBounds(150, 200, 200, 50);
		result.setAlignment(Label.CENTER);

		f.add(question);
		f.add(bt);
		f.add(btn_ok);
		f.add(result);

		// Choice에서 선택된 항목 알아내기
		bt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				myBloodType = "당신은 " + bt.getSelectedItem() + "형 이군요";

			}
		});

		// 확인 버튼 클릭시 Choice에 어떤 항목이 선택되어 있는지를 구별하여
		// result 레이블에 추가
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
				System.exit(0);// 열려있는 모든 프레임을 종료
				// f.dispose(); --> 현재 프레임만 종료
			};
		}); // 우상단 종료버튼 활성화 코드

	}// main

}
