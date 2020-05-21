public class mainClass {
	public static void main(String[] args) {
		
		int number = 5;
		
		switch(number) { // 변수에 소수점 사용 불가
			case 1:
				System.out.println("number = 1");
				break;
			case 2:
				System.out.println("number = 2");
				break;
			case 3:
				System.out.println("number = 3");
				break;
			default : // 생략가능
				System.out.println("number = 4 이상");
				break;	
		}
	}
}