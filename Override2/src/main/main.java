package main;

public class main {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		ChildOne one = new ChildOne();
		ChildTwo two = new ChildTwo();
		
		one.method();
		two.method();
		
		//위에껀 따로따로 관리해야해. 출력을 같아도 다른 인스턴스거든
		//---------------------------------------------------
		//아래는 같이 관리하기 좋자네
		
		Parent pone = new ChildOne();
		Parent ptwo = new ChildTwo();
		
		pone.method();
		ptwo.method();
		
		// 위=================
		
		ChildOne lady[] = new ChildOne[10]; // 생성x 배열만 잡음
		
		ChildTwo man[] = new ChildTwo[10]; // 생성x 배열만 잡음
		
		lady[0] = new ChildOne();
		man[0] = new ChildTwo();
		man[1] = new ChildTwo();
		lady[1] = new ChildOne();
		lady[2] = new ChildOne();
		//좀 에바;;;;
		
		//if man이 면 어쩌고~~ lady면 어쩌고~ 조건 필요해
		
		// 아래 ==================
		
		Parent human[] = new Parent[5];
		
		human[0] = new ChildOne();
		human[1] = new ChildTwo();
		human[2] = new ChildTwo();
		human[3] = new ChildOne();
		human[4] = new ChildOne();
		//굳 ^~^b
		
		for(int i=0;i<human.length;i++) {
			human[i].method();
		}
		//개꿀 ^~^b
		//관리가 정말 편하구나 
		// 이래서 오버라이딩 쓴다니깐~ 
		// 하나의 부모클래스로 자식 클래스 생성하고~~~~ for문 돌려서 처리도 가능해지고~`
		// 근데... Parent로 만들었는데 Child에만 있는 method는 어떻게 들어가지??
		
		Parent p1 = new ChildOne();
		Parent p2 = new ChildTwo();
		
		p1.method();
		p2.method();
		//p1.func(); // 봐봐 Parent가 Child 꺼 쓰려니까 에러나지?
		
		ChildOne c0 = (ChildOne)human[4]; // 요렇게 Child c0에다가 Parent p1을 Child로 캐스팅 해줬어.
		c0.func();// 그러면 chile 되서 child 내 method 쓸 수 있음 ㅎㅎ
		
		((ChildOne)human[4]).func(); // 요래요래 써도 됨.
	}
}