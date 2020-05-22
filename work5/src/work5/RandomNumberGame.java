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
					System.out.print((i+1) + "��° �Է� : ");
					guess = scanner.nextInt();
					if(guess>=1&&guess<=100) {
						continue;
					}
					System.out.println("ERROR");
				}
					
				if(guess>rand) {
					System.out.println("�ʹ� Ů�ϴ�.");
				}
				else if(guess<rand) {
					System.out.println("�ʹ� �۽��ϴ�.");
				}
				else {
					System.out.println("�����Դϴ�.");
					break;
				}
				if(i==9) {
					System.out.println("����");
				}
			}
			
			while(!select.equals("Y")&&!select.equals("N")) {
				System.out.print("�絵�� �Ͻðڽ��ϱ�? Y/N");
				select = scanner.next();
				if(select.equals("Y")) {
					bool = true;
				}
				else if(select.equals("N")) {
					bool = false;
				}
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}	
		}
	System.out.println("����");
		
	scanner.close();
	}
}