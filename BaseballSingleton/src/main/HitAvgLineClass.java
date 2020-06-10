package main;

import java.util.ArrayList;
import PlayerList.*;

public class HitAvgLineClass {

	PlayerList pl = PlayerList.getPlayerList();
	
	public void hitAvgLine() {
		ArrayList<Human> hitAvg = new ArrayList<Human> ();
		for(int i=0;i<pl.getArray().size();i++) {
			Human temp = pl.getArray().get(i);
			if(temp instanceof Batter) {
				hitAvg.add(temp);
			}
		}
		
		for(int i=0;i<hitAvg.size()-1;i++) {
			for(int j=i+1;j<hitAvg.size();j++) {
				if(((Batter)hitAvg.get(i)).getHitAvg()<((Batter)hitAvg.get(j)).getHitAvg()) {
					Human temp = hitAvg.get(i);
					hitAvg.set(i,hitAvg.get(j));
					hitAvg.set(j, temp);
				}
			}
		}
		for(int i=0;i<hitAvg.size();i++) {
			System.out.println(hitAvg.get(i));
		}
	}
}
