package main;

public class HeClass implements MyInterface, YouInterface {

	@Override
	public void func() {
		System.out.println("Heclass func()");
		
	}

	@Override
	public void method() {
		System.out.println("Heclass method()");
		
	}
	
	public void heMethod() {
		System.out.println("HeMethod()");
	}
	
}
