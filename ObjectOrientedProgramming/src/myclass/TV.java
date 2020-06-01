package myclass;

public class TV {
	String name;
	int channel;
	boolean power;
	
	public void setInput(String n, int c, boolean p) {
		name = n;
		channel = c;
		power = p;
	}
	
	public void setPower(boolean p) {
		power = p;
	}
	
	public void method() {
		System.out.println("name = " + name + "\n" + 
						   "channel = " + channel + "\n" + 
						   "power = " + power);
	}
	
}
