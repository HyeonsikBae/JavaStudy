import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * ����
		 * ��ȯ���� �Բ� ���
		 * continue �Ʒ� �ڵ� ����
		 * 
		 * ������ ��� ó����3 ���� ��, loop ��� ����
		 * loop{
		 * 	ó���� 1
		 * 	ó���� 2
		 * 	if continue
		 * 	ó���� 3
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
		System.out.print("�Է¹��� �� : ");
		int number = scanner.nextInt();
		int Arr[] = new int[number];
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "��° �� �Է� : ");
			Arr[i] = scanner.nextInt();
			if(Arr[i]<0) {
				System.out.print("���Է� ");
				i--;
				continue;
			}
		}
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "��° �� : " + Arr[i]);
		}
		
		scanner.close();
		*/
		Scanner scanner = new Scanner(System.in);
		int w = 0;
		System.out.print("�Է¹��� �� : ");
		int number = scanner.nextInt();
		int Arr[] = new int[number];
		while(w<number) {
			System.out.print((w+1) + "��° �� �Է� : ");
			Arr[w] = scanner.nextInt();
			if(Arr[w]<0) {
				System.out.print("���Է� ");
				continue;
			}
			w++;
		}
		for(int i=0;i<Arr.length;i++) {
			System.out.println((i+1) + "��° �� : " + Arr[i]);
		}
	}
}
