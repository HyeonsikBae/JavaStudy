import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		숫자 입력 > 메뉴 번호
		
		1. 10진수를 2진수로
		2. 2진수를 10진수로
		3. 10진수를 16진수로
		4. 16진수를 10진수로
		5. 2진수를 16진수로
		6. 16진수를 2진수로
		7. 종료
		
		 */
		
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		
		while(bool){
			System.out.print("Input : ");
			String inputStr = scanner.next();
			String outputStr = "";
			int input = 0;
			int output = 0;
			
			System.out.println("1. 10 -> 2" + "\n" + 
								"2. 2 -> 10" + "\n" + 
								"3. 10 -> 16" + "\n" + 
								"4. 16 -> 10" + "\n" + 
								"5. 2 -> 16" + "\n" + 
								"6. 16 -> 2" + "\n" + 
								"7. Exit");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					input = Integer.parseInt(inputStr);
					outputStr = Integer.toBinaryString(input);
					System.out.println("10진수 " + inputStr + "은 2진수 " + outputStr);
					break;
				case 2:
					output = Integer.valueOf(inputStr, 2);
					System.out.println("2진수 " + inputStr + "은 10진수 " + output);
					break;
				case 3:
					input = Integer.parseInt(inputStr);
					outputStr = Integer.toHexString(input);
					System.out.println("10진수 " + inputStr + "은 16진수 " + outputStr);
					break;
				case 4:
					output = Integer.valueOf(inputStr, 16);
					System.out.println("16진수 " + inputStr + "은 10진수 " + output);
					break;
				case 5:
					input = Integer.valueOf(inputStr, 2);
					outputStr = Integer.toHexString(input);
					System.out.println("2진수 " + input + "은 16진수 " + outputStr);
					break;
				case 6:
					input = Integer.valueOf(inputStr, 16);
					outputStr = Integer.toBinaryString(input);
					System.out.println("16진수 " + input + "은 2진수 " + outputStr);
					break;
				case 7:
					bool = false;
					break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		scanner.close();
	}
}
