
public class mainClass {

	public static void main(String[] args) {
		/*
			탈출.
			순환문, switch와 함께 사용.
		 */
		
		for(int i=0;i<10;i++) {
			System.out.println("i = " + i);
			if(i==4) {
				break;
			}
		}
		System.out.println("탈출 완료");
		
		char chararr[] = {'A','B','C','D','E'};
		for(int i=0;i<chararr.length;i++) {
			if(chararr[i]=='C') {
				System.out.println(chararr[i]);
				break;
			}
		}
		
		
		//아래 코드에서 i==4 && j==3에서 탈출하려면 순환문을 2번 빠져나와야 한다.
		for(int i=0;i<10;i++) {
			System.out.println("i : " + i);
			for(int j=0;j<10;j++) {
				System.out.println("  j : " + j);
			}
		}
		// 탈출방법 1 : 각 순환문에서 break를 다 걸어주는 방법.
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
		System.out.println("탈출 완료");
		// 탈출방법 2 : 키워드를 사용 (goto) -> 오류가 많아 잘 사용하지 않음.
		loopout:for(int i=0;i<5;i++) {
			System.out.println("i : " + i);
			for(int j=0;j<5;j++) {
				System.out.println("  j : " + j);
				if(i==4&&j==3) {
					break loopout;
				}
			}
		}
		System.out.println("탈출 완료");
	}
}