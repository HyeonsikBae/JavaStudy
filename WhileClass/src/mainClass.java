
public class mainClass {

	public static void main(String[] args) {
		
		//while은 조건 판별 후, 반복
		int w;
		w = 0;
		while(w<10) {
			System.out.println("w = " + w);
			w++;
		}
		
		//do while은 1회 실행 후 조건 판별 후, 반복
		int dw;
		dw = 10;
		do {
			System.out.println("dw = " + dw);
			dw++;
		}
		while(dw<10);
		
		//이중 while, 내부 while문 조건 초기화 필요
		int w1 = 0;
		int w2 = 0;
		while(w1<5) {
			System.out.println("w1 = " + w1);
			while(w2<3) {
				System.out.println("\tw2 = " + w2);
				w2++;
			}
			w2=0;
			w1++;
		}
		
		//무한루프
		int infi = 0;
		while(true) {
			System.out.println("infi = " + infi);
			infi++;
		}
		
		/*
		모든 어플리케이션의 구조
		1. initialize (초기화)
		2. loop (순환)
			while(true){
				탈출event 시 release로 이동
			}
		3. release (해방->메모리 클린)
		*/
	}
}