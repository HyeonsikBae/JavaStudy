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
import java.util.Random;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {

	Label player, computer, playerLabel,comLabel, result, color;
	Button buttonR, buttonS, buttonP, reset;
	static int countWin=0, countLose=0, countDraw=0, playerRSC, computerRSC;
	
	public WindowTest() {
		
		setLayout(null);

		setTitle("Rock Scissor Paper");
		player = new Label();
		player.setBounds(20, 40, 100, 30);
		player.setBackground(Color.lightGray);
		player.setText("PLAYER");
		add(player);
		computer = new Label();
		computer.setBounds(220, 40, 100, 30);
		computer.setBackground(Color.lightGray);
		computer.setText("COMPUTER");
		add(computer);
		color = new Label();
		color.setBounds(135, 50, 70, 70);
		add(color);
		
		playerLabel = new Label();
		playerLabel.setBounds(20, 80, 100, 50);
		playerLabel.setBackground(Color.lightGray);
		add(playerLabel);
		
		comLabel = new Label();
		comLabel.setBounds(220, 80, 100, 50);
		comLabel.setBackground(Color.lightGray);
		add(comLabel);
		
		result = new Label();
		result.setBounds(20, 190, 300, 50);
		result.setBackground(Color.lightGray);
		add(result);
		
		buttonR = new Button();
		buttonR.setLabel("Rock");
		buttonR.setBounds(25, 140, 90, 40);
		buttonR.addActionListener(this);
		add(buttonR);
		
		buttonS = new Button();
		buttonS.setLabel("Scissor");
		buttonS.setBounds(125, 140, 90, 40);
		buttonS.addActionListener(this);
		add(buttonS);
		
		buttonP = new Button();
		buttonP.setLabel("Paper");
		buttonP.setBounds(225, 140, 90, 40);
		buttonP.addActionListener(this);
		add(buttonP);
		
		reset = new Button();
		reset.setLabel("RESET");
		reset.setBounds(20, 250, 300, 40);
		reset.addActionListener(this);
		add(reset);
		
		setBounds(0, 0, 340, 310);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		class Game{
			public void RSC() {
				if(playerRSC==computerRSC) {
					countDraw++;
					color.setBackground(Color.lightGray);
					color.setText("DRAW");
				}
				else if(((playerRSC+1)%3)==computerRSC) {
					countLose++;
					color.setBackground(Color.cyan);
					color.setText("LOSE");
				}
				else {	
					countWin++;
					color.setBackground(Color.pink);
					color.setText("WIN");
				}
			result.setText(countWin+"WIN "+countLose+"LOSE "+countDraw+"DRAW");
			}
		}
		
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		if(btnTitle.equals("RESET")) {
			countWin = 0;
			countDraw = 0;
			countLose = 0;
			result.setText(countWin+"WIN "+countLose+"LOSE "+countDraw+"DRAW");
		}
		else {
			Random random = new Random();
			computerRSC = random.nextInt(3);
			switch(computerRSC) {
				case 0:
					comLabel.setText("Scissor");
					break;
				case 1:
					comLabel.setText("Rock");
					break;
				case 2:
					comLabel.setText("Paper");
					break;
			}
			
			if(btnTitle.equals("Rock")) {
				playerRSC = 1;
				playerLabel.setText("Rock");
				new Game().RSC();
			}
			else if(btnTitle.equals("Scissor")) {
				playerRSC = 0;
				playerLabel.setText("Scissor");
				new Game().RSC();
			}
			else if(btnTitle.equals("Paper")) {
				playerRSC = 2;
				playerLabel.setText("Paper");
				new Game().RSC();
			}
			
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {	}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}