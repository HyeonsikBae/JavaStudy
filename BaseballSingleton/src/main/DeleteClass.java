package main;

import java.util.Scanner;
import PlayerList.*;

public class DeleteClass {
	
	PlayerList pl = PlayerList.getPlayerList();
	Scanner scanner = new Scanner(System.in);
	Search search = new Search();
	
	public void delete() {
		System.out.println("삭제할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int deleteIndex = search.search(playerNumber);
		if(deleteIndex==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			pl.getArray().remove(deleteIndex);
			System.out.println(playerNumber + "번 선수를 삭제하였습니다.");
		}
	}
}
