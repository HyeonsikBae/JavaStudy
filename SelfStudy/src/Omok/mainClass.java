package Omok;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map map = new Map();
		map.mapInit();

		boolean BnW = true;
		
		while(true){
			System.out.print("돌을 놓으세요 : ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if(BnW) {
				map.mapPoint[x][y]="●";
			}
			else {
				map.mapPoint[x][y]="○";
			}
			BnW = !BnW;		
			map.mapPrint();
		}
	}
	
}
class Map{
	
	public String mapPoint[][] = new String[30][30];
	
	public void mapInit() {
		for(int i=0;i<15;i++) {
			for(int j=0;j<30;j++) {
				this.mapPoint[i][j]="-";
			}
		}
	}
	
	public void mapPrint() {
		for(int i=0;i<15;i++) {
			for(int j=0;j<30;j++) {
				System.out.print(this.mapPoint[i][j]);
			}
			System.out.println();
		}
	}
	
}
