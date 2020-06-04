package main;

import java.util.Scanner;
import DAO.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// menu 구성
		
		/*	
		 	1. 선수추가
			2. 선수삭제
			3. 선수선택
			4. 선수수정
			5. 전체출력
		*/
		
		
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