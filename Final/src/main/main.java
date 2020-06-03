package main;

public class main {
	
	public static void main(String[] args) {
		/*
			final : 제약
				1. 변수에 적용
					ex) final int NUM = 10; >> 변수->상수.
											>> 대입용. 값을 바꾸지 못 함.
											>> 대문자로 쓰도록 하자.
				2. 메소드에 적용
				3. 클래스에 적용
				
				
		
		 */
		
		final int NUM = 10;
			
	}
}
class superClass{
	int number;
	public superClass() {
		
	}
	public void method() {
		
	}
	public final void method(int num) {
		// final 붙음으로 인해 Over Ride 금지!!!
	}
}

class subClass extends superClass{
	public void method() {
		
	}
	/*
	public void method(int a) {
		금지당함 ㅠ
	}
	*/
}
final class sup{
	//final 붙음으로 인해 Inheritance 금지!!!
}
/*
class sub extends sup{
	금지당함 ㅠ
}
*/