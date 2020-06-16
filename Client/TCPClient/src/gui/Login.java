package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.mainClass;

public class Login extends JFrame {
	
	mainClass main = new mainClass();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel ipPanel = new JPanel();
	JPanel portPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JLabel ipLabel = new JLabel("       IP : ");
	JTextField ipInput = new JTextField(14);
	JLabel portLabel = new JLabel("PORT : ");
	JTextField portInput = new JTextField(14);
	JButton buttonLogin = new JButton("입장");
	JButton buttonExit = new JButton("종료");
	
	public Login() {
		
		panel.add(new JLabel("chat :D"));
		
		ipPanel.setLocation(100,70);
		ipPanel.add(ipLabel);
		ipPanel.add(ipInput);
		
		ipPanel.setLocation(100, 10);
		portPanel.add(portLabel);
		portPanel.add(portInput);
		
		buttonPanel.add(buttonLogin);
		buttonPanel.add(buttonExit);
		
		buttonLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				main.setIp(ipInput.getText());
				System.out.println(main.getIp());
				main.setPort(Integer.parseInt(portInput.getText()));
				System.out.println(main.getPort());
				frame.setVisible(false);
				new GUI();
				
			}
		});
		
		buttonExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		frame.setLayout(new GridLayout(0, 1, 0, 0));

		frame.add(panel);
		frame.add(ipPanel);
		frame.add(portPanel);
		frame.add(buttonPanel);
		
		frame.setResizable(false);
		frame.setBounds(100, 100, 260, 160);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
