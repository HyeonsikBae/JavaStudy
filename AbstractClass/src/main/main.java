package main;

public class main {

	public static void main(String[] args) {
		/*
			Abstract class : 추상 클래스
							 추상  method : 선언만 되어 있는 함수
							 			  int method(char c, int i); >>  prototype
							 생성 불가. 상속받은  class에서 정의한 후에 생성
							 
							 확장성, 관리를 위해 사용!!!
							 
							 
			class : method 내용이 모두 설정되어 있는 것.
										  int method(char c, int i){
										  		처리문~
										  }
		 */
		
		ChildClass ccls = new ChildClass();
		ccls.method();
		ccls.abstractMethod();
		
		AbstractClass acls = new AbstractClass() {
			@Override
			public void abstractMethod() {
				System.out.println("gg");
			}
		};
		
		acls.method();
		acls.abstractMethod();
		
		AbstractClass cls = new ChildClass();
		
		
	}

}
