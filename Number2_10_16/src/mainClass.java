import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		���� �Է� > �޴� ��ȣ
		
		1. 10������ 2������
		2. 2������ 10������
		3. 10������ 16������
		4. 16������ 10������
		5. 2������ 16������
		6. 16������ 2������
		7. ����
		
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
					System.out.println("10���� " + inputStr + "�� 2���� " + outputStr);
					break;
				case 2:
					output = Integer.valueOf(inputStr, 2);
					System.out.println("2���� " + inputStr + "�� 10���� " + output);
					break;
				case 3:
					input = Integer.parseInt(inputStr);
					outputStr = Integer.toHexString(input);
					System.out.println("10���� " + inputStr + "�� 16���� " + outputStr);
					break;
				case 4:
					output = Integer.valueOf(inputStr, 16);
					System.out.println("16���� " + inputStr + "�� 10���� " + output);
					break;
				case 5:
					input = Integer.valueOf(inputStr, 2);
					outputStr = Integer.toHexString(input);
					System.out.println("2���� " + input + "�� 16���� " + outputStr);
					break;
				case 6:
					input = Integer.valueOf(inputStr, 16);
					outputStr = Integer.toBinaryString(input);
					System.out.println("16���� " + input + "�� 2���� " + outputStr);
					break;
				case 7:
					bool = false;
					break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		scanner.close();
	}
}
