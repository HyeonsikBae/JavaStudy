
public class mainClass {

	public static void main(String[] args) {
		/*
			Ż��.
			��ȯ��, switch�� �Բ� ���.
		 */
		
		for(int i=0;i<10;i++) {
			System.out.println("i = " + i);
			if(i==4) {
				break;
			}
		}
		System.out.println("Ż�� �Ϸ�");
		
		char chararr[] = {'A','B','C','D','E'};
		for(int i=0;i<chararr.length;i++) {
			if(chararr[i]=='C') {
				System.out.println(chararr[i]);
				break;
			}
		}
		
		
		//�Ʒ� �ڵ忡�� i==4 && j==3���� Ż���Ϸ��� ��ȯ���� 2�� �������;� �Ѵ�.
		for(int i=0;i<10;i++) {
			System.out.println("i : " + i);
			for(int j=0;j<10;j++) {
				System.out.println("  j : " + j);
			}
		}
		// Ż���� 1 : �� ��ȯ������ break�� �� �ɾ��ִ� ���.
		boolean bool = false;
		for(int i=0;i<5;i++) {
			System.out.println("i : " + i);
			for(int j=0;j<5;j++) {
				System.out.println("  j : " + j);
				if(i==4 && j==3) {
					bool = true;
					break;
				}
				if(bool==true) {
					break;
				}
			}
		}
		System.out.println("Ż�� �Ϸ�");
		// Ż���� 2 : Ű���带 ��� (goto) -> ������ ���� �� ������� ����.
		loopout:for(int i=0;i<5;i++) {
			System.out.println("i : " + i);
			for(int j=0;j<5;j++) {
				System.out.println("  j : " + j);
				if(i==4&&j==3) {
					break loopout;
				}
			}
		}
		System.out.println("Ż�� �Ϸ�");
	}
}