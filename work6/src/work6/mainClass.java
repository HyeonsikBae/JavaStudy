package work6;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		Problem 1.
		1. String �Է�.
		2. ��� �������� �Ǻ�
		3. �����̸� ���.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char check[] = input.toCharArray();
		int output=0;
		
		for(int i=0;i<input.length();i++) {
			if(check[i]>'9'||check[i]<'0') {
				System.out.println("���ڰ� �ƴմϴ�.");
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
		1. String �Է�
		2. �������� �Ǽ����� �Ǻ�
		 */
		
		/*
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if(input.contains(".")) {
			System.out.println("�Ǽ�");
		}
		else {
			System.out.println("����");
		}
		
		scanner.close();
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� : ");
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
			System.out.println("���� : " + input);
		}
		else if(output.contains("2")) {
			System.out.println("�Ǽ� : " + Double.parseDouble(input));
		}
		else {
			System.out.println("���� : " + Integer.parseInt(input));
		}
		scanner.close();	
	}
}