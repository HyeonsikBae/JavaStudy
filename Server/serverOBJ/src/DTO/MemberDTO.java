package DTO;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3946400011159405591L;
	
	private int number;
	private String name;
	
	public MemberDTO(){}
	public MemberDTO(int number, String name) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "MemberDTO [number=" + number + ", name=" + name + "]";
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
}