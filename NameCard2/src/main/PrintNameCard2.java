package main;

public class PrintNameCard2 implements PrintNameCard {

	@Override
	public void print(NameCard nc) {
		System.out.println("이름 : "+nc.name);
		System.out.println("번호 : "+nc.phone);
		System.out.println("메일 : "+nc.email);
	}

}
