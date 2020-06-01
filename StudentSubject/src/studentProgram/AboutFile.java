package studentProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AboutFile {
	
	Scanner scanner = new Scanner(System.in);
	private String fileAddress = "d:\\temp\\";
	String fileName="";
	String file="";
	File studentFile;
	
	public void createFile() {
		
		System.out.print("생성 또는 찾으려는 파일명을 입력해주세요\n입력 : ");
		this.fileName = scanner.next();
		this.file = fileAddress + fileName;
		File studentFile = new File(this.file);
		this.studentFile = studentFile;
		try {
			if(studentFile.createNewFile()) {
				System.out.println("파일 생성 완료");
			}
			else {
				System.out.println("파일이 이미 존재합니다.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void dataSave(String data[]) {
		
		try {
			FileWriter fw = new FileWriter(this.studentFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i=0;i<data.length;i++){
				pw.print(data[i]+"\t");
				if(i%5==4) {
					pw.println();
				}
			}
			System.out.println("데이터 저장 성공");
			pw.close();
		}catch(IOException e) {
			System.out.println("데이터 저장 실패");
		}
	}
	
	public void dataReadAll() {
			
		try {
			FileReader fr = new FileReader(this.studentFile);
			BufferedReader br = new BufferedReader(fr);
			
			int count = 0;
			String tempS="";
			
			while((tempS = br.readLine())!=null) {
				System.out.println(tempS);
				count++;
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void dataRead(int num) {
		
		try {
			FileReader fr = new FileReader(this.studentFile);
			BufferedReader br = new BufferedReader(fr);
			
			int count = 0;
			String tempS="";
			
			while((tempS = br.readLine())!=null) {
				count++;
			}
			br.close();	
			
			String strRead[] = new String[count];
			
			fr = new FileReader(this.studentFile);
			br = new BufferedReader(fr);
			
			int i=0;
			while(((tempS=br.readLine())!=null)&&(i<num)) {
				strRead[i]=tempS;
				i++;
			}
			
			System.out.println(strRead[num-1]);
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public int dataGetIndex(String name) {
		int count = 0;
		try {
			FileReader fr = new FileReader(this.studentFile);
			BufferedReader br = new BufferedReader(fr);
			
			String tempS;
			
			while((tempS = br.readLine())!=null) {
				count++;
				if(tempS.contains(name)) {
					break;
				}
			}
			if(tempS.equals("")) {
				count=0;
			}
			br.close();	
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		return count;
	}
}
