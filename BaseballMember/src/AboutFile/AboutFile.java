package AboutFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import DTO.*;

public class AboutFile {
	private File file;
	
	
	public AboutFile() {
		
	}
	public AboutFile(String team){
		file = new File("d:\\temp\\"+team+".txt");
	}
	
	public void createFile(String team){
		try {
		
		this.file = new File("d:\\temp\\"+team+".txt");
		this.file.createNewFile();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	/*
	public void createFile(){
		try {
			if(file.createNewFile()) System.out.println("파일 생성 !");
			else System.out.println("파일 생성 실패 !");
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	*/
	public Human[] fileLoad(Human player[]) {
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
		
		player = new Human[count];
		
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
		}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		return player;
	}
	
	public void fileWrite(Human player[]) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
			
			for(int i=0;i<player.length;i++) {
				pw.println(player[i]);
			}
			System.out.println("저장 성공");
			pw.close();
		}catch(Exception e) {
			System.out.println("저장 실패");
		}
		
	}
	
	public void fileWriteWithDelete(Human player[]) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			if(file.exists()) {
				for(int i=0;i<player.length;i++) {
					pw.println(player[i]);
				}
			}
			System.out.println("저장 성공");
			pw.close();
		}catch(Exception e) {
			System.out.println("저장 실패");
		}
	}
}
