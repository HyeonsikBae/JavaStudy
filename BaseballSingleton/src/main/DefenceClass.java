package main;

import java.util.ArrayList;

import PlayerList.*;

public class DefenceClass {

	PlayerList pl = PlayerList.getPlayerList();
	
	public void defenceLine() {
		ArrayList<Human> defAvg = new ArrayList<Human> ();
		for(int i=0;i<pl.getArray().size();i++) {
			Human temp = pl.getArray().get(i);
			if(temp instanceof Pitcher) {
				defAvg.add(temp);
			}
		}
		
		for(int i=0;i<defAvg.size()-1;i++) {
			for(int j=i+1;j<defAvg.size();j++) {
				if(((Pitcher)defAvg.get(i)).getDefence()>((Pitcher)defAvg.get(j)).getDefence()) {
					Human temp = defAvg.get(i);
					defAvg.set(i,defAvg.get(j));
					defAvg.set(j, temp);
				}
			}
		}
		for(int i=0;i<defAvg.size();i++) {
			System.out.println(defAvg.get(i));
		}
	}
}
