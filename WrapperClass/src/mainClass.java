
public class mainClass {

	public static void main(String[] args) {
		/*
		Wrapper Class
		
		�Ϲ� �ڷ���(int, class) ���� Ŭ����ȭ �� ��.
		Collection : list, map
		//
		�Ϲ��ڷ���				class
		---------------------------
		boolean				Boolean
		
		byte				Byte
		short				Short
		int					Integer ��
		long				Long
		
		float				Float
		double				Double ��
		
		char				Character
		char[]				String �١١١١�
		
		
		//���� -> ���ڿ�
		valueOf
		//����+""; �ε� ��� ����
		
		���ڿ� -> ����
		String intStr = "234";
		int intNum = Integer.parseIng(intStr);		
		
		String doubleStr = "123.456"
		double doubleNum = Double,.parseDouble(doubleStr);
		
		//Double dou = 123.456; == Double dou = new Double("123.456"); // Class����
		
		//toString(); -> ���ڿ��� ����~~
		
		//10���� -> 2����
		int n10 =12;
		String n2 = Integer.toBinaryString(n10);
		
		
		//2���� -> 10����
		String n2 = "1100";
		int n10 = Integer.parseInt(n2,2); // (a,b) : a�� ����, b�� ���� �� ��������
		 */
		int num = 1039;
		
		String oct = Integer.toOctalString(num);
		num = Integer.parseInt(oct,8);
		System.out.println("oct : " + oct + "\t" + "int : " + num);
		String hex = Integer.toHexString(num);
		num = Integer.parseInt(hex,16);
		System.out.println("hex : " + hex + "\t" + "int : " + num);
	}
}
