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
			System.out.print("�л� �� �Է� : ");
			stuNumStr = scanner.next();
			for(int i=0;i<stuNumStr.length();i++) {
				check = stuNumStr.charAt(i);
				if(check>'9'||check<'0') {
					System.out.println("�ٽ� �Է����ּ���");
					bool = true;
					continue re;
				}
			}
			stuNum = Integer.parseInt(stuNumStr);
			bool = false;
		}
		
		String student[][] = new String[stuNum][4];
		String subject[] = {"","����","����","����"};
		String temp = "";	 
		
		for(int i=0;i<stuNum;i++) {
			scanner.hasNextLine();
			System.out.print("�л� �̸� : ");
			student[i][0] = scanner.next();
			for(int j=1;j<student[i].length;j++){
				System.out.print(student[i][0] + " �л��� " + subject[j] + " ���� �Է� : ");
				temp = scanner.next();
				for(int k=0;k<temp.length();k++) {
					if(temp.charAt(k)>'9'||temp.charAt(k)<'0') {
						System.out.println("���ڰ� �ƴմϴ�.");
						j--;
						break;
					}
					else if(Integer.parseInt(temp)>100||Integer.parseInt(temp)<0) {
						System.out.println("������ �ʰ��Ͽ����ϴ�.");
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
		
		System.out.println("�������\t" + "���� : " + avgSubject(student,0,1,stuNum) + 
										"\t���� : " + avgSubject(student,0,2,stuNum) + 
										"\t���� : " + avgSubject(student,0,3,stuNum));
		System.out.println("��ü��� : " + (avgSubject(student,0,1,stuNum)+avgSubject(student,0,2,stuNum)+avgSubject(student,0,3,stuNum))/3);
		System.out.println("�ְ�����\t" + "���� : " + max(student,0,1,stuNum) + 
										"\t���� : " + max(student,0,2,stuNum) + 
										"\t���� : " + max(student,0,3,stuNum));
		System.out.println("��������\t" + "���� : " + min(student,0,1,stuNum) + 
										"\t���� : " + min(student,0,2,stuNum) + 
										"\t���� : " + min(student,0,3,stuNum));
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