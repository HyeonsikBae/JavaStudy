package PlayerList;

import java.util.ArrayList;

import main.*;


public class PlayerList {
	
	private static PlayerList pl = null;
	private static ArrayList<Human> h;
	FileSaveClass fsc = new FileSaveClass();
	
	private PlayerList() {
		h = new ArrayList<Human>();
	}
	
	public static PlayerList getPlayerList() {
		if(pl == null) {
			pl = new PlayerList();
		}
		return pl;
	}
	
	public ArrayList<Human> getArray(){
		return h;
	}
	
	public void insert() {
		
		InsertClass ic = new InsertClass();
		Human human = ic.insert();
		this.h.add(human);
		fsc.fileWrite(h);
	}
	public void delete() {
		
		DeleteClass dc = new DeleteClass();
		dc.delete();
		fsc.fileWrite(h);
	}
	public void update() {
		UpdateClass uc = new UpdateClass();
		uc.update();
		fsc.fileWrite(h);
	}
	public void allPrint() {
		AllPrintClass apc = new AllPrintClass();
		apc.print();
	}
	public void select() {
		SelectClass sc = new SelectClass();
		sc.select();
	}
	public void hitAvgLine() {
		HitAvgLineClass halc = new HitAvgLineClass();
		halc.hitAvgLine();
	}
	public void defenceLine() {
		DefenceClass dc = new DefenceClass();
		dc.defenceLine();
	}
	public void allClear() {
		AllClearClass acc = new AllClearClass();
		acc.allClear();
	}
	
	@Override
	public String toString() {
		return "PlayerList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}