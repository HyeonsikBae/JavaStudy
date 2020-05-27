package work10;

import java.util.Random;

public class mainClass2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		shuffle(arr);
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}
	static void shuffle(int array[]) {
		
		Random random = new Random();
		
		int arr2[] = new int[10];
		int temp = 0;
		boolean bool = true;
		
		for(int i=0;i<10;i++) {
			temp = random.nextInt(10);
			for(int j=0;j<10;j++) {
				if(arr2[j]==array[temp]) {
					bool = false;
					i--;
					break;
				}
				else {
					bool=true;
				}
			}
			if(bool==true) {
				arr2[i] = array[temp];
			}
		}
		
		for(int i=0;i<10;i++) {
			array[i] = arr2[i];
		}
	}
}