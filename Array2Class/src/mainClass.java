public class mainClass {

	public static void main(String[] args) {
		
		/*
		1���� �迭
		Array : ���� �ڷ����� ����. �������� ����.
				index number�� �����Ѵ�.
				0~n-1
		
		�ٸ� �ڷ����� ���� : C -> structure
						Java -> class
		
		int array[] = new int[3];
		int array[] = {1,2,3};
		
		MyStruct my = {'a',24,"ȫ�浿"};
		
		String member[] = {"a", "24", "ȫ�浿"}; ���� �Ͽ� ����ȯ�� ���ؼ��� �����ϱ� ��..
		
		int Array2[3][4] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		==
		int Array2[][] = new int [3][4]  ==(int []Array2[] = new int [3][4])
		 */
		/*
		int Array2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i=0;i<Array2.length;i++) {
			for(int j=0;j<Array2[0].length;j++) {
				System.out.println("Array2["+i+"]["+j+"] : " + Array2[i][j]);
			}
		*/
		
		//�迭 ����(������) : �ּҸ� �����ϸ� ��� ������ ���� ����. ���ȿ� ���...
		int arrayTag[] = {11,22,33,44,55};
		int pArray[] = arrayTag; // �� �迭�� ������ �ּҸ� �����ϰ� �ȴ�.
		System.out.println(arrayTag);
		pArray[1]=222;
		System.out.println(arrayTag[1]);
	}
}