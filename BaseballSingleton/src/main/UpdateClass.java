package main;
import java.util.Scanner;

import PlayerList.*;

public class UpdateClass {
	
	InsertMessage im = new InsertMessage();
	Search search = new Search();
	PlayerList pl = PlayerList.getPlayerList();
	Scanner scanner = new Scanner(System.in);
	
	public void update() {
		System.out.println("수정할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int updateNum = search.search(playerNumber);
		if(updateNum==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			if(pl.getArray().get(updateNum).getType().equals("타자")) {
				Human temp = im.setHuman(1);
				pl.getArray().set(updateNum, temp);
			}
			else {
				Human temp = im.setHuman(2);
				pl.getArray().set(updateNum, temp);
			}
		}
	}
}
