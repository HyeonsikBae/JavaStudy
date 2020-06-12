package WindowCode;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.api.server.Container;

public class TeamWindow extends Frame implements WindowListener, ActionListener {
	
	Panel panel;
	Label label1, label2, label3;
	Button b1, b2, b3, b4;
	static String team = "";
	
	public TeamWindow() {
		
		setLayout(null);
		setBounds(0, 0, 240, 480);
		setVisible(true);
		setTitle("Baseball Player Mnaagement System");
		addWindowListener(this);
		
		panel = new Panel();
		
		label1 = new Label("Baseball Player");
		label1.setBounds(20, 30, 200, 30);
		label1.setAlignment(Label.CENTER);
		add(label1);
		
		label2 = new Label("Management System");
		label2.setBounds(20, 60, 200, 30);
		label2.setAlignment(Label.CENTER);
		add(label2);
		
		label3 = new Label("팀을 선택하세요");
		label3.setBounds(20, 100, 200, 30);
		label3.setAlignment(Label.CENTER);
		add(label3);
		
		b1 = new Button("롯데");
		b1.setBounds(20, 150, 200, 60);
		b1.addActionListener(this);
		add(b1);	
		b2 = new Button("엘지");
		b2.setBounds(20, 230, 200, 60);
		b2.addActionListener(this);
		add(b2);
		b3 = new Button("기아");
		b3.setBounds(20, 310, 200, 60);
		b3.addActionListener(this);
		add(b3);
		b4 = new Button("엘롯기");
		b4.setBounds(20, 390, 200, 60);
		b4.addActionListener(this);
		add(b4);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(b1.equals("롯데")) {
			team = "롯데";
		}
		else if(b2.equals("엘지")) {
			team = "엘지";
		}
		else if(b3.equals("기아")) {
			team = "기아";
		}
		else if(b4.equals("엘롯기")) {
			team = "엘롯기";
		}
		setVisible(false);
		new MainWindow();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
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
