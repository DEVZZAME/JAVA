package ex3_event_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 400, 400);//location, size
		
		//프레임에게 우측상단의 버튼들에 대한 이벤트 감지자 등록
		f.addWindowListener(new EventTest());
		
		f.setVisible(true);
		
		
		
		
		
	}

}
