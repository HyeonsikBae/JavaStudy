package work10;

public class mainClass5 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		getDouble(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static void getDouble(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			array[i] = 2*array[i];
		}
	}
}
