package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dto.*;

public class GUI extends JFrame {
	Socket socket;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	public static JTextArea text = new JTextArea(5,10);
	JButton button = new JButton("클릭");
	
	public GUI(Socket socket) {
		this.socket = socket;
		panel1.add(text);
		
		panel2.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DTO dto2 = new DTO("주홍2",2);
				
				PrintWriter writer;
				try {
					writer = new PrintWriter(socket.getOutputStream());
					writer.println(dto2.toString());
					writer.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		panel.add(panel1);
		panel.add(panel2);
		
		frame.add(panel);
		
		frame.setBounds(100, 100, 200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
