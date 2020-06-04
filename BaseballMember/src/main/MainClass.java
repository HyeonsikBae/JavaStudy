package main;

import java.util.Scanner;
import DAO.*;
import Menu.*;
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
		Menu menu = new Menu();
		menu.choiceTeam();
		menu.menu();
	}
}