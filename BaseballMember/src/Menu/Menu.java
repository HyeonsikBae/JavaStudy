package Menu;

import java.util.Scanner;
import DAO.*;
import AboutFile.*;
public class Menu {

	public Menu() {
		
	}
	public void choiceTeam() {
		Scanner scanner = new Scanner(System.in);
		AboutFile afile = new AboutFile();
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
				afile.createFile("롯데");
				break;
			case 2:
				afile.createFile("꼴데");
				break;
			case 3:
				afile.createFile("봄데");
				break;
			case 4:
				afile.createFile("엘롯기");
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;
		}	
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		boolean replay = true;
		while(replay) {
			
			System.out.println("Baseball Player Management Program");
			System.out.println("==================================");
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제");
			System.out.println("3. 선수 선택");
			System.out.println("4. 선수 수정");
			System.out.println("5. 전체 선수 출력");
			System.out.println("0. 종료");
			System.out.println("==================================");
			System.out.println("메뉴 선택");
			System.out.println(">>> ");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:
					dao.update();
					break;
				case 5:
					dao.allPrint();
					break;
				case 0:
					System.out.println("=============시스템 종료=============");
					replay = false;
					break;
			}
		}
	}
}
