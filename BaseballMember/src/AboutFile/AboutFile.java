package AboutFile;

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

public class AboutFile {
	private static File file;
	public AboutFile(){
		
	}
	/*
	public void createFile(){
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("팀 이름을 입력해주세요.");
		System.out.print(">>> ");
		String team = scanner.next();
		this.file = new File("d:\\temp\\"+team+".txt");
		this.file.createNewFile();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	*/
	
	public void createFile(String team){
		try {
			file = new File("d:\\temp\\"+team+".txt");
			file.createNewFile();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	
	 
	public void fileRead(Human player[]) {
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;		
		String temp="";
		while((temp=br.readLine())!=null) {
			count++;
		}
		
		br.close();
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		
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
	
	public void fileWrite(Human player[]) {
		try {
			FileWriter fw = new FileWriter(file,true);
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
