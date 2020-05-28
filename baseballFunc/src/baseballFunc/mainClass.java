package baseballFunc;

import java.util.Random;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		int ranNum[] = new int[3];
		do {
		rand(ranNum,count());
		check(ranNum);
		}while(regame());
	}
	static boolean regame() {
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String select="";
		while(!select.equals("Y")&&!select.equals("N")) {
			select = "";
			System.out.print("다시 도전하시겠습니까? Y/N");
			select = scanner.next();
			if(select.equals("Y")) {
				bool = true;
			}
			else if(select.equals("N")) {
				System.out.println("종료");
				bool = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		return bool;
	}
	static void check(int array[]) {
		Scanner scanner = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
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
		System.out.println("정답입니다");
	}
	static void rand (int array[],int length) {
		Random random = new Random();
		boolean check[] = new boolean[length];
		int temp = 0;
		for(int i=0;i<3;i++) {
			check[i]=false;
		}
		for(int i=0;i<3;i++) {
			temp = random.nextInt(length);
			if(check[temp]==false) {
				array[i] = temp+1;
				check[temp] = true;
			}
			else {
				i--;
			}
		}
	}
	static int count() {
		String numStr = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("몇 까지의 수 입력 : ");
			numStr = scanner.next();
			char c=' ';
			for (int i = 0; i < numStr.length(); i++) {
				c = numStr.charAt(i);
				if(c>'9'||c<'0'||(numStr.length()==1&&c=='1'||c=='2')) {
					System.out.println("잘못 입력하셨습니다.");
					c = ' ';
					break;
				}
			}
			if(c!=' ') {
				break;
			}
		}
		return Integer.parseInt(numStr);
	}
}