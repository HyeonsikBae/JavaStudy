package work6;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		Problem 1.
		1. String 입력.
		2. 모두 숫자인지 판별
		3. 숫자이면 출력.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char check[] = input.toCharArray();
		int output=0;
		
		for(int i=0;i<input.length();i++) {
			if(check[i]>'9'||check[i]<'0') {
				System.out.println("숫자가 아닙니다.");
				output=1;
				break;
			}
		}
		if(output==0) {
		System.out.println(Integer.parseInt(input));
		}
		
		scanner.close();
		*/
		
		/*
		Problem 2.
		1. String 입력
		2. 정수인지 실수인지 판별
		 */
		
		/*
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if(input.contains(".")) {
			System.out.println("실수");
		}
		else {
			System.out.println("정수");
		}
		
		scanner.close();
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = scanner.next();
		char check[] = input.toCharArray();
		String output = "";
		
		for(int i=0;i<input.length();i++) {
			if((check[i]>'9'||check[i]<'0')&&check[i]!='.') {
				output += 1;
			}
			else if(check[i]=='.') {
				output += 2;
			}
			else {
				output += 3;
			}
		}
		
		if(output.contains("1")) {
			System.out.println("문자 : " + input);
		}
		else if(output.contains("2")) {
			System.out.println("실수 : " + Double.parseDouble(input));
		}
		else {
			System.out.println("정수 : " + Integer.parseInt(input));
		}
		scanner.close();	
	}
}