
public class mainClass {

	public static void main(String[] args) {
		/*
		int j;
		for(j=0;j<10;j++) {
			System.out.println(j);
		}//�ܺο��� ���� j ��� ����
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}//�ܺο��� ���� i ��� �Ұ�
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		*/
		//������ 2���� ��� ��
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
