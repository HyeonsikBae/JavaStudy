package DTO;

//DTO:Data Transfer Object
//=VO:Value Object
public class Human {
	private int number; // 번호
						// sequence number 중복되지 않는 번호
	private String name; // 이름
	private int age; // 나이 
	private double height; // 신장
	
	public Human() {
	}

	public Human(int number, String name, int age, double height) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [number=" + number + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
}
