package inheritance;

public class Cat extends Animal{
	String type;
	public void type() {
		System.out.println("이 " + this.spieces + "은 " + this.type + "입니다.");
	}
	public void setType(String type) {
		this.type = type;
	}
}
