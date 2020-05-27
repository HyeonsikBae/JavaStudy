package work10;

import java.util.Scanner;

public class mainClass4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input : ");
		String str=scanner.next();
		System.out.println(check(str));
		scanner.close();
	}
	static boolean check(String str) {
		boolean check = true;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>'9'||c<'0') {
				check = false;
				break;
			}
		}
		return check;
	}
}
