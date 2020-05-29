import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args)throws Exception {
		
		//file read
		File file = new File("d:\\temp\\test.txt");
		//try {
			FileReader fileRead = new FileReader(file);
			
			// 1. 한 문자씩 읽어들이기
			/*
			int c = fileRead.read();
			while(c != -1) {//-1은 파일의 끝은 뜻함
				System.out.println((char)c);
				c=fileRead.read();
			}
			*/
			
			// 2. 문자열로 받아들이기
			/*
			String str = "";
			int c = fileRead.read();
			while(c != -1) {//-1은 파일의 끝은 뜻함
				//System.out.print((char)c);
				str = str+(char)c;
				c=fileRead.read();
			}
			System.out.println(str);
			*/
			
			// 3. 문장으로 받아들이기
			
			BufferedReader br = new BufferedReader(fileRead);
			String str = br.readLine();
			while(str != null) {
				System.out.println(str);
				str = br.readLine();
			}
			br.close();
			
			
			
		/*
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/ //main에서 Exception 을 throws 하면 try catch를 생략해도 된다.
		//}
	}
}