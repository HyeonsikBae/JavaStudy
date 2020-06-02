package main;

public class main {

	public static void main(String[] args) {

		/*
			OOP 목적 : 코드 관리
		
			1. 은닉성 (캡슐화)
				외부와의 차단으로 변수를 관리할 수 있다.
				class 내부에서 접근(처리)가 가능하도록 접근 지정자로 제어
				
				private -> member variable
				public -> member method
				protected -> Inheritance
		*/
		MyClass cls = new MyClass();
		
		System.out.println(cls);
		System.out.println(cls.getThis());
		
		cls.func();
		
	}	
}