package main;

public class MyClass {
	
	//class member variable
	//대부분 private으로 씀. 
	private int number;
	String name;
	
	//class member method
	//대부분 public으로 씀.
	/*  

		setter getter
		setter 지워버리면 외부에서 접근불가. read only가 됨.
	*/
	
	
	public MyClass getThis() {
		return this;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum () {
		return number;
	}
	
	public void func() {
		this.method();
	}
	
	public void method() {
		System.out.println("d");
	}
}