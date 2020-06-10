package main;

import java.io.File;
import java.io.IOException;

public class FileCreateClass {
	
	private File file;
	public static String team;
	
	public void createFile(String team){
		try {
		this.team = team;
		file = new File("d:\\temp\\"+this.team+".txt");
		file.createNewFile();
		System.out.println("파일 생성 완료");
		}catch(IOException e) {
			System.out.println("파일 존재");
		}
	}
}
