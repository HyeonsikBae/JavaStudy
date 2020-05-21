
public class mainClass {

	public static void main(String[] args) {
		/*
		int j;
		for(j=0;j<10;j++) {
			System.out.println(j);
		}//외부에서 변수 j 사용 가능
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}//외부에서 변수 i 사용 불가
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		*/
		//구구단 2단의 모든 합
		int sum=0;
		for(int i=2;i<20;i+=2) {
			sum+=i;
			System.out.println("" + i + "\t" + sum);
		}
		
		sum=0;
		int num2=2;
		for(int i=0;i<9;i++) {
			sum += num2;
			num2 += 2;
		}
		System.out.println(sum);
	}
}
