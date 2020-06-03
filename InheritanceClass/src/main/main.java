package main;

import cls.cc.Child;
import cls.cc.Parent;

public class main {

	public static void main(String[] args) {
		/*
		
			은닉성 : 접근 지정자를 통해 외부로부터 접근을 차단, 허용해 주는 것을 의미한다.
					private(무조건 차단!), public(무조건 허용~)
					variable			method
			
			상속성 : 부모클래스에서 기능을 상속.
					기능 : 변수, 메소드
					기능을 확장하기 위해 사용 하는 경우가 많다.
					
			다형성 : 상속 후에 여러 형태로 자식 클래스가 구현되는 것.
					A 클래스에서 상속받은 여러 B 클래스가 아니라,, A상속받은 B, C, D 클래스처럼 다른 클래스의 경우이다.
					도형 -> 사각형, 삼각형, 원 ...(O)
					사람 -> 주홍, 경호, 도흠..(X)
					
			super
			
			☆Over Ride : 상속받은 재산 수정해서 확장하는것. -> 관리의 목적.
		 */
		
		Child c = new Child();
		c.Parent_method();
		
		Child cls = new Child(3);
		cls.Parent_method();
		
	}
	
	
}
