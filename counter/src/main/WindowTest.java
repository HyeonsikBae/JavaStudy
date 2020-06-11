package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {

	Label label;
	Button button1, button2, button3;
	int count=0;
	
	public WindowTest() {
		
		setLayout(null);
		/*
			resource(자원) : nutton, label, textfiled -> Handle..
		 */
		
		label = new Label(count+"");
		label.setBounds(100, 100, 300, 30);
		add(label);
		
		button1 = new Button();
		button1.setLabel("button1");
		button1.setBounds(100, 160, 150, 30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button();
		button2.setLabel("button2");
		button2.setBounds(300, 160, 150, 30);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new Button();
		button3.setLabel("button3");
		button3.setBounds(100, 200, 300, 30);
		button3.addActionListener(this);
		add(button3);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "버튼 클릭");
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		if(btnTitle.equals("button1")) {
			//JOptionPane.showMessageDialog(null, "1 버튼 클릭");
			count++;
			label.setText(count+"");
			}
		else if(btnTitle.equals("button2")) {
			//JOptionPane.showMessageDialog(null, "2 버튼 클릭");
			count--;
			if(count<0) {
				count = 0;
			}
			label.setText(count+"");
			}
		else if(btnTitle.equals("button3")) {
			//JOptionPane.showMessageDialog(null, "2 버튼 클릭");
			count=0;
			label.setText(count+"");
			}
	}

}
