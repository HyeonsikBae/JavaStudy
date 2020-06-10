package main;

public class main {

	public static void main(String[] args) {
		/*
			하나의 instance에 접근하여 데이터를 송수신할 수 있는 패턴
		
		
		 */
		MyClass mcls = new MyClass();
		YouClass ycls = new YouClass();

		int n = mcls.getNumber();
		ycls.setTag(n);
		System.out.println(ycls.toString());
		
	}

}

/*











*/