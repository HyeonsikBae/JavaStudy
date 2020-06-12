package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowTest extends JFrame implements ActionListener {
	
	JTextField textField;
	JTextArea textArea;
	
	public WindowTest() {
		
		super("textfield");
		
		JPanel panel = new JPanel();
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		JScrollPane scrPane = new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400,300));
		panel.add(scrPane);
		
		JPanel boat = new JPanel();
		textField = new JTextField(20);
		
		JButton btn1 = new JButton("newxt");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JButton btn2 = new JButton();
		
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
