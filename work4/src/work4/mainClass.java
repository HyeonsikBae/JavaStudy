package work4;

import java.util.Scanner;

public class mainClass {
	
	//Problem1_fibonacci // �߰�����
	/*
	public static int fibo (int num) {
		int intArr[] = new int[3];
		for(int i=0;i<num;i++) {
			
		}
	}
	public static void main(String[] args){
	
	}
	*/
	
	/*
	//Problem1_for
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=1000;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	*/
	
	/*
	//Problem 2
	public static void main(String[] agrs) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input : ");
		int num = scanner.nextInt();
		
		for(int i=0;i<100;i++) {
			if(num>=(i*10)&&num<((i+1)*10)) {
				System.out.println("num�� " + (i*10) + "�̻� " + ((i+1)*10) + "�̸��̴�");
				break;
			}
		}
		
		scanner.close();
	}
	*/
	
	/*
	//Problem3
	public static void main(String[] args) {
		int evensum = 0;
		int oddsum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				oddsum += i;
			}
			else {
				evensum += i;
			}
		}
		
		System.out.print("evensum : " + evensum + "\n" + "oddsum : " + oddsum);
	}
	*/
	
	/*
	//Problem 4
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		System.out.print("������� �ܼ� : ");
		int num = scanner.nextInt();
		for(int i = 0;i<9;i++) {
			System.out.println(num + " X " + (i+1) + " = " + (num*(i+1)));
		}
	}
	*/
	
	/*
	//Problem5
	public static void main(String[] args) {
		
		String str="*";
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	*/
	
	/*
	//Problem6
	public static void main(String[] args) {
		
		String str = "*";
		
		for(int i=0;i<9;i++) {
			if(i<=5) {
				for(int j=0;j<i;j++) {
					
					System.out.print(str);
				}
			}
			else {
				for(int j=9;j>i;j--) {
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
	*/
	
	/*
	//Problem7
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		int result = 0;
		String cal="";

		System.out.print("ù��° �� : ");
		num1 = scanner.nextInt();
		
		while(!cal.equals("+")&&!cal.equals("-")&&!cal.equals("*")&&!cal.equals("/")) {
			System.out.print("������ : ");
			cal = scanner.next();
		}
		
		System.out.print("�ι�° �� : ");
		num2 = scanner.nextInt();
		
		switch(cal) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		case "/" :
			result = num1 / num2;
			break;
		default :	
		}		
		
		System.out.println("��� : " + result);
		scanner.close();
	}
	*/
	
	//Problem8
	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���� ���� : ");
		int count = scanner.nextInt();
		
		int array[] = new int[count];
		
		int sum = 0;
		
		for(int i=0;i<count;i++) {
			System.out.print((i+1) + "��° ���� �Է� : ");
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		
		System.out.println("�հ�" + sum);
		System.out.println("���" + ((double)sum/count));
		
		scanner.close();
	}
	*/
}
