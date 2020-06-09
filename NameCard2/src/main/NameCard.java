package main;

public class NameCard {
	String name;
	String phone;
	String email;

	//여기선  Class가 아닌 Interface선언
	PrintNameCard printNameCard;
	
	public NameCard(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameCard p) {
		this.printNameCard = p;
	}
	
	public void print() {
		printNameCard.print(this);
	}
}