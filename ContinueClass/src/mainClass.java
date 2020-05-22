import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 생략
		 * 순환문과 함께 사용
		 * continue 아래 코드 생략
		 * 
		 * 다음의 경우 처리문3 생략 후, loop 계속 진행
		 * loop{
		 * 	처리문 1
		 * 	처리문 2
		 * 	if continue
		 * 	처리문 3
		 * }
		 */
		
		for(int i=0;i<10;i++) {
			if(i>5) {
				continue;
			}
			System.out.println("i : " + i);
		}
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력받을 수 : ");
		int number = scanner.nextInt();
		int Arr[] = new int[number];
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "번째 수 입력 : ");
			Arr[i] = scanner.nextInt();
			if(Arr[i]<0) {
				System.out.print("재입력 ");
				i--;
				continue;
			}
		}
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "번째 수 : " + Arr[i]);
		}
		
		scanner.close();
		*/
		Scanner scanner = new Scanner(System.in);
		int w = 0;
		System.out.print("입력받을 수 : ");
		int number = scanner.nextInt();
		int Arr[] = new int[number];
		while(w<number) {
			System.out.print((w+1) + "번째 수 입력 : ");
			Arr[w] = scanner.nextInt();
			if(Arr[w]<0) {
				System.out.print("재입력 ");
				continue;
			}
			w++;
		}
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "번째 수 : " + Arr[i]);
		}
	}
}
