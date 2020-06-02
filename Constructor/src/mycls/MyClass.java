package mycls;

import java.lang.reflect.Constructor;

public class MyClass {
	
	/*
		constructor : 생성자 == method
					class 명과 같은 method
					return 값 없다.
					over load 가능
					자동호출된다.
					별도 호출 불가능
					
		destructor : 소멸자 X

	 */
	
	private int number;
	private String name;
	
	public MyClass() {
		System.out.println(this.number);
		System.out.println(this.name);
	}
	
	public MyClass(int number) {
		this.number = number;
		System.out.println(this.number);
		System.out.println(this.name);
	}
	public MyClass(int number, String name) {
		this(34);// 다른 생성자 호출 시엔 메소드 내 맨 첫줄에서 호출
		this.number = number;
		this.name = name;
		System.out.println(this.number);
		System.out.println(this.name);
	}
	
}
