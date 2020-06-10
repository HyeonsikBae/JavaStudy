package main;
import PlayerList.*;

public class Search {

	PlayerList pl = PlayerList.getPlayerList();
	
	public int search(int number) {
		int findNum = -1;
		for(int i=0;i<pl.getArray().size();i++) {
			Human mem = pl.getArray().get(i);
			if(mem.getNumber()==number) {
				findNum = i;
				break;
			}
		}
		return findNum;
	}
	public int searchName(String name) {
		int findName = -1;
		for(int i=0;i<pl.getArray().size();i++) {
			Human mem = pl.getArray().get(i);
			if(mem.getName().equals(name)) {
				findName = i;
			}
		}
		return findName;
	}
}