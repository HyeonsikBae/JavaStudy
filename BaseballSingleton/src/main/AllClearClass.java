package main;
import PlayerList.*;
public class AllClearClass {
	PlayerList pl = PlayerList.getPlayerList();
	
	public void allClear() {
		pl.getArray().removeAll(pl.getArray());
		FileSaveClass fsc = new FileSaveClass();
		fsc.fileWrite(pl.getArray());
	}
}