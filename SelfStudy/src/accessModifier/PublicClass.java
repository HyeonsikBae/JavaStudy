package accessModifier;

public class PublicClass {
	public static void main(String[] args) {
		Car car = new Car("다마스");
		car.info();
		car.name = "스파크";
		//car.engine = "전륜";
		car.engineSet("전륜");
		car.fullAccel();
	}
}
class Car{
	private String engine;
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	public void engineSet(String engine) {
		this.engine = engine;
	}
	public void nameSet(String name) {
		this.name = name;
	}
    public void fullAccel(){
    	System.out.print(this.engine + " : 부릉!\t");
        System.out.println(this.name + " : 출발!");
    }
    public void info() {
    	System.out.print("엔진은  " + engine);
    	System.out.println("\t이름은 " + name);
    }
}