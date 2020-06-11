package main;

import java.util.ArrayList;

import person.Person;
import type.*;


public class main {
	
	public static void main(String[] args) {
		/*
		Person char1 = new Person();
		char1.create(new Atype());
		char1.mWeapon.drawWeapon();
		char1.mBomb.drawBomb();
		*/
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person character = new Person();
		
		String type[] = {"A", "A", "B", "A", "B"};
		for(int i=0;i<type.length;i++) {
			if(type[i].equals("A"))	character.create(new Atype());
			else character.create(new Btype());
			character.mWeapon.drawWeapon();
			character.mBomb.drawBomb();
		}	
	}
}