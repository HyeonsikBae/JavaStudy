package main;

public class main {

	public static void main(String[] args) {
		
		Baseball baseballGame = new Baseball();
		
		do {
		baseballGame.count();
		baseballGame.rand();
		baseballGame.check();
		}while(baseballGame.regame());
	}
}