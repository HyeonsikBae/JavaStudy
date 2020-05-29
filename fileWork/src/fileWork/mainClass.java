package fileWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {
	public static void main(String[] args) throws IOException {
		
		File file = new File("d:\\temp\\test.txt");
		String write[] = {"Hello","안녕","hi"};
		file.createNewFile();
		
		if(file.exists()){
			System.out.println("파일 생성 완료");
		}
		else
		{
			System.out.println("기존 파일 존재");
		}
		
		dataSave(file, write);
		dataRead(file);
		
	}
	static void dataRead(File f){
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			int count = 0;
			String tempS="";
			
			while((tempS = br.readLine())!=null) {
				count++;
			}
			br.close();	
			
			String strRead[] = new String[count];
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			int i=0;
			while((tempS=br.readLine())!=null) {
				strRead[i]=tempS;
				i++;
			}
			
			for(int j=0;j<count;j++) {
				System.out.println(strRead[j]);
			}
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	static void dataSave(File f, String datas[]){
		try{
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			if(f.exists()) {
				for(int i=0;i<datas.length;i++) {
					pw.println(datas[i]);
				}
			}
			pw.close();
		}
		catch(IOException e) {
			System.out.println("저장 실패");
		}
		System.out.println("저장 성공");
	}
}