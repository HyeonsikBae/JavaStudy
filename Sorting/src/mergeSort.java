
public class mergeSort {

	public static void main(String[] args) {
		
		int intArray[] = {5,6,7,1,9,2,3,4,0,8};
		sort(intArray,0,intArray.length-1);
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void sort(int array[],int start, int end) {
		
		if(start<end) {
			int mid = start + (end-start)/2;
			sort(array,start,mid);
			sort(array,mid+1,end);
			merge(array,start,mid,end);	
		}	
	}
	
	public static void merge(int array[], int start, int mid, int end) {
		int a = start;
		int b = mid+1;
		int temp=0;
		int tempArr[] = new int[array.length];
		
		while(a<=mid && b<=end) {
			if(array[a]<=array[b]) {
				tempArr[temp++] = array[a++];
			}
			else {
				tempArr[temp++] = array[b++];
			}
		}
		
		if(a>mid) {
			for(int i=b;i<=end;i++) {
				tempArr[temp++]=array[b++];
			}
		}
		else{
			for(int i=a;i<=mid;i++) {
				tempArr[temp++]=array[a++];
			}
		}
		for(int i=start;i<=end;i++) {
			array[i] = tempArr[i-start];
		}
	}
}