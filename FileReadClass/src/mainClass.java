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
			
			// 1. �� ���ھ� �о���̱�
			/*
			int c = fileRead.read();
			while(c != -1) {//-1�� ������ ���� ����
				System.out.println((char)c);
				c=fileRead.read();
			}
			*/
			
			// 2. ���ڿ��� �޾Ƶ��̱�
			/*
			String str = "";
			int c = fileRead.read();
			while(c != -1) {//-1�� ������ ���� ����
				//System.out.print((char)c);
				str = str+(char)c;
				c=fileRead.read();
			}
			System.out.println(str);
			*/
			
			// 3. �������� �޾Ƶ��̱�
			
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
		*/ //main���� Exception �� throws �ϸ� try catch�� �����ص� �ȴ�.
		//}
	}
}