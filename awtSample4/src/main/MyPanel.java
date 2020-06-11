package main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class MyPanel extends Panel {
	
	
	public MyPanel() {
		
		setLayout(new GridLayout(3,1));
		setBackground(Color.red);
		
		Label label = new Label("MyPanel label 1");
	}
}
