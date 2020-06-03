package main;

public class Member {
	
	Member(){
		System.out.println("Member.constructor");
	}
	
	public void init() {
		System.out.println("Member.init");
	}
	
	public void random() {
		System.out.println("Member.Random");
	}
	
	public void input() {
		System.out.println("Member.input");
	}
	
	public static Member getInstance() {
		Member m = new Member();
		m.init();
		m.random();
		m.input();
		return m;
	}
	
}