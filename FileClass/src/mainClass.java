import java.io.File;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		/*

		Code -> logic(구현)
				기능적 : file, database
		
		저장매체 : 파일, DB
				이름		나이		주소
				홍길동	24		서울		->	저장 : write / 읽기 : read
		
		목적 : data의 저장, 불러오기
		
		모든 파일은 txt로부터 기원.
		.dll(Dynamic Link Library) - 동적 (Dynamic) : 파일 실행 시, 필요한 메모리를 그때그때 할당 후 공유
		.lib					   - 정적 (Static) : 파일 실행 시, lib를 위한 메모리 확보
			-> java 형식으로 만든 게 .jar
		 */
		
		
		//파일 목록
		/*
		File fdir = new File("c:\\");
		
		String fileList[] = fdir.list();
		
		for(int i=0;i<fileList.length;i++) {
			System.out.println(fileList[i]);
		}
		
		System.out.println(java.util.Arrays.toString(fileList));
		*/
		
		//파일, 디렉토리, 그 외 요소 
		/*
		File fdir = new File("d:\\");
		File fileList[] = fdir.listFiles();
		
		for(int i=0;i<fileList.length;i++) {
			if(fileList[i].isFile())
				System.out.println("[파일]" + fileList[i].getName());
			else if(fileList[i].isDirectory()) {
				System.out.println("[폴더]" + fileList[i].getName());
			}
			else {
				System.out.println("[etc]" + fileList[i].getName());
			}
		}
		*/
		
		//파일 생성
		String fileStr = "d:\\temp\\newfile.txt";
		File newFile = new File(fileStr);
		try {
			if(newFile.createNewFile()) { // 파일이 실제 생성되는 부분
				System.out.println("파일 생성 완료");
			}
			else {
				System.out.println("파일 생성 실패");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//파일 존재여부 확인
		if(newFile.exists()) {
			System.out.println("파일 존재합니다.");
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		//파일 삭제
		/*
		if(newFile.delete()) {
			System.out.println("파일 삭제 완료");
		}
		else {
			System.out.println("파일 삭제 불가");
		}
		*/
		
		//읽기 가능 여부 
		if(newFile.canRead()) {
			System.out.println("읽기 가능");
		}
		else {
			System.out.println("읽기 불가");
		}
		
		//쓰기 가능 여부
		if(newFile.canWrite()) {
			System.out.println("쓰기 가능");
		}
		else {
			System.out.println("쓰기 불가");
		}
		
	}
}