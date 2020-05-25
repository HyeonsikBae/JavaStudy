
public class mainClass {

	public static void main(String[] args) {
		/*
		Wrapper Class
		
		일반 자료형(int, class) 등을 클래스화 한 것.
		Collection : list, map
		//
		일반자료형				class
		---------------------------
		boolean				Boolean
		
		byte				Byte
		short				Short
		int					Integer ☆
		long				Long
		
		float				Float
		double				Double ☆
		
		char				Character
		char[]				String ☆☆☆☆☆
		
		
		//숫자 -> 문자열
		valueOf
		//숫자+""; 로도 사용 가능
		
		문자열 -> 숫자
		String intStr = "234";
		int intNum = Integer.parseIng(intStr);		
		
		String doubleStr = "123.456"
		double doubleNum = Double,.parseDouble(doubleStr);
		
		//Double dou = 123.456; == Double dou = new Double("123.456"); // Class생성
		
		//toString(); -> 문자열로 변경~~
		
		//10진수 -> 2진수
		int n10 =12;
		String n2 = Integer.toBinaryString(n10);
		
		
		//2진수 -> 10진수
		String n2 = "1100";
		int n10 = Integer.parseInt(n2,2); // (a,b) : a는 변수, b는 현재 몇 진수인지
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
