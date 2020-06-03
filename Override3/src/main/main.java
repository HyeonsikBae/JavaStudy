package main;

public class main {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Object o = new Parent();
		
		Parent p1 = (Parent)o;
		
		/*
		
			instanceOf
			: 상속받은 Object를 부모 클래스의 instance로 생성
			
			ChildOne -> Parent에 넣었었지.
			ChildTwo -> Parent에 넣었었지.
			
			생성된 instance에 어떤 자식 클래스가 생성되었는지 판별
			어떠한 인스턴스로 생성되었는지 판별!!!!!!
		 */
		Parent arrPar[] = new Parent[3];
		arrPar[0] = new ChildOne();
		arrPar[1] = new ChildTwo();
		arrPar[2] = new ChildOne();
		
		for(int i=0;i<3;i++) {
			arrPar[i].method();
			if(arrPar[i] instanceof ChildOne) {
				ChildOne one = (ChildOne)arrPar[i];
				one.oneMethod();
			}
		}
	}
}
