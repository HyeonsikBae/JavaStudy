package main;

import java.awt.List;
import java.util.ArrayList;

import Animal.*;
import factory.*;

public class main {

	public static void main(String[] args) {
		/*
			Singleton Pattern
				중심이 되는 데이터 관리 template (list, map)을 중심으로
				어느 클래스에서나 접근이 용이하게 하기 위한 패턴
				instance가 한개의 의미
				
			Factory Pattern 공장 -> Object
				원하는 클래스의 형태를 생성하기 위한 패턴.
				
			interface, class 동물
			class 고양이, 개, 소
			
			Animal ani = new cat();
				
		 */
		
		Animal animal1 = AnimalFactory.create("Cat");
		Animal animal2 = AnimalFactory.create("Dog");
		Animal animal3 = AnimalFactory.create("Cow");
		
		animal1.printDescript();
		animal2.printDescript();
		animal3.printDescript();
		
		((Cat)animal1).catMethod();
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		Animal ani = null;
		String aniName[] = {"Cat","Cat","Cat","Dog","Cow"};
		
		for(int i=0;i<aniName.length;i++) {
			ani = AnimalFactory.create(aniName[i]);
			list.add(ani);
		}
		/*
		ani = new AnimalFactory().create("Cat");
		list.add(ani);
		list.add(ani);
		list.add(ani);
		ani = new AnimalFactory().create("Dog");
		list.add(ani);
		*/
		
		for(int i=0;i<list.size();i++) {
			list.get(i).printDescript();
			if(list.get(i) instanceof Cat) {
				((Cat)list.get(i)).catMethod();
			}
			else if(list.get(i) instanceof Dog) {
				((Dog)list.get(i)).dogMethod();
			}
			else if(list.get(i) instanceof Cow) {
				((Cow)list.get(i)).cowMethod();
			}
		}
	}
}