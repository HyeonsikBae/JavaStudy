
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * String : wrapper class
		 * ���ڿ� ����, ����, ���� ���
		 */
		
		String str;
		//String : Class��
		//str : Object(��ü), instance(��ü)==class�� ����
		
		str = "����";
		
		String stra = new String("����");
		//new�� ������ ��ü�� �� ���� ���� ��.
		
		String strb = "����";
		//""�� ������ ��ü�� �� �� ��Ʈ�� Ǯ�� ���� ��.
		//""�� ������ ���� ��ü�� ������ ������ �� �� ���� �޸� ������.
		
		String str1 = "����";
		String str2 = "�ݰ�";
		
		//���ڿ� ����
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.println(str3 + "\n" + str4);
		
		//��
		//str5 �� str6 �� ���� �� (��Ʈ�� Ǯ).
		//str7�� �ٸ� ��.
		String str5 = "hello";
		String str6 = "hello";
		String str7 = new String("hello");
		//==�� ���Ϸ��� ���� �޸𸮿��� �ϰ�,
		//equls�� ���Ϸ��� ������ ������ �ȴ�.
		if(str5.equals(str6)) {
			System.out.println("�񱳼���1");
		}
		if(str5==str6) {
			System.out.println("�񱳼���2");
		}
		if(str5.equals(str7)) {
			System.out.println("�񱳼���3");
		}
		if(str5==str7) {
			System.out.println("�񱳼���4");
		}
		
		//indexOf : ù ���� ������ ��ġ
		//lastIndexOf : ������ ���� ������ ��ġ
		
		char charArr[] = {'A','B','C'};
		String str8 = "ABCDEFGABCD";
		int n1 = str8.indexOf("D");
		System.out.println(n1);
		int n2 = str8.lastIndexOf("D");
		System.out.println(n2);
		
		//int�� array length Ȯ��.
		int Array[] = {1,2,3};
		System.out.println(Array.length);
		//String length Ȯ��. �� �� length�� �Լ��̱� ������ ()�� ����.
		System.out.println(str8.length());
		
		//replace
		//("a", "b") ��� a�� b�� ��ü�Ѵ�.
		String str9 = "A0B00C";
		String replaceStr9 = str9.replace("0", "Z");
		System.out.println(replaceStr9);
		
		String poo = "Ǫ Ǫ Ǫ��Ǫ ǪǪ Ǫ�� ǪǪǪ ���� ����Ǫ ������ Ǫ��ȫ";
		String re1Poo = poo.replace(" ", "");
		System.out.println(re1Poo);
		
		/*
		 
		//split
		token�� Ȱ���� ���ڿ��� �ڸ���.
		aaa-bbb-ccc ���� -�� ��ū�̴�. - ���� �ٸ� �͵鵵 ����ϳ�, �� �Ǵ� �͵鵵 �ִ�.
		
		�����ü : ����, database(Oracle)
		
		ȫ�浿
		24
		2001/10/12
		180
		
		���ٴ�
		
		ȫ�浿-24-2001/10/12-180 �� ��ū�� �̿��� �ʿ��� �����͸� �߶���� ����.
		
		("-") -�� �������� split �Ѵ�.
		*/
		
		String str10 = "ȫ�浿-24-2001/10/12-180";
		String splitArr[] = str10.split("-");
		for(int i=0;i<splitArr.length;i++) {
			System.out.println(splitArr[i]);
		}
		
		//substring
		//������ ���� ���ڿ� ���
		//(a, b) a���� b �������� �ε����� �ҷ��´�.
		//(a) ��� �ϸ� a���� ������ �ҷ��´�.
		String str11 = "asdfwqafasd";
		String subStrFir = str11.substring(0,4);
		System.out.println(subStrFir);
		String subStrSec = str11.substring(4);
		System.out.println(subStrSec);
		
		//toUpperCase : ��� ���ڸ� �빮�ڷ�
		//toLowerCase : ��� ���ڸ� �ҹ��ڷ�
		
		String str12 = "asdfasdfhj";
		String strUpper = str12.toUpperCase();
		String strLower = strUpper.toLowerCase();
		System.out.println(strUpper);
		System.out.println(strLower);
		
		//trim : �յ� ������ �����ִ� �Լ�
		
		String str13 = "           ����������         ";
		String strTrim = str13.trim();
		System.out.println(strTrim);
		
		//valueOf
		//���ڿ� -> ���ڷ�
		//���� -> ���ڿ���
		
		int num1 = 123123;
		long num2 = 456456L;
		double num3 = 789789.789;
	
		String num1Str = String.valueOf(num1);
		String num2Str = String.valueOf(num2);
		String num3Str = String.valueOf(num3);
		
		//int num = 1;
		//String str = num + "";  << �̰� �� ����; 
		
		
		System.out.println(num1Str + num2Str + num3Str);
		System.out.println(num1 + num2 + num3);
		
		// contains : Ž��
		String str14 = "����� ������";
		boolean bool = str14.contains("����");
		System.out.println(bool);
		
		//charAt : �迭ó�� �ش� �ε����� ���� �޴°�
		//String str = "hello";   ==  char Array[] = {'h','e','l','l','o'};

		String str15 = "�����ٶ󸶹ٻ��";
		char ch = str15.charAt(3);
		System.out.println(ch);
		
	}
}
