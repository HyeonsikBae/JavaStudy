package awtSmple01;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener{
	
	public WindowTest() {
		setSize(640, 480);	//	윈도우 폭, 높이
		setLocation(0,0);	//	윈도우 실행 위치
		setVisible(true);	//	윈도우 비져블
		
		//Listener
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
		
	}
}
