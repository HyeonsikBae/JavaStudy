public class bubbleSort {

	public static void main(String[] args) {
		
		int array[] = {0,5,7,6,1,9,7,2,3,8};
		int temp = 0;
		
		for(int i=array.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}