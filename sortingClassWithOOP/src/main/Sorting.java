package main;

import java.util.Scanner;

public class Sorting {
	//멤버 변수 (두 가지 이상 메소드에서 접근해야 하는 경우 멤버 변수로 설정)
	int number[]; // 정렬할 수
	boolean updown; // 오름차순, 내림차순 선택
	
	//처리(메소드)
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬할 개수 입력 : ");
		int count = sc.nextInt();
		
		number = new int[count];
		for(int i=0;i<count;i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("1 : 오름차순\n2 : 내림차순\n입력 : ");
		int ud = sc.nextInt();
		switch(ud) {
			case 1:
				updown = true;
				break;
			case 2:
				updown = false;
				break;
		}
		
		sc.close();
	}
	public void sorting() {
		for(int i=0;i<number.length-1;i++) {
			for(int j=i;j<number.length;j++) {
				if(updown) {
					if(number[i]>number[j]) {
						swap(i,j);
					}
				}
				else {
					if(number[i]<number[j]) {
						swap(i,j);
					}
				}
			}
		}
	}
	public void swap(int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	public void result() {
		for(int i=0;i<number.length;i++) {
			System.out.println(i+1+"번째 수 : " + number[i]);
		}
		//System.out.println(java.util.Arrays.toString(number));
	}
}