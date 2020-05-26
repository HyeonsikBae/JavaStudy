import java.util.Scanner;

public class selectSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 수 :");
		int num = scanner.nextInt();
		int array[] = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			array[i] = scanner.nextInt();
		}
		
		int temp = 0;
		int select = 0;
		
		System.out.print("1번 오름차순\n2번 내림차순\n선택 : ");
		select = scanner.nextInt();
		
		if(select == 1) {
			for(int i=0;i<num-1;i++) {
				for(int j=i+1;j<num;j++) {
					if(array[i]>array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		else {
			for(int i=0;i<num-1;i++) {
				for(int j=i+1;j<num;j++) {
					if(array[i]<array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		scanner.close();
	}
}
