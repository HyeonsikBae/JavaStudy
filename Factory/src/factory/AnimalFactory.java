package factory;
import Animal.*;
public class AnimalFactory {
	
	//Factory로 원하는 클래스를 생성하는 게 목적
	public static Animal create(String animalName) {
		
		if(animalName.equals("")) System.out.println("생성할 클래스가 없습니다.");
		else if(animalName.equals("Cat")) {
			return new Cat();
		}
		else if(animalName.equals("Dog")) {
			return new Dog();
		}
		else if(animalName.equals("Cow")) {
			return new Cow();
		}
		return null;
	}
}