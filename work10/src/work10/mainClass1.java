package work10;

import java.util.Scanner;

public class mainClass1 {
	public static void main(String[] args) {

		int array[] = new int[4];
		inputNum(array);
		cal(array);
		
	}

	static void cal(int array[]) {
		double result = Math.sqrt(Math.pow(array[0]-array[2], 2)+Math.pow(array[1]-array[3], 2));
		
		System.out.println("�Ÿ� : " + result);
	}
	
	static void inputNum(int array[]) {
		Scanner scanner = new Scanner(System.in);
		int a=0;
		int b=0;
		for(int i=0;i<4;i++) {
			if(i%2==0) {
				System.out.print("x"+a+" �Է� : ");
				a++;
			}
			else {
				System.out.print("y"+b+" �Է� : ");
				b++;
			}
		array[i]=scanner.nextInt();
		}
		scanner.close();
	}
}