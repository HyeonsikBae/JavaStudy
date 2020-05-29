package studentProgram;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import studentProgram.*;
public class main {
	
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		AboutFile studentFile = new AboutFile();
		studentFile.createFile();
		
		File file = new File("d:\\temp\\tt.txt");
		file.createNewFile();
		String juhong[] = {"주홍","27","88","95","89","주홍d","27","88","95","89","주홍a","27","88","95","89","주홍","27","88","95","89"};
		studentFile.dataSave(juhong);
		
		studentFile.dataRead(3);
		System.out.println();
		studentFile.dataReadAll();
		scanner.close();
	}
}