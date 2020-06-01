package main;

import java.util.Scanner;

public class Select {
	int num;
	
	public int select() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 원 넓이 계산");
		System.out.println("2. 사각형 넓이 계산");
		System.out.println(">>> ");
		
		num = scanner.nextInt();
		
		return num;
	}
}
