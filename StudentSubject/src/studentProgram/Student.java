package studentProgram;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String student[][] = new String[20][5];
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j]="";
			}
		}
		
		boolean replay = true;
		while(replay) {
			System.out.println("0. 종료");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 출력");
			System.out.println("6. 과목 평균 출력");
			System.out.println("7. 전체 평균 출력");
			System.out.println("8. 성적 등수 출력");
			switch(menuSelect()) {
				case 0:
					replay = false;
					System.out.println("종료되었습니다.");
					break;
				case 1:
					insert(student);
					break;
				case 2:
					delete(student);
					break;
				case 3:
					find(student);
					break;
				case 4:
					edit(student);
					break;
				case 5:
					output(student);
					break;
				case 6:
					avgSubject(student);
					break;
				case 7:
					avgTotal(student);
					break;
				case 8:
					sortAvg(student);
					break;	
			}
		}
	}
	
	static int menuSelect() {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		System.out.println("메뉴 입력 : ");
		menu = scanner.nextInt();
		return menu;
	}
	static void insert(String student[][]) {
		String field[] = {"이름", "나이", "국어점수", "영어점수", "수학점수"};
		Scanner scanner = new Scanner(System.in);
		int findIndex = -1;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals("")) {
				findIndex = i;
				break;
			}
		}
		System.out.println(findIndex+1 + "번지에 입력");
		for(int i=0;i<5;i++) {
			System.out.print(field[i] + " 입력 : ");
			student[findIndex][i] = scanner.next();
		}
		System.out.println(java.util.Arrays.toString(student[findIndex]));
	}
	static void delete(String student[][]) {
		System.out.print("삭제할 학생의 이름 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int findIndex = -1;
		String name = scanner.next();
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals(name)) {
				findIndex = i;
				break;
			}
		}
		if(findIndex==-1) {
			System.out.println(name + "학생은 없습니다.");
		}
		else if(findIndex<19) {
			for (int i = findIndex; i < student.length-1; i++) {
				for (int j = 0; j < student[i].length; j++) {	
					student[i][j] = student[i+1][j];
					student[i+1][j] = "";
				}
			}
		}
		else {
			for(int i=0;i<5;i++) {
				student[19][i]="";
			}
		}
	}
	static void find(String student[][]) {
		System.out.print("검색할 학생의 이름 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int findIndex = -1;
		String name = scanner.next();
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals(name)) {
				findIndex = i;
				break;
			}
		}
		if(findIndex==-1) {
			System.out.println(name + "학생은 없습니다.");
		}
		else {
			System.out.println(java.util.Arrays.toString(student[findIndex]));
		}
	}
	static void edit(String student[][]) {
		Scanner scanner = new Scanner(System.in);
		String field[] = {"이름", "나이", "국어점수", "영어점수", "수학점수"};
		System.out.print("수정할 학생의 이름 입력 : ");
		String name = scanner.next();
		int findIndex = -1;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals(name)) {
				findIndex = i;
				break;
			}
		}
		if(findIndex==-1) {
			System.out.println(name + "학생은 없습니다.");
		}
		else {
			for(int i=0;i<5;i++) {
				System.out.print(field[i] + " 입력 : ");
				student[findIndex][i] = scanner.next();
			}
			System.out.println(java.util.Arrays.toString(student[findIndex]));
		}
	}
	static void output(String student[][]) {
		int findIndex = -1;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals("")) {
				findIndex = i;
				break;
			}
		}
		for(int i=0;i<findIndex;i++) {
			System.out.println(java.util.Arrays.toString(student[i]));
		}
	}
	static void avgSubject(String student[][]) {
		String field[] = {"국어점수", "영어점수", "수학점수"};
		int findIndex = 0;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals("")) {
				findIndex = i;
				break;
			}
		}
		int avg[] = new int[3];
		for(int i=2;i<5;i++) {
			int sum = 0;
			for(int j=0;j<findIndex;j++) {
				sum += Integer.parseInt(student[j][i]);
			}
			avg[i-2] = sum/findIndex;
		}
		for(int i=0;i<3;i++) {
			System.out.println(field[i] + "의 평균 : " + avg[i]);
		}
	}
	static void avgTotal(String student[][]) {
		int findIndex = 0;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals("")) {
				findIndex = i;
				break;
			}
		}
		int avg[] = new int[3];
		for(int i=2;i<5;i++) {
			int sum = 0;
			for(int j=0;j<findIndex;j++) {
				sum += Integer.parseInt(student[j][i]);
			}
			avg[i-2] = sum/findIndex;
		}
		double avgTotal = ((double)avg[0]+avg[1]+avg[2])/3;
		System.out.println("전체평균 : "+ avgTotal);
	}
	static void sortAvg(String student[][]) {
		int findIndex = 0;
		for(int i=0;i<student.length;i++) {
			if(student[i][0].equals("")) {
				findIndex = i;
				break;
			}
		}
		String sortName[] = new String[findIndex];
		for(int i=0;i<findIndex;i++) {
			sortName[i] = student[i][0];
		}
		int sort[] = new int[findIndex];
		for(int i=0;i<findIndex;i++) {
			int sum = 0;
			for(int j=2;j<5;j++) {
				sum += Integer.parseInt(student[i][j]);
			}
			sort[i] = sum/3;
		}
		
		sorting(sort,sortName);
		
		for(int i=0;i<findIndex;i++) {
			System.out.println(i+1 + "등 : " + sortName[i] +" "+ sort[i]+"점");
		}
	}
	static void swapInt(int array[], int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	static void swapStr(String array[], int a, int b) {
		String temp = "";
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	static void sorting(int arrScore[],String arrName[]) {
		
		for(int i=0;i<arrScore.length-1;i++) {
			for(int j=i+1;j<arrScore.length;j++) {
				if(arrScore[i]<arrScore[j]) {
					swapInt(arrScore,i,j);
					swapStr(arrName,i,j);
				}
			}
		}
	}
}
