
public class mainClass {

	public static void main(String[] args) {
		
		//while�� ���� �Ǻ� ��, �ݺ�
		int w;
		w = 0;
		while(w<10) {
			System.out.println("w = " + w);
			w++;
		}
		
		//do while�� 1ȸ ���� �� ���� �Ǻ� ��, �ݺ�
		int dw;
		dw = 10;
		do {
			System.out.println("dw = " + dw);
			dw++;
		}
		while(dw<10);
		
		//���� while, ���� while�� ���� �ʱ�ȭ �ʿ�
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
		
		//���ѷ���
		int infi = 0;
		while(true) {
			System.out.println("infi = " + infi);
			infi++;
		}
		
		/*
		��� ���ø����̼��� ����
		1. initialize (�ʱ�ȭ)
		2. loop (��ȯ)
			while(true){
				Ż��event �� release�� �̵�
			}
		3. release (�ع�->�޸� Ŭ��)
		*/
	}
}