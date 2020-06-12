package WindowCode;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.api.server.Container;

public class DeleteWindow extends Frame implements WindowListener, ActionListener {
	
	Panel panel;
	Label label1, label2;
	Button b1, b2, b3, b4, b5, b6, b7, b9, b0;
	
	public DeleteWindow() {
		
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
		
		b1 = new Button("타자");
		b1.setBounds(20, 100, 95, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Label number, name, age, height, batcount, hit, hitAvg;
				Button save;
				number = new Label("선수 번호 : ");
				number.setBounds(20, 150, 80, 30);
				number.setAlignment(Label.CENTER);
				add(number);
				TextField tNumber = new TextField(2);
				tNumber.setBounds(100, 155, 110, 20);
				add(tNumber);
				
				name = new Label("선수 이름 : ");
				name.setBounds(20, 185, 80, 30);
				name.setAlignment(Label.CENTER);
				add(name);
				TextField tName = new TextField(4);
				tName.setBounds(100, 190, 110, 20);
				add(tName);
				
				age = new Label("선수 나이 : ");
				age.setBounds(20, 220, 80, 30);
				age.setAlignment(Label.CENTER);
				add(age);
				TextField tAge = new TextField(2);
				tAge.setBounds(100, 225, 110, 20);
				add(tAge);
				
				height = new Label("선수 신장 : ");
				height.setBounds(20, 255, 80, 30);
				height.setAlignment(Label.CENTER);
				add(height);
				TextField tHeight = new TextField(6);
				tHeight.setBounds(100, 260, 110, 20);
				add(tHeight);
				
				batcount = new Label("타석 횟수 : ");
				batcount.setBounds(20, 290, 80, 30);
				batcount.setAlignment(Label.CENTER);
				add(batcount);
				TextField tBatcount = new TextField(3);
				tBatcount.setBounds(100, 295, 110, 20);
				add(tBatcount);
				
				hit = new Label("안타 횟수 : ");
				hit.setBounds(20, 325, 80, 30);
				hit.setAlignment(Label.CENTER);
				add(hit);
				TextField tHit = new TextField(3);
				tHit.setBounds(100, 330, 110, 20);
				add(tHit);
				
				hitAvg = new Label("평균 타율 : ");
				hitAvg.setBounds(20, 360, 80, 30);
				hitAvg.setAlignment(Label.CENTER);
				add(hitAvg);
				TextField tHitAvg = new TextField(3);
				tHitAvg.setBounds(100, 365, 110, 20);
				add(tHitAvg);
				
				save = new Button("저장");
				save.setBounds(20, 400, 200, 30);
				add(save);
				save.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
					}
				});		
			}
		});
		add(b1);	
		b2 = new Button("투수");
		b2.setBounds(125, 100, 95, 30);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Label number, name, age, height, batcount, hit, hitAvg;
				Button save;
				number = new Label("선수 번호 : ");
				number.setBounds(20, 150, 80, 30);
				number.setAlignment(Label.CENTER);
				add(number);
				name = new Label("선수 이름 : ");
				name.setBounds(20, 185, 80, 30);
				name.setAlignment(Label.CENTER);
				add(name);
				age = new Label("선수 나이 : ");
				age.setBounds(20, 220, 80, 30);
				age.setAlignment(Label.CENTER);
				add(age);
				height = new Label("선수 신장 : ");
				height.setBounds(20, 255, 80, 30);
				height.setAlignment(Label.CENTER);
				add(height);
				batcount = new Label("승리 횟수 : ");
				batcount.setBounds(20, 290, 80, 30);
				batcount.setAlignment(Label.CENTER);
				add(batcount);
				hit = new Label("방어 횟수 : ");
				hit.setBounds(20, 325, 80, 30);
				hit.setAlignment(Label.CENTER);
				add(hit);
				hitAvg = new Label("방어율 : ");
				hitAvg.setBounds(20, 360, 80, 30);
				hitAvg.setAlignment(Label.CENTER);
				add(hitAvg);
				save = new Button("저장");
				save.setBounds(20, 400, 200, 30);
				add(save);
			}
		});
		add(b2);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
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
