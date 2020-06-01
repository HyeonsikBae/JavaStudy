package main;

import java.util.Scanner;

public class Rectangular {
	double x,y;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		x = scanner.nextDouble();
		System.out.print("세로 길이 입력 : ");
		y = scanner.nextDouble();
		scanner.close();
	}
	public void area() {
		System.out.println("사각형 면적 : "+(x*y));
	}
}
