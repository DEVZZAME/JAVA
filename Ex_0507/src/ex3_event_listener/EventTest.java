package ex3_event_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {

		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x버튼 클릭됨");
		System.exit(0);//열려있는 모든 프레임을 종료
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래크기로 돌아옴");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 됨");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

		
	
	
	
	
	

}
