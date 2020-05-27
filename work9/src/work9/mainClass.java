package work9;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		함수생성
		두수를 나눈 몫, 나머지를 구하는 함수
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
				System.out.print((i+1)+"번 숫자 입력 : ");
				array[i] = scanner.next();
				for(int j=0;j<array[i].length();j++) {
					if(array[i].charAt(j)>'9'||array[i].charAt(j)<'0') {
						System.out.println("잘못 입력 하셨습니다.");
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
		System.out.println(array[0] + "을 " + array[1] + "로 나눈 몫\t: " + num1/num2);
		System.out.println(array[0] + "을 " + array[1] + "로 나눈 나머지\t: " + num1%num2);
	}
}