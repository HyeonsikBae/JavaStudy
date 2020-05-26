package work8;

public class mainClass {

	public static void main(String[] args) {
	
		int arr2[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		int num1 = arr2.length;
		int num2 = arr2[0].length;
		int count = num1*num2;
		
		int array[] = new int[count];
		
		for(int i=0;i<num1;i++) {
			for(int j=0;j<num2;j++) {
				array[j+i*num2] = arr2[i][j];
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(array[i]);
		}
	}
}