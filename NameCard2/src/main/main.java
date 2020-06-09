package main;

public class main {
	public static void main(String[] args) {
		NameCard ncard = new NameCard("홍길동","123-4567","gg@g.g");
		//NameCard를 인스턴스화 한 ncard에 variable 값 저장
		
		ncard.setPrintNameCard(new PrintNameCard2());
		//ncard의 PrintNameCard를 new PrintNameCard2()로 선언.
		//여기서 PrintNameCard2는 printNamecard Interface를 implement한다.
		ncard.print();
		//앞서 선언된 printNameCard2의 오버라이드된 메소드 print 실행
		
		ncard.setPrintNameCard(new PrintNameCard1());
		ncard.print();
	}
}