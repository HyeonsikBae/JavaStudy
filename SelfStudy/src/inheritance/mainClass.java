package inheritance;

public class mainClass {

	public static void main(String[] args) {
		
		Dog Puppy = new Dog();
		Puppy.spieces = "��";
		Puppy.type = "�ҵ�";
		
		Cat Kitty = new Cat();
		Kitty.spieces = "�����";
		Kitty.type = "���þȺ��";
		
		Puppy.spieces();
		Puppy.type();
		Kitty.spieces();
		Kitty.type();
	}
}
