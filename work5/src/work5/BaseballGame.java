package work5;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String select="";
		boolean bool = true;
		
		
		while(bool) {
			int strike = 0;
			int ball = 0;
			select="";
			int array[] = new int[3];
			
			
			for(int i=0;i<3;i++) {
				array[i] = random.nextInt(10)+1;
				for(int j=0;j<3;j++) {
					if(array[i] == array[j] && i != j) {
						i--;
					}
				}
			}
			
			for(int i=0;i<3;i++) {
				System.out.print(array[i]+"\t");
			}	System.out.println();
			
			while(strike!=3) {
				int guess[] = new int[3];
				ball = strike = 0;
				System.out.print("숫자 입력 : ");
				for(int i=0;i<3;i++) {
					guess[i] = scanner.nextInt();
				}
				
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(array[i]==guess[j] && i==j) {
							strike++;
						}
						else if(array[i]==guess[j] && i!=j) {
							ball++;
						}
					}
				}
				System.out.println(ball+"BALL"+"\t"+strike+"STRIKE");
			}
		
			while(!select.equals("Y")&&!select.equals("N")) {
				select = "";
				System.out.print("다시 도전하시겠습니까? Y/N");
				select = scanner.next();
				if(select.equals("Y")) {
					bool = true;
				}
				else if(select.equals("N")) {
					bool = false;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		System.out.println("종료");
		scanner.close();
	}
}
