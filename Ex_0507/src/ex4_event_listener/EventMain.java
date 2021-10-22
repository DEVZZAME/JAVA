package ex4_event_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(600, 300, 300, 400);
		
		EventChild ec = new EventChild();
		f.addWindowListener( ec );
		
		f.setVisible(true);
		
		
	}//main

}
