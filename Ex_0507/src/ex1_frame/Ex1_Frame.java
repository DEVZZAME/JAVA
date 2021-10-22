package ex1_frame;

import java.awt.*;

public class Ex1_Frame {
	public static void main(String[] args) {

		Frame frame = new Frame("첫 프레임");
		frame.setSize(400, 300);//크기(px)
		frame.setLocation(500, 200);//위치
		
		
		frame.setBackground( Color.ORANGE );
		frame.setVisible(true);//프레임을 노출시킨다
		
		
	}//main

}
