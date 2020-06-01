package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass cls = new MyClass();
		
		// = MyClass cls;
		//   cls = new MyClass();
		
		cls.name = "낄낄";
		cls.number = 1;
		cls.age = 25;
		cls.address = "한국";
		
		cls.function();
		cls.method();
		
		MyClass mcls = new MyClass();
		
		mcls.name = "낄낄";
		mcls.number = 1;
		mcls.age = 25;
		mcls.address = "한국";
		
		mcls.function();
		mcls.method();
		
		System.out.println(cls);
		System.out.println(mcls);
		
		/*
		
			순서의 처리
			
			절차지향
			정렬
				1. 입력
				2. 정렬처리
				3. 출력
		
			객체지향
			정렬
				1. 처리들.( 무엇이 들어가는지.. > 입력, 정렬, 교환, 출력 )
				2. 순서 호출
				
				
				
		 */
	}
}
