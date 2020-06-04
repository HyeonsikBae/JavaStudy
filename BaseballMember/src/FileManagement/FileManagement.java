package FileManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import DAO.*;
import DTO.*;

public class FileManagement {
	File file;
	public FileManagement(){
		
	}
	public void createFile(){
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("팀 이름을 입력해주세요.");
		System.out.print(">>> ");
		String team = scanner.next();
		file = new File("d:\\temp\\"+team+".txt");
		file.createNewFile();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	public void fileRead(File file,Human player[]) {
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int count = player.length;
		String temp="";
		String strRead[] = new String[count];
		int i=0;
		while((temp=br.readLine())!=null) {
			strRead[i] = temp;
			i++;
		}
		
		for(int j=0;j<count;j++) {
			System.out.println(strRead[j]);
		}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public void fileWrite(File file,Human player[]) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			if(file.exists()) {
				for(int i=0;i<player.length;i++) {
					pw.println(player[i]);
				}
			}
			pw.close();
		}catch(Exception e) {
			System.out.println("저장 실패");
		}
		System.out.println("저장 성공");
	}
}
