public class mainClass {

	public static void main(String[] args) {
		
		int number = 6;
		if(number>5) {
			System.out.println("number �� 5���� ũ��");
		}
		if(number >= 6) {
			System.out.println("number �� 6���� ũ�ų� ����");
		}
		if(number == 6) {
			System.out.println("number �� 6�� ����");
		}
		if(number != 5) {
			System.out.println("number �� 5�� �ƴϴ�");
		}
		if(number >= 0 && number < 10) {
			System.out.println("number �� 0�� 9������ ����");
		}
		if(number < 5 || number > 10) {
			System.out.println("number �� 5�̸��̰ų� 10 �ʰ��� ����");
		}
		if(number > 10) {
			System.out.println("number �� 10 �ʰ��� ����");
		}
		else {
			System.out.println("number�� 10 ������ ����");		
		}
		
		if(number > 10) System.out.println("number �� 10 �ʰ��� ����");
		else System.out.println("number�� 10 ������ ����");		
		
		String str;
		str = (number>10)?"10�ʰ�":"10����";
		System.out.println(str);
		System.out.println((number>10)?"10�ʰ�":"10����");
		
		int point = 85;
		
		if(point==100)			System.out.println("100���Դϴ�");
		else if(point >= 90)	System.out.println("90�� �̻��Դϴ�");			
		else if(point >= 80)	System.out.println("80�� �̻��Դϴ�");			
		else					System.out.println("80�� �̸��Դϴ�");
		
		boolean b;
		b = false;
		if(b==false) {
			System.out.println("b==false");
		}
		if(b) {
			System.out.println("b==true");
		}
		if(!b) {
			System.out.println("b==true");
		}
	}
}