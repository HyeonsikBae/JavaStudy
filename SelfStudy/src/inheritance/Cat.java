package inheritance;

public class Cat extends Animal{
	String type;
	public void type() {
		System.out.println("�� " + this.spieces + "�� " + this.type + "�Դϴ�.");
	}
	public void setType(String type) {
		this.type = type;
	}
}
