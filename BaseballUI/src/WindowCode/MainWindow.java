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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.api.server.Container;

public class MainWindow extends Frame implements WindowListener{
	
	Panel panel;
	Label label1, label2;
	Button b1, b2, b3, b4, b5, b6, b7, b9, b0;
	
	public MainWindow() {
		
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
		
		b1 = new Button("선수 등록");
		b1.setBounds(20, 100, 200, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InsertWindow();
			}
		});
		add(b1);
		
		b2 = new Button("선수 삭제");
		b2.setBounds(20, 140, 200, 30);
		
		add(b2);
		
		b3 = new Button("선수 검색");
		b3.setBounds(20, 180, 200, 30);
		
		add(b3);
		
		b4 = new Button("선수 수정");
		b4.setBounds(20, 220, 200, 30);
		
		add(b4);
		
		b5 = new Button("선수 출력");
		b5.setBounds(20, 260, 200, 30);
	
		add(b5);
		
		b6 = new Button("타자 출력");
		b6.setBounds(20, 300, 200, 30);
	
		add(b6);
		
		b7 = new Button("투수 출력");
		b7.setBounds(20, 340, 200, 30);
		
		add(b7);
		
		b9 = new Button("선수 초기화");
		b9.setBounds(20, 380, 200, 30);
		
		add(b9);
		
		b0 = new Button("시스템 종료");
		b0.setBounds(20, 420, 200, 30);
		
		add(b0);
		
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
