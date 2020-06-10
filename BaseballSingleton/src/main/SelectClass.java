package main;
import java.util.Scanner;

import PlayerList.*;

public class SelectClass {
	Scanner scanner = new Scanner(System.in);
	Search search = new Search();
	PlayerList pl = PlayerList.getPlayerList();
	
	public void select() {
		System.out.println("찾고 싶은 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int selectNum = search.search(playerNumber);
		if(selectNum==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			System.out.println(pl.getArray().get(selectNum));
		}
	}
}
