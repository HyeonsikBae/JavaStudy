package accessModifier;

public class PublicClass {
	public static void main(String[] args) {
		Car lambo = new Car("����");
		//System.out.println(lambo.name);
		//lambo.name += "����";
		//System.out.println(lambo.name);
	}
}
class Car{
	private String name;
	
	public Car(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}