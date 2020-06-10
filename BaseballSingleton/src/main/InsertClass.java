package main;
import java.util.Scanner;

import PlayerList.*;

public class InsertClass {
	
	Scanner scanner = new Scanner(System.in);
	InsertMessage im = new InsertMessage();
	
	
	public Human insert() {
		
		System.out.println("선수 타입 선택");
		System.out.println("1. 타자	2. 투수");
		System.out.println(">>> ");
		int position = scanner.nextInt();
		return im.setHuman(position);
	}
}
