public class mainClass {

	public static void main(String[] args) {
		
		/*
		1차원 배열
		Array : 같은 자료형의 묶음. 변수들의 묶음.
				index number로 관리한다.
				0~n-1
		
		다른 자료형의 묶음 : C -> structure
						Java -> class
		
		int array[] = new int[3];
		int array[] = {1,2,3};
		
		MyStruct my = {'a',24,"홍길동"};
		
		String member[] = {"a", "24", "홍길동"}; 으로 하여 형변환을 통해서도 가능하긴 함..
		
		int Array2[3][4] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		==
		int Array2[][] = new int [3][4]  ==(int []Array2[] = new int [3][4])
		 */
		int Array2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i=0;i<Array2.length;i++) {
			for(int j=0;j<Array2[0].length;j++) {
				System.out.println("Array2["+i+"]["+j+"] : " + Array2[i][j]);
			}
		}
	}
}