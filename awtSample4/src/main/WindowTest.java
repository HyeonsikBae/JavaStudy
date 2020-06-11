package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	
	public WindowTest() {
		setLayout(new GridLayout(2, 1));
		Label label1 = new Label("1");
		add(label1);
		
		Panel panel = new Panel();
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(1,2));
		add(panel);
		
		Label label2 = new Label("2");
		add(label2);
		panel.add(label2);//panel에 label 추가
		
		Button button = new Button("Button");
		panel.add(button);
		
		setBounds(0, 0, 800, 600);
		setVisible(true);
		
		addWindowListener(this);
		
		//Panel : Frame(Window) 위 Frame
		
		
		/*
		super("Layout");
		//setLayout(new FlowLayout());
		//setLayout(new GridLayout(3,1));
		setLayout(null);
		
		//Label 1
		Label label1 = new Label("Label 1");
		label1.setBackground(Color.red);
		label1.setBounds(150, 30, 50, 30);
		add(label1);
		
		//Label 2
		Label label2 = new Label("Label 2");
		label2.setBackground(Color.green);
		label2.setBounds(150, 80, 70, 30);
		add(label2);
				
		//Button
		Button button = new Button();
		button.setLabel("BUTTON");
		button.setBounds(150, 150, 100, 30);
		add(button);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
		*/
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
