package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import PlayerList.*;

public class FileLoadClass {
	PlayerList pl = PlayerList.getPlayerList();
	private File file;
	
	public ArrayList<Human> fileLoad() {
		ArrayList<Human> playerList = new ArrayList<Human>();
		file = new File("d:\\temp\\"+FileCreateClass.team+".txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int count = 0;		
			String temp="";
			while((temp=br.readLine())!=null) {
				count++;
			}
			br.close();
			br = new BufferedReader(new FileReader(file));
			
			String strRead[] = new String[count];
			int i=0;
			while((temp=br.readLine())!=null) {
				strRead[i] = temp;
				i++;
			}
			
			Human[] player = new Human[count];
			
			for(int j=0;j<count;j++) {
				String data[]  = strRead[j].split("-");
				if(data[0].equals("타자")) {
					player[j] = new Pitcher(data[0],
											Integer.parseInt(data[1]),
											data[2],
											Integer.parseInt(data[3]),
											Double.parseDouble(data[4]),
											Integer.parseInt(data[5]),
											Integer.parseInt(data[6]),
											Double.parseDouble(data[7])
											);
				}		
				else {
					player[j] = new Pitcher(data[0],
											Integer.parseInt(data[1]),
											data[2],
											Integer.parseInt(data[3]),
											Double.parseDouble(data[4]),
											Integer.parseInt(data[5]),
											Integer.parseInt(data[6]),
											Double.parseDouble(data[7])
											);
				}
				pl.getArray().add(player[j]);
			}
			br.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return playerList;
	}
}
