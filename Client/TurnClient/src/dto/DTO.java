package dto;

public class DTO {
	private String name;
	private static int number;
	
	public DTO(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
		
	@Override
	public String toString() {
		return name+"-"+number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
