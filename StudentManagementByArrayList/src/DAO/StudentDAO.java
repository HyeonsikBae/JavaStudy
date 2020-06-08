package DAO;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.*;

public class StudentDAO {
	
	Scanner scanner = new Scanner(System.in);
	Student student = new Student();
	ArrayList<Student> studentList = new ArrayList<Student>();
	String example[] = {"이름","나이","국어점수","영어점수","수학점수"};
	
	public StudentDAO(){
		
	}
	
	public void insert() {
		System.out.println(example[0]+"을 입력해주세요.\n>>>");
		String name = scanner.next();
		System.out.println(example[1]+"를 입력해주세요.\n>>>");
		int age = scanner.nextInt();
		System.out.println(example[2]+"를 입력해주세요.\n>>>");
		int scoreKor = scanner.nextInt();
		System.out.println(example[3]+"를 입력해주세요.\n>>>");
		int scoreEng = scanner.nextInt();
		System.out.println(example[4]+"를 입력해주세요.\n>>>");
		int scoreMath = scanner.nextInt();
		student = new Student(name, age, scoreKor, scoreEng, scoreMath);
		studentList.add(student);
	}
	public void delete() {
		System.out.println("삭제할 학생의 이름을 입력해주세요\n>>>");
		String name = scanner.next();
		int index = search(name);
		if(index == -1) System.out.println(name+"학생은 없습니다.");
		else {
			studentList.remove(index);
		}
	}
	public void select() {
		System.out.println("선택할 학생의 이름을 입력해주세요\n>>>");
		String name = scanner.next();
		int index = search(name);
		if(index == -1) System.out.println(name+"학생은 없습니다.");
		else System.out.println(studentList.get(index));
	}
	public void update() {
		System.out.println("수정할 학생의 이름을 입력해주세요\n>>>");
		String name = scanner.next();
		int index = search(name);
		if(index == -1) System.out.println(name+"학생은 없습니다.");
		else {
			System.out.println(example[2]+"를 입력해주세요.\n>>>");
			int scoreKor = scanner.nextInt();
			System.out.println(example[3]+"를 입력해주세요.\n>>>");
			int scoreEng = scanner.nextInt();
			System.out.println(example[4]+"를 입력해주세요.\n>>>");
			int scoreMath = scanner.nextInt();
			Student temp = studentList.get(index);
			temp.setScoreKor(scoreKor);
			temp.setScoreEng(scoreEng);
			temp.setScoreMath(scoreMath);
			studentList.set(index, temp);
		}
	}
	
	public int search(String name) {
		
		int findIndex = -1;
		for(int i=0;i<studentList.size();i++) {
			Student temp = studentList.get(i);
			if(temp.getName().equals(name)) {
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}
	public void allPrint() {
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
	}
	
	public void avgSub() {
		
	}
	public void avgTotal() {
		
	}
	public void lineAvgTotal() {
		
	}
}
