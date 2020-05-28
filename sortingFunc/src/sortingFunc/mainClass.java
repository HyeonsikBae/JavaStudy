package sortingFunc;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		int array[] = new int[count()];
		input(array);
		sort(array,select());
		output(array);
		
	}
	static int count() {
		String numStr = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ���� �� �Է� : ");
			numStr = scanner.next();
			char c=' ';
			for (int i = 0; i < numStr.length(); i++) {
				c = numStr.charAt(i);
				if(c>'9'||c<'0') {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					c = ' ';
					break;
				}
			}
			if(c!=' ') {
				break;
			}
		}
		return Integer.parseInt(numStr);
	}
	static void input(int array[]) {
		Scanner scanner = new Scanner(System.in);
		String temp = "";
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1 + "��° �� �Է� : ");
			temp = scanner.next();
			for(int j=0;j<temp.length();j++){
				char c = temp.charAt(j);
				if(c>'9'||c<'0') {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					i--;
					temp="";
					break;
				}
			}
			if(temp!="") 
			{array[i] = Integer.parseInt(temp);}
		}
	}
	static int select(){
		Scanner scanner = new Scanner(System.in);
		String selStr = "";
		int selInt = 0;
		
		System.out.print("1.��������\n2.��������\n�Է� : ");
		selStr = scanner.next();
		while(true) {
			if(selStr.length()==1 &&
				selStr.contains("1")||selStr.contains("2")) {
				selInt = Integer.parseInt(selStr);
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		return selInt;
	}
	static void swap(int array[], int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	static void sort(int array[],int select) {
		switch(select) {
			case 1:
				for(int i=0;i<array.length-1;i++) {
					for(int j=i+1;j<array.length;j++) {
						if(array[i]>array[j]) {
							swap(array,i,j);
						}
					}
				}
				break;
			case 2:
				for(int i=0;i<array.length-1;i++) {
					for(int j=i+1;j<array.length;j++) {
						if(array[i]<array[j]) {
							swap(array,i,j);
						}
					}
				}
				break;
		}
	}
	static void output(int array[]) {
			System.out.println(java.util.Arrays.toString(array));
	}
}
