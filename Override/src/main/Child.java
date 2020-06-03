package main;

public class Child extends Parent {

	
	
	public Child() {
		//super();
		super(123);
	}
	
	
	//Over Ride 1 실시한 method
	//상속받은 메소드와 완벽히 같은 이름, 매개변수
	public void method() {
		System.out.println("Child Method()");
		super.method();
	}
	
	public void func() {
		System.out.println("Child Func()");
	}
	
}
