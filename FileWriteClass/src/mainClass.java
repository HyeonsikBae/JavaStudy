import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args) throws IOException{
		File file = new File("d:\\temp\\test.txt");
		
		//한문자씩 쓰기. 파일이 없으면 생성도 같이 됨. 덧씌우기 된다는 말임;;
		/*
		FileWriter fw = new FileWriter(file);
		fw.write("안뇽?" + "\n");
		fw.close();
		*/
		
		// 추가 쓰기. 현재 파일에 덧붙여 쓰는 것. 이것도 한 문자씩 쓰는거임.
		/*
		FileWriter fw = new FileWriter(file, true); // true자리가 default 는 false 라는 의미.
		fw.write("반갑다\n");
		fw.close();
		*/
		FileWriter fw = new FileWriter(file); // 파일 포인터 설정
		BufferedWriter bw = new BufferedWriter(fw); // 문장으로 쓰기
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("하하하하하하하하하하하"+"\n");
		pw.println("핫핫핫핫핫핫핫핫핫핫");
		pw.println("호호호호호");
		
		pw.close();////중요~~~~~~~~~~~~~!!!!!!!!!!!!!!!! 안하면 파일 내용 제대로 안들어감;;;
	}
}