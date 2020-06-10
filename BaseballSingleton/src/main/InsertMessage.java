package main;
import java.util.Scanner;

import PlayerList.*;

public class InsertMessage {
	
	Scanner scanner = new Scanner(System.in);
	
	public Human setHuman(int position) {
		
		Human temp = new Human();
		
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		
		if(position == 1) {
			System.out.print("선수 타수 입력 : ");
			int batCount = scanner.nextInt();
			System.out.print("선수 안타 수 입력 : ");
			int hit = scanner.nextInt();
			System.out.print("선수 타율 입력 : ");
			double hitAvg = scanner.nextDouble();
			
			temp = new Batter("타자", number, name, age, height, batCount, hit, hitAvg);
		}
		else if(position == 2){
			System.out.print("선수 승 입력 : ");
			int win = scanner.nextInt();
			System.out.print("선수 패 입력 : ");
			int lose = scanner.nextInt();
			System.out.print("선수 방어율 입력 : ");
			double defence = scanner.nextDouble();
			
			temp = new Pitcher("투수", number, name, age, height, win, lose, defence);
		}
		return temp;
	}
}
