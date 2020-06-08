package main;

import menu.*;

public class main {

	public static void main(String[] args) {
		/*
		학생 성적 관리
		String student[][];
		
		메뉴----
		1. 학생 정보 추가	insert	(예: 홍길동, 나이, 영어, 수학)
		2. 학생 정보 삭제	delete
		3. 학생 정보 검색	search
		4. 학생 정보 수정	update
		5. 학생 정보 모두 출력	
		6. 과목의 총점		1. 영어
		7. 과목의 평균
		8. 성적순으로 정렬 출력
		9. 데이터의 저장
	*/
		Menu menu = new Menu();
		menu.mainMenu();
		
	}
}