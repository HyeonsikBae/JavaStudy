package menu;

import java.util.Scanner;

import DAO.*;

public class Menu {
	
	public Menu(){
		
	}
	
	public void mainMenu(){
		StudentDAO dao = new StudentDAO();
		Scanner scanner = new Scanner(System.in);
		int select = -1;
		boolean re = true;
		
		while(re) {
			while(true) {
				System.out.println("==============");
				System.out.println("0. 종료");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 삭제");
				System.out.println("3. 학생 정보 검색");
				System.out.println("4. 학생 정보 수정");
				System.out.println("5. 학생 정보 출력");
				System.out.println("6. 과목 평균 출력");
				System.out.println("7. 전체 평균 출력");
				System.out.println("8. 성적 등수 출력");
				System.out.println("==============");
				System.out.println("메뉴를 선택하세요.");
				System.out.println(">>>");
				select = scanner.nextInt();
				if(select>8||select<0) System.out.println("잘못 입력 하셨습니다.");
				else break;
			}

			switch(select) {
				case 0:
					System.out.println("종료");
					re = false;
					break;
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
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
			}
		}
	}
}
