package DAO;
import java.util.Scanner;

import DTO.*;
import FileManagement.*;
//DAO:Data Access Object = model = back end
public class MemberDao {
	// 데이터 담을 배열 필요
	private int type;
	Human player[] = new Human[0];
	
	public MemberDao() {

	}
	
	public void insert() {
		Scanner scanner = new Scanner(System.in);
		int length = player.length+1;
		Human temp[] = new Human[length];
		for(int i = 0;i<length-1;i++) {
			temp[i] = player[i];
		}
		
		System.out.println("선수 타입 선택");
		System.out.println("1. 타자	2. 투수");
		System.out.println(">>> ");
		this.type = scanner.nextInt();
		if(this.type == 1) {
			temp[length-1] = new Batter();
			setBatter(temp);
		}
		else {
			temp[length-1] = new Pitcher();
			setPitcher(temp);
		}
		player = temp;
	}
	
	public void delete() {
		Scanner scanner = new Scanner(System.in);
		int length = player.length;
		Human temp[] = new Human[length-1];
		int i=0;
		System.out.println("삭제할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i = search(playerNumber);

		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");
		else {
			for(int j = 0;j<i;j++) {
				temp[j] = player[j];
			}
			for(int j=i;j<length-1;j++) {
				temp[j] = player[j+1];
			}
			player = temp;
			System.out.println(playerNumber+"번 선수가 삭제되었습니다.");
		}
	}
	
	public void select() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int i=0;
		System.out.println("찾고 싶은 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");	
		else System.out.println(((Human)player[i]).toString());
	}
	
	public void update() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int i=0;
		System.out.println("수정할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");
		else {
			if(player[i] instanceof Batter) setBatter(i);
			else setPitcher(i);
			System.out.println(i+"번 선수의 정보를 변경하였습니다.");
		}
	}

	public void allPrint() {
		for(int i=0;i<player.length;i++) {
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
	
	public void setBatter(Human temp[]) {
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

		temp[temp.length-1].setNumber(number);
		temp[temp.length-1].setName(name);
		temp[temp.length-1].setAge(age);
		temp[temp.length-1].setHeight(height);
		((Batter)temp[temp.length-1]).setBatcount(batCount);
		((Batter)temp[temp.length-1]).setHit(hit);
		((Batter)temp[temp.length-1]).setHitAvg(hitAvg);
		
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
	public void setPitcher(Human temp[]) {
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

		temp[temp.length-1].setNumber(number);
		temp[temp.length-1].setName(name);
		temp[temp.length-1].setAge(age);
		temp[temp.length-1].setHeight(height);
		((Pitcher)temp[temp.length-1]).setWin(win);
		((Pitcher)temp[temp.length-1]).setLose(lose);
		((Pitcher)temp[temp.length-1]).setDefence(defence);
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