package game;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		
		do {
			game.random();
			game.game();
		}while(game.regame());
	}
}