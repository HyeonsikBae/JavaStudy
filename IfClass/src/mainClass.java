public class mainClass {

	public static void main(String[] args) {
		
		int number = 6;
		if(number>5) {
			System.out.println("number 는 5보다 크다");
		}
		if(number >= 6) {
			System.out.println("number 는 6보다 크거나 같다");
		}
		if(number == 6) {
			System.out.println("number 는 6과 같다");
		}
		if(number != 5) {
			System.out.println("number 는 5가 아니다");
		}
		if(number >= 0 && number < 10) {
			System.out.println("number 는 0과 9사이의 수다");
		}
		if(number < 5 || number > 10) {
			System.out.println("number 는 5미만이거나 10 초과의 수다");
		}
		if(number > 10) {
			System.out.println("number 는 10 초과의 수다");
		}
		else {
			System.out.println("number는 10 이하의 수다");		
		}
		
		if(number > 10) System.out.println("number 는 10 초과의 수다");
		else System.out.println("number는 10 이하의 수다");		
		
		String str;
		str = (number>10)?"10초과":"10이하";
		System.out.println(str);
		System.out.println((number>10)?"10초과":"10이하");
		
		int point = 85;
		
		if(point==100)			System.out.println("100점입니다");
		else if(point >= 90)	System.out.println("90점 이상입니다");			
		else if(point >= 80)	System.out.println("80점 이상입니다");			
		else					System.out.println("80점 미만입니다");
		
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