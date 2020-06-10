package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import PlayerList.*;



public class FileSaveClass {
	File file;
	//String team = FileCreateClass.team;
	
	public void fileWrite(ArrayList<Human> playerList) {
		try {
			//System.out.println(this.team);//null
			//System.out.print(team.equals(FileCreateClass.team));
			file = new File("d:\\temp\\"+FileCreateClass.team+".txt");
			Human datas[] = new Human[playerList.size()];	
			for(int i=0;i<playerList.size();i++) {
				Human temp = playerList.get(i);
				datas[i] = temp;
				System.out.println(datas[i]);
			}
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i=0;i<playerList.size();i++) {
				pw.println(datas[i]);
			}
			System.out.println("저장 성공");
			pw.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void fileWriteWithDelete(ArrayList<Human> playerList) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			if(file.exists()) {
				for(int i=0;i<playerList.size();i++) {
					Human mem = playerList.get(i);
					pw.println(mem);
				}
			}
			System.out.println("저장 성공");
			pw.close();
		}catch(Exception e) {
			System.out.println("저장 실패");
		}
	}
}
