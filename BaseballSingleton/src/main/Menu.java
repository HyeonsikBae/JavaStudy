package main;

import java.util.Scanner;
import PlayerList.*;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	PlayerList pl = PlayerList.getPlayerList();
	
	public void choiceTeam() {	
		FileCreateClass fcc = new FileCreateClass();
		System.out.println("Choice Team");
		System.out.println("===========");
		System.out.println("1. 롯데");
		System.out.println("2. 엘지");
		System.out.println("3. 기아");
		System.out.println("4. 엘롯기");
		System.out.println("===========");
		System.out.println("팀 선택");
		System.out.println(">>> ");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				fcc.createFile("롯데");
				break;
			case 2:
				fcc.createFile("엘지");
				break;
			case 3:
				fcc.createFile("기아");
				break;
			case 4:
				fcc.createFile("엘롯기");
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;
		}
		FileLoadClass flc = new FileLoadClass();
		flc.fileLoad();
	}
	
	public void menu() {

		boolean replay = true;
		while(replay) {
			
			System.out.println("Baseball Player Management Program");
			System.out.println("==================================");
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제");
			System.out.println("3. 선수 선택");
			System.out.println("4. 선수 수정");
			System.out.println("5. 전체 선수 출력");
			System.out.println("6. 타율순 타자 출력");
			System.out.println("7. 방어율순 투수 출력");
			System.out.println("9. 모두 삭제");
			System.out.println("0. 종료");
			System.out.println("==================================");
			System.out.println("메뉴 선택");
			System.out.println(">>> ");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					pl.insert();
					break;
				case 2:
					pl.delete();
					break;
				case 3:
					pl.select();
					break;
				case 4:
					pl.update();
					break;
				case 5:
					pl.allPrint();
					break;
				case 6:
					pl.hitAvgLine();
					break;
				case 7:
					pl.defenceLine();
					break;
				case 9:
					pl.allClear();
					break;
				case 0:
					System.out.println("=============시스템 종료=============");
					replay = false;
					break;
			}
		}
	}
}
