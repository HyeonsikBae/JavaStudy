package work10;

public class mainClass3 {
	public static void main(String[] args) {
		int array[] = {1,3,5,48,6,21,5,35};
		System.out.println(max(array));
	}
	
	static int max(int array[]) {
		int length = array.length;
		int temp = 0;
		
		for(int i=0;i<length;i++) {
			if(temp<array[i]) {
				temp = array[i];
			}
		}
		
		if(temp==0||length==0) {
			temp = -999999;
		}
		
		return temp; 
	}
}
