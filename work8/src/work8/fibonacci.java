package work8;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 번째 Fibonacci까지 출력하시겠습니까 : ");
		int num = scanner.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Fibonacci "+(i+1)+"번째 수 : " + fibonacci_(i));
		}
		scanner.close();
	}
	public static long fibonacci_(int count) {
		
		long fibo[] = {0,1,1};
		
		for(int i=0;i<count;i++) {
			fibo[i%3] = fibo[(i+1)%3] + fibo[(i+2)%3];
		}
		return fibo[count%3];
	}
}