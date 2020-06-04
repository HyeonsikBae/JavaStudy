package DAO;
import java.util.Scanner;

import DTO.*;
//DAO:Data Access Object = model = back end
public class MemberDao {
	// 데이터 담을 배열 필요
	private int type;
	private static int Count = 0;
	Human player[] = new Human[20];
	public void arrayAdd() {
		Human tempPlayer[] = new Human[player.length+1];
	}
	public void arrayRm() {
		Human tempPlayer[] = new Human[player.length-1];
	}
	public void move1(Human tempPlayer[]) {
		Human player[] = new Human[tempPlayer.length];
		for(int i = player.length;i<19;i++) {
			tempPlayer[i] = player[i];
		}
	}
	public void move(int num) {
		for(int i = num;i<19;i++) {
			player[i] = player[i+1];
		}
	}
	public MemberDao() {
		
	}
	
	public void insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("선수 타입 선택");
		System.out.println("1. 타자	2. 투수");
		System.out.println(">>> ");
		this.type = scanner.nextInt();
		
		if(this.type == 1) {
			player[Count] = new Batter();
			setBatter();
		}
		else {
			player[Count] = new Pitcher();
			setPitcher();
		}
		System.out.println(((Human)player[Count]).toString());
		
		Count++;
	}
	
	public void delete() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int i=0;
		System.out.println("삭제할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(Count==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i = search(playerNumber);
		if (i>=0&&i<=19) {
			player[i]=null;
			if(i!=20) move(i);
			else player[20]=null;
			System.out.println(playerNumber+"번 선수가 삭제되었습니다.");
		}
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");		
	}
	
	public void select() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int i=0;
		System.out.println("찾고 싶은 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(Count==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		if(i>=0&&i<=19) System.out.println(((Human)player[i]).toString());
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");		
	}
	
	public void update() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int i=0;
		System.out.println("수정할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(Count==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		if(i>=0&&i<=19) {
			if(player[i] instanceof Batter) setBatter(i);
			else setPitcher(i);
		}
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");		
	}

	public void allPrint() {
		for(int i=0;i<20;i++) {
			System.out.println(player[i].toString());
		}
	}
	
	
	public int search(int number) {
		int i = 0;
		boolean check = true;
		for(i=0;i<20;i++) {
			if(number==player[i].getNumber()) {
				check = false;
				break;
			}
		}
		if (check) i = -1;
		return i;
	}
	
	
	public void setBatter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		System.out.print("선수 타수 입력 : ");
		int batCount = scanner.nextInt();
		System.out.print("선수 안타 수 입력 : ");
		int hit = scanner.nextInt();
		System.out.print("선수 타율 입력 : ");
		double hitAvg = scanner.nextDouble();

		player[Count].setNumber(number);
		player[Count].setName(name);
		player[Count].setAge(age);
		player[Count].setHeight(height);
		((Batter)player[Count]).setBatcount(batCount);
		((Batter)player[Count]).setHit(hit);
		((Batter)player[Count]).setHitAvg(hitAvg);
		
	}
	public void setBatter(int i) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		System.out.print("선수 타수 입력 : ");
		int batCount = scanner.nextInt();
		System.out.print("선수 안타 수 입력 : ");
		int hit = scanner.nextInt();
		System.out.print("선수 타율 입력 : ");
		double hitAvg = scanner.nextDouble();

		player[i].setNumber(number);
		player[i].setName(name);
		player[i].setAge(age);
		player[i].setHeight(height);
		((Batter)player[i]).setBatcount(batCount);
		((Batter)player[i]).setHit(hit);
		((Batter)player[i]).setHitAvg(hitAvg);
	}
	public void setPitcher() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		System.out.print("선수 승 입력 : ");
		int win = scanner.nextInt();
		System.out.print("선수 패 입력 : ");
		int lose = scanner.nextInt();
		System.out.print("선수 방어율 입력 : ");
		double defence = scanner.nextDouble();

		player[Count].setNumber(number);
		player[Count].setName(name);
		player[Count].setAge(age);
		player[Count].setHeight(height);
		((Pitcher)player[Count]).setWin(win);
		((Pitcher)player[Count]).setLose(lose);
		((Pitcher)player[Count]).setDefence(defence);
	}
	public void setPitcher(int i) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		System.out.print("선수 승 입력 : ");
		int win = scanner.nextInt();
		System.out.print("선수 패 입력 : ");
		int lose = scanner.nextInt();
		System.out.print("선수 방어율 입력 : ");
		double defence = scanner.nextDouble();

		player[i].setNumber(number);
		player[i].setName(name);
		player[i].setAge(age);
		player[i].setHeight(height);
		((Pitcher)player[i]).setWin(win);
		((Pitcher)player[i]).setLose(lose);
		((Pitcher)player[i]).setDefence(defence);
	}
}