package work11_3;

import java.util.Random;

public class Dice {
	private final int COUNT_DICE = 6;
	int randomDice;
	
	public int random() {
		Random random = new Random();
		randomDice = random.nextInt(COUNT_DICE)+1;
		System.out.println("주사위 결과 : " + randomDice);
		return randomDice;
	}
}