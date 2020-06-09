package main;

public class NameCard {
	String name;
	String phone;
	String email;

	PrintNameCard printNameCard;
	public void setPrintNameCard(PrintNameCard p) {
		this.printNameCard = p;
	}
	public void print() {
		printNameCard.print(this);
	}
	
	
	PrintNameCard2 printNameCard2;
	public void setPrintNameCard2(PrintNameCard2 p) {
		this.printNameCard2 = p;
	}
	public void print2() {
		printNameCard2.print(this);
	}
	//아니 ㅜ머할때마다 클래스랑 인스턴스 늘려야됨;;;에바..이럴때 인터페이스!
}