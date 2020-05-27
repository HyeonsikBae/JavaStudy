package inheritance;

public class mainClass {

	public static void main(String[] args) {
		
		Dog Puppy = new Dog();
		Puppy.spieces = "개";
		Puppy.type = "불독";
		
		Cat Kitty = new Cat();
		Kitty.spieces = "고양이";
		Kitty.type = "러시안블루";
		
		Puppy.spieces();
		Puppy.type();
		Kitty.spieces();
		Kitty.type();
	}
}
