package work9;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		�Լ�����
		�μ��� ���� ��, �������� ���ϴ� �Լ�
		 */
		
		Scanner scanner = new Scanner(System.in);
		String array[] = new String[2];
		inputNum(array);
		devider(array);
		
		scanner.close();
	}
	static void inputNum(String array[]) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			while(true) {
				System.out.print((i+1)+"�� ���� �Է� : ");
				array[i] = scanner.next();
				for(int j=0;j<array[i].length();j++) {
					if(array[i].charAt(j)>'9'||array[i].charAt(j)<'0') {
						System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
						i--;
						break;
					}
				}
				break;
			}
		}
	}
	
	static void devider(String array[]) {
		int num1 = Integer.parseInt(array[0]);
		int num2 = Integer.parseInt(array[1]);
		System.out.println(array[0] + "�� " + array[1] + "�� ���� ��\t: " + num1/num2);
		System.out.println(array[0] + "�� " + array[1] + "�� ���� ������\t: " + num1%num2);
	}
}