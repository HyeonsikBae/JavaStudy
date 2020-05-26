package work7;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String stuNumStr="";
		int stuNum=0;
		char check;
		boolean bool = true;
		
		re:while(bool) {
			System.out.print("학생 수 입력 : ");
			stuNumStr = scanner.next();
			for(int i=0;i<stuNumStr.length();i++) {
				check = stuNumStr.charAt(i);
				if(check>'9'||check<'0') {
					System.out.println("다시 입력해주세요");
					bool = true;
					continue re;
				}
			}
			stuNum = Integer.parseInt(stuNumStr);
			bool = false;
		}
		
		String student[][] = new String[stuNum][4];
		String subject[] = {"","국어","영어","수학"};
		String temp = "";	 
		
		for(int i=0;i<stuNum;i++) {
			scanner.hasNextLine();
			System.out.print("학생 이름 : ");
			student[i][0] = scanner.next();
			for(int j=1;j<student[i].length;j++){
				System.out.print(student[i][0] + " 학생의 " + subject[j] + " 점수 입력 : ");
				temp = scanner.next();
				for(int k=0;k<temp.length();k++) {
					if(temp.charAt(k)>'9'||temp.charAt(k)<'0') {
						System.out.println("숫자가 아닙니다.");
						j--;
						break;
					}
					else if(Integer.parseInt(temp)>100||Integer.parseInt(temp)<0) {
						System.out.println("범위를 초과하였습니다.");
						j--;
						break;
					}
					else
					{
						student[i][j] = temp;
					}
				}
			}
		}		
		
		System.out.println("평균점수\t" + "국어 : " + avgSubject(student,0,1,stuNum) + 
										"\t영어 : " + avgSubject(student,0,2,stuNum) + 
										"\t수학 : " + avgSubject(student,0,3,stuNum));
		System.out.println("전체평균 : " + (avgSubject(student,0,1,stuNum)+avgSubject(student,0,2,stuNum)+avgSubject(student,0,3,stuNum))/3);
		System.out.println("최고점수\t" + "국어 : " + max(student,0,1,stuNum) + 
										"\t영어 : " + max(student,0,2,stuNum) + 
										"\t수학 : " + max(student,0,3,stuNum));
		System.out.println("최저점수\t" + "국어 : " + min(student,0,1,stuNum) + 
										"\t영어 : " + min(student,0,2,stuNum) + 
										"\t수학 : " + min(student,0,3,stuNum));
		scanner.close();
	}
	public static int max(String array[][],int row, int col, int num) {
		int result = 0;
		for(row=0;row<num;row++) {
			if(result<=Integer.parseInt(array[row][col])) {
				result = Integer.parseInt(array[row][col]);
			}
		}
		return result;
	}
	public static int min(String array[][],int row, int col, int num) {
		int result = 100;
		for(row=0;row<num;row++) {
			if(result>=Integer.parseInt(array[row][col])) {
				result = Integer.parseInt(array[row][col]);
			}
		}
		return result;
	}
	public static int avgSubject(String array[][],int row, int col, int num) {
		int result = 0;
		
		for(row=0;row<num;row++) {
			result += Integer.parseInt(array[row][col]);
		}
		return result/num;
	}
}