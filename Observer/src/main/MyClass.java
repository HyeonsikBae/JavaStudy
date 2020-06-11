package main;

import java.util.Observable;

public class MyClass extends Observable{
	
	private String preArg = null;
	private String id;
	private String password;
	
	public void method() {
		
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	@Override
	public void notifyObservers(Object arg) {
		String str = (String)arg;
		
		if(str.equals(preArg)) return;
		
		preArg = str;
		setChanged();
		
		super.notifyObservers(arg);
		
		clearChanged();
	}
}
