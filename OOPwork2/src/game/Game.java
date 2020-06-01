package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	int randomNumber;
	int num;
	
	public void random() {
		Random rand = new Random();
		randomNumber = rand.nextInt(71)+30;
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1~15사이의 수 입력 : ");
			num = scanner.nextInt();
			if(num<1 || num>15) {
				System.out.println("잘못 입력 하셨습니다.");
			}
			else {
				break;
			}
		}
	}
	public void play() {
		randomNumber -= num;
	}
	public void result() {
		if(randomNumber<=0) {
			System.out.println("꽝!");
		}
	}
	public void game() {
		while(true) {
			input();
			play();
			result();
			if(randomNumber<=0) break;
		}
	}
	public boolean regame() {
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String select="";
		while(!select.equals("Y")&&!select.equals("N")) {
			select = "";
			System.out.print("새 게임을 하시겠습니까? Y/N");
			select = scanner.next();
			if(select.equals("Y")) {
				bool = true;
			}
			else if(select.equals("N")) {
				System.out.println("종료");
				bool = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		return bool;
	}
}