package main;

public class main {

	public static void main(String[] args) {
		/*
		
		1. 원 넓이 구하기 클래스(반지릅 입력)
		2. 직사각형 넓이 구하기 클래스(가로, 세로 입력) 
		
		
		Game
		1. ramdom으로 숫자 받기 (30~100)
		2. userInput -> 1~15
		3. 랜덤숫자에서 유저가 입력한 숫자를 뺀다.
		4. 게임오버!
		
		 */
		
		Select select = new Select();
		Circle circle = new Circle();
		Rectangular rectangular = new Rectangular();
		
		switch(select.select()) {
			case 1:
				circle.input();
				circle.area();
				break;
			case 2:
				rectangular.input();
				rectangular.area();
				break;
		}
	}
}