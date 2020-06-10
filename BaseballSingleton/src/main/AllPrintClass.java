package main;

import PlayerList.PlayerList;

public class AllPrintClass {
	
	PlayerList pl = PlayerList.getPlayerList();
	
	public void print() {
		for(int i=0;i<pl.getArray().size();i++) {
			System.out.println(pl.getArray().get(i).toString());
		}
	}
}
