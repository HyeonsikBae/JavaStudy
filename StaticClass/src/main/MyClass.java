package main;

public class MyClass {
	private int memNum; // > member variable >> 새로 생성되는 인스턴스에 소속되어있다. 
						//	cls와 cls2 의 memNum은 다른 영역에 각각 존재.
	
	static int staticVar; // > static variable >> 객체가 달라도 하나만 존재!!!
							// cls와 cls2에서의 staticVar는 동일 영역이다!!
	
	
	//지역 변수는, 지역 나가면 삭제
	//멤버 변수는 멤버가 가비지컬렉터에 의해 삭제되면 삭제
	//정적 변수는 안없어져~~
	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	public void method() {
		memNum += 1;
		System.out.println("memNum = " + memNum);
		staticVar += 1;
		System.out.println("static = " + staticVar);
	}
	//인스턴스 메소드
	
	
	public static void staticMethod() {
		System.out.println("STATIC METHOD");
	}
	//스태틱 메소드 = 클래스 메소드
	//인스턴스 생성하지 않아도 [클래스명.메소드명]으로 호출 가능
	//접근 못하는 거 : this, super >> 왜냐? 인스턴스 통해서 나가는게 아니다. > 같은 메모리에 있는게 아니다. >메모리 따로 잡혀~
	//호출해서 쓸 때 메모리에 올라가고, 계속 유지되고 있는다.
	
	
}
