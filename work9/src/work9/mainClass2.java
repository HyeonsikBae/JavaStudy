package work9;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		/*
		�Լ� ����
		Upper Case, Lower Case
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = scanner.next();
		
		System.out.print("1�� . �ҹ��� -> �빮��\n"
						+"2�� . �빮�� -> �ҹ���\n");
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
			System.out.print("�Է� : ");
			choice = scanner.next();
			if(choice.length()!=1 || 
			   (choice.charAt(0)!='1' &&
			   choice.charAt(0)!='2')){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
