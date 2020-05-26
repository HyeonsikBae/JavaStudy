
public class quickSort {

	public static void main(String[] args) {
		int intArray[] = {2,4,1,3,6,8,7,9,5,1,8};
		quicksort(intArray,0,intArray.length-1);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}

	}
	public static void quicksort(int array[], int start, int end) {
		
		int pivot = array[start];
		int a = start+1;
		int b = end;
		int temp = 0;
		
		while(b>a) {
			while(array[a]<pivot) {
				a++;
			}
			while(array[b]>pivot) {
				b--;
			}
			if(array[a]>array[b]) {
				temp = array[a];
				array[a] = array[b];
				array[b] = temp;
				a++;
				b--;
			}
		}
		
		
		if(array[start]>array[a-1]) {
			temp = pivot;
			array[start] = array[a-1];
			array[a-1] = temp;
		}
		if(end>start) {
			quicksort(array,start,a-2);
			quicksort(array,a,end);
		}
	}
}
