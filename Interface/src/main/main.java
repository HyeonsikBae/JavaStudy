package main;

public class main {
	public static void main(String[] args) {
		/*
			abstrace class : 일반 메소드 + abstract method + variable
							  다중 상속 불가.
							  
			interface : abstract method. 선언만 되어 있는 요소
						다중 상속 가능~
						협업시, 빠르게 설계 사양 파악 가능한 장점
						확장성, 관리 목적을 갖고 있다.
		 */
		
		//MyInterface myinter = new MyInterfaer(); > 생성 불가. 껍데기뿐.
		
		MyClass mycls = new MyClass();
		mycls.method();
		
		YouClass youcls = new YouClass();
		youcls.method();
		
		MyInterface myInter = new MyClass();
		myInter.method();
		
		MyInterface youInter = new YouClass();
		youInter.method();
		
		HeClass He1 = new HeClass();
		MyInterface He2 = new HeClass();
		YouInterface He3 = new HeClass();
		
		System.out.println();
		He1.func();
		He1.method();
		He1.heMethod();
		
		System.out.println();
		((YouInterface)He2).func();
		He2.method();
		((HeClass)He2).heMethod();
		
		System.out.println();
		He3.func();
		((MyInterface)He3).method();
		((HeClass)He3).heMethod();		
	}
}
