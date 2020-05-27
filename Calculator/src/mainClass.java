import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = numberInput(1);
		String cal = calInput();
		int num2 = numberInput(2);
		
		System.out.println(calProcess(num1,num2,cal));
		scanner.close();
	}
	
	static int numberInput(int num) {
		Scanner scanner = new Scanner(System.in);
		String numStr="";
		boolean bool = true;
		while(bool) {
			numStr="";
			System.out.print(num + "��° �� �Է� : ");
			numStr = scanner.next();
			for(int i=0;i<numStr.length();i++) {
				if(numStr.charAt(i)>'9'||numStr.charAt(i)<'0') {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					bool = true;
					break;
				}
				else {
					bool = false;
				}
			}
		}
		return Integer.parseInt(numStr);
	}
	
	static String calInput() {
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String input = "";
		
		while(bool) {
			System.out.print("��Ģ���� �Է� : ");
			input = scanner.next();
			if(input.equals("+") ||
				input.equals("-") ||
				input.equals("*") ||
				input.equals("/")) {
				bool=false;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		return input;
	}
	
	static int calProcess(int n1, int n2, String cal) {
		int result = 0;
		switch(cal) {
			case "+":
				result = n1+n2;
				break;
			case "-":
				result = n1-n2;
				break;
			case "*":
				result = n1*n2;
				break;
			case "/":
				result = n1/n2;
				break;
		}
		return result;
	}
}