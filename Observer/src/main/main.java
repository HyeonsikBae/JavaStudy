package main;

import Observer.ObserverA;
import Observer.ObserverB;

public class main {
	public static void main(String[] args) {
	/*
		Observer : 감시자 패턴 -> class 감시
	 */
		
		MyClass cls = new MyClass();
		
		//observer 추가
		cls.addObserver(new ObserverA());
		cls.addObserver(new ObserverB());
		
		cls.setId("poo");
		cls.setPassword("1004");
		
		cls.notifyObservers(cls.getId());
		
		
	}
}
