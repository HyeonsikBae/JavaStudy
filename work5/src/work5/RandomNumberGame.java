package work5;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String select;
		
		while(bool) {
			select = "";
			int rand = random.nextInt(100)+1;
			
			for(int i=0;i<10;i++) {
				int guess = 0;
				while(guess<1||guess>100) {
					System.out.print((i+1) + "번째 입력 : ");
					guess = scanner.nextInt();
					if(guess>=1&&guess<=100) {
						continue;
					}
					System.out.println("ERROR");
				}
					
				if(guess>rand) {
					System.out.println("너무 큽니다.");
				}
				else if(guess<rand) {
					System.out.println("너무 작습니다.");
				}
				else {
					System.out.println("정답입니다.");
					break;
				}
				if(i==9) {
					System.out.println("실패");
				}
			}
			
			while(!select.equals("Y")&&!select.equals("N")) {
				System.out.print("재도전 하시겠습니까? Y/N");
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