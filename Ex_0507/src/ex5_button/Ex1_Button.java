package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {

		Frame f = new Frame("Button TEST");
		f.setBounds(500, 200, 400, 400);
		
		f.setLayout(null);//자동배치 속성을 끈다.
		//프레임의 자동배치를 끄면 그 순간 add될 자식 요소들(컴포넌트)은
		//고유의 크기와 위치값을 반드시 가지고 있어야 한다.
		
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		Button btnCancel = new Button("취소");
		btnCancel.setBounds(230, 90, 100, 50);
		f.setLayout(null);//자동배치 종료
		
		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");
		
		
		f.add(btnOk);//프레임에 버튼 추가
		f.add(btnCancel);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
					
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				};
			} );
		
		
	}//main

}
