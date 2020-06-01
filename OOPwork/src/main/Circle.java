package main;

import java.util.Scanner;

public class Circle {
	double r;
	final double pi = 3.14;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		r = scanner.nextDouble();
		scanner.close();
	}
	public void area() {
		System.out.println("원 면적 : "+(2*pi*Math.pow(r, 2)));
	}
}
