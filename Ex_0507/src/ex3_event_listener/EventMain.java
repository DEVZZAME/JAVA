package ex3_event_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 400, 400);//location, size
		
		//�����ӿ��� ��������� ��ư�鿡 ���� �̺�Ʈ ������ ���
		f.addWindowListener(new EventTest());
		
		f.setVisible(true);
		
		
		
		
		
	}

}
