package work9;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		/*
		함수 생성
		Upper Case, Lower Case
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = scanner.next();
		
		System.out.print("1번 . 소문자 -> 대문자\n"
						+"2번 . 대문자 -> 소문자\n");
		int select = choice();
		switch(select) {
			case 1:
				upperCase(str);
				break;
			case 2:
				lowerCase(str);
				break;
		}
		scanner.close();
	}
	static int choice() {
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		while(true) {
			System.out.print("입력 : ");
			choice = scanner.next();
			if(choice.length()!=1 || 
			   (choice.charAt(0)!='1' &&
			   choice.charAt(0)!='2')){
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			else {
				break;
			}
		}
		return Integer.parseInt(choice);
	}
	static void upperCase(String str) {
		String rstr="";
		for(int i=0;i<str.length();i++) {
			char asc = str.charAt(i);
			if(asc>='a'&& asc<='z') {
				asc -= 32;
				rstr += asc;
			}
			else {
				rstr += asc;
			}
		}
		System.out.println(rstr);
	}
	static void lowerCase(String str) {
		String rstr="";
		for(int i=0;i<str.length();i++) {
			char asc = str.charAt(i);
			if(asc>='A'&& asc<='Z') {
				asc += 32;
				rstr += asc;
			}
			else {
				rstr += asc;
			}
		}
		System.out.println(rstr);
	}
}
