package main;

public class main {

	public static void main(String[] args) {
		
		//Child c1 = new Child();
		//c1.method();

		Parent p = new Child();
		//인스턴스		클래스
		
		p.method();//Over ride 당해서 Child꺼 가져옴;;
		//p.func();//Child 꺼 못가져옴.. 
		
		/*
		
			aaa a = new aaa();
			bbb b = new bbb();
			
			->> 요로코롬 묶어서 관리 가능함 ㅎㅎ
				total m = new aaa();
						  new bbb();
		 */
	}
}