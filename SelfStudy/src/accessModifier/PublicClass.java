package accessModifier;

public class PublicClass {
	public static void main(String[] args) {
		Car lambo = new Car("¶÷º¸");
		//System.out.println(lambo.name);
		//lambo.name += "¶ËÂ÷";
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