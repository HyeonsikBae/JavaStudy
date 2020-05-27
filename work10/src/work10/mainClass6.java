package work10;

import java.util.Scanner;

public class mainClass6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String random = scanner.next();
		String str1 = change1(random);
		System.out.println(str1);
		String str2 = change2(str1);
		System.out.println(str2);
		scanner.close();
	}
	static String change1(String str) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String changeStr="";
		int length = str.length();
		
		for(int i=0;i<length;i++) {
			int asc = (int)str.charAt(i);
			if(asc>=97&&asc<=122) {
				changeStr += abcCode[asc-97];
			}
			else if(asc>=48&&asc<=57) {
				changeStr += numCode[asc-48];
			}
			else {
				changeStr += (char)asc;
			}
		}
		return changeStr;
	}
	static String change2(String str) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String changeStr="";
		int length = str.length();
		boolean bool = false;
		
		for(int i=0;i<length;i++) {
			char c = str.charAt(i);
			for(int j=0;j<abcCode.length;j++) {
				if(c==abcCode[j]) {
					changeStr += (char)(97+j);
					break;
				}
			}
			for(int j=0;j<numCode.length;j++) {
				if(c==numCode[j]) {
					changeStr += (char)(48+j);
					break;
				}
			}
		}
		return changeStr;
	}
}
