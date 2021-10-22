package ex4_event_listener;

import java.awt.event.WindowEvent;

public class EventChild extends MyListener{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("closed");
		System.exit(0);
	}
	
}
