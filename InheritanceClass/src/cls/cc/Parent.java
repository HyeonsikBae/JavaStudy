package cls.cc;

public class Parent {
	
	private int number; // private은 자식놈도 접근 못함 ㅎ
	protected String name; // 자식 클래스 접근 허용. 외부는 차단
							// setter , getter로 대체된지 오래임;;
	
	public Parent() {
		System.out.println("Create Parent");
	}
	
	public Parent(int number) {
		this.number = number;
		System.out.println("Create Parent(int number)");
		System.out.println("number = "+number);
	}
	
	public void Parent_method() {
		System.out.println("Call Parent class_Parent method");
	}
	
}
