package ex4_event_listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ex2_frame.MyFrame;

public class WindowAdapterTest {
	public static void main(String[] args) {

		MyFrame mf = new MyFrame();
		mf.addWindowListener( new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		
	}//main

}
