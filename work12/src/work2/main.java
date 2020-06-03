package work2;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		Unit unit[] = new Unit[1];		
		int randomUnit;
		for(int i=0;i<unit.length;i++) {
			randomUnit = random.nextInt(3);
			switch(randomUnit) {
				case 0:
					unit[i] = new Marine();
					break;
				case 1:
					unit[i] = new Tank();
					break;
				case 2:
					unit[i] = new Dropship();
					break;
			}
		}
		for(int i=0;i<unit.length;i++) {
			int x = random.nextInt(5)+1;
			int y = random.nextInt(5)+1;
			unit[i].move(x,y);
		}
		for(int i=0;i<unit.length;i++) {
			unit[i].stop();\
			
			] 
		}
	}
}
class Unit {
	int x, y;
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x : "+x+" y : "+y+" 로 이동");
	}
	void stop() {
		System.out.println("x : "+x+" y : "+y+" 에 멈추었습니다.");
	}
}
class Marine extends Unit{ // 보병
	int x, y; // 현재 위치
	Marine(){
		System.out.println("마린 생성");
	}
	
	void stimPack() { /* 스팀팩을 사용한다.*/}
	void call() {
		System.out.print("마린 ");
	}
}

class Tank extends Unit{ // 탱크
	Tank(){
		System.out.println("탱크 생성");
	}
	int x, y; // 현재 위치
	
	void changeMode() { /* 공격모드를 변환한다. */}
	void call() {
		System.out.print("탱크 ");
	}
}

class Dropship extends Unit{ // 수송선
	int x, y; // 현재 위치
	Dropship(){
		System.out.println("드랍쉽 생성");
	}
	
	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
	void call() {
		System.out.print("드랍쉽 ");
	}
}