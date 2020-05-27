package inheritance;

public class Animal {
	String spieces;
	public void spieces() {
		System.out.println("이 동물은 " + this.spieces + "입니다.");
	}
	public void setSpieces(String spieces) {
		this.spieces = spieces;
	}
}