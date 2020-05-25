package work5;

import java.util.Arrays;
import java.util.Random;

public class TrumpShuffle {
	public static final int SELECT_NUMBER = 52;
	public static final int CARD_NUMBER = 52;
	public static void main(String[] args) {
		
		boolean check[] = new boolean[CARD_NUMBER];
		int card[] = new int[SELECT_NUMBER];
		Random random = new Random();
		int cardCheck = 0;
		
		
		
		for(int i=0;i<card.length;i++) {
			cardCheck = random.nextInt(CARD_NUMBER);
			if(check[cardCheck]==false) {
				card[i] = cardCheck + 1;
				check[cardCheck] = true;
			}
			else {
				i--;
			}
		}
		
		Arrays.sort(card);
		
		for(int i=0;i<card.length;i++) {
			System.out.println(card[i]);
		}
		
		for(int i=0;i<card.length;i++) {
			switch(card[i]/13) {
				case 0:
					System.out.println("¢¼ " + (card[i]%13));
					break;
				case 1:
					System.out.println("¡ß " + (card[i]%13));
					break;
				case 2:
					System.out.println("¢¾ " + (card[i]%13));
					break;
				case 3:
					System.out.println("¢À " + (card[i]%13));
					break;
			}
		}
		
		/*
		for(int i=0;i<SELECT_NUMBER;i++) {
			if(card[i]<=13) {
				System.out.println("¢¼ " + (card[i]));
			}
			else if(card[i]<=26) {
				System.out.println("¡ß " + (card[i]-13));
			}
			else if(card[i]<=39) {
				System.out.println("¢¾ " + (card[i]-26));
			}
			else{
				System.out.println("¢À " + (card[i]-39));
			}
		}
		*/
	}
}
