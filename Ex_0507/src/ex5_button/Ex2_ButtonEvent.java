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
		
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("종료");
		btnClose.setBounds(230, 90, 100, 50);
		
		f1.add(btnOk);
		f1.add(btnClose);
		
		
		//btnOk에게 이벤트 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame f2 = new Frame();
				f2.setLayout(null);
				f2.setBounds(520, 250, 300, 200);
				
				Button btnExit = new Button("앱 종료");
				btnExit.setBounds(100, 50, 100, 50);
				
				//btnExit 클릭시 모든 프레임을 종료
				btnExit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);//열려있는 모든 프레임 종료
					}
				});
				
				f2.add(btnExit);
				
				f2.setVisible(true);
					
				//f2의 우상단 x버튼을 클릭하면 전체프레임 종료가 아닌
				//f2프레임만 종료 하고 싶다.....
				f2.addWindowListener( new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						f2.dispose();//f2프레임만 개별종료
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
