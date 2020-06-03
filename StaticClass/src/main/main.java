package main;

public class main {
	public static void main(String[] args) {
		/*
			static : 정적
			
			int i : local 변수 = 지역 변수 = auto 변수
					지역을 벗어나면 소멸
					stack에 저장 됨.
		*/			
			{
			int j;
			j=12;
			};// << 지역 끝
			
		MyClass cls = new MyClass();
		// 		stack		heap	
		/*
		int m=cls.getMemNum();
		System.out.println(m); // << 동적할당하면 자동 초기화!!!!
		cls.method();	
		cls.method();
		
		MyClass cls2 = new MyClass();
		cls2.method();
		*/
		
		//MyClass.staticMethod();    // static method 부른거임.
		
		Member mem = new Member();
		mem.init();
		mem.random();
		mem.input();
		//간단하게 아래 한줄로 ~ 
		//
		Member mem2 = Member.getInstance();
	}
}