package awtSmple01;

import java.awt.Color;

import javax.swing.JFrame;

public class WindowTestJ extends JFrame{
	
	WindowTestJ(){
		setSize(1080, 960);
		setLocation(200, 200);
		setTitle("YURA JAIL");
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}