package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass1 {

	public static void main(String[] args) {
		/*
		
		Exception : ���� (������ �ƴϴ�)
		
		����
			1. number : ������ �ٸ� ��! ���ڰ� �´ٰų�,,A�� 65�� ������.. �׷� ��
			2. array : ������� ���� �ε����� ������ ��
			3. class : Scanner�� �� ã�� ��
			4. file : file�� �� ã�� �� (�ش� ���丮�� ���ٰų�..)
		 
		try{
			����1 ���� �� �ִ� �ҽ�
			����2 ���� �� �ִ� �ҽ�
		}catch(����Ŭ����1 e){
			�޼���
		}catch(����Ŭ����2 e){
			�޼���
		}finally{//��� ���� ����
			�޼���//������ ����!!!//��ó����
			file close �����
			DB ���󺹱� ����� �׷��� ��//DB �ݾ��ִ°��� rollback -> undo
		}
		
		����Ŭ������ ���ϴ� ��ŭ ������ �ȴ�.
		finally�� ������ �����ϴ�. �����ص� �Ʒ� �ڵ�� ������ ����ȴ�.
		 */
		
		/*
		int array[] = {1,2,3};
		
		System.out.println("���α׷� ����");
		try {
			for(int i=0;i<5;i++) {
				System.out.println(array[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ�");
			return;
			//e.printStackTrace();
			//System.out.println(e.getMessage()); // ��� exception �߻��ƴ��� �˷���
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("������ ����!");//return�� ���� try catch������ ������ ����
		}
		System.out.println("���α׷� ��");
		*/

		//NullPointerException
		String str = null;
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("str�� �Ҵ���� �ʾҽ��ϴ�.");
		}
		
		//ArrayIndexOutOfBoundsException
		int arr[] = {1,2,3};
		
		try {
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� �ʰ�");
		}
		
		//FileNotFoundException
		File file = new File("c:\\xxx.txt");
		FileInputStream is;
		try {
			is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			System.out.println("�׷� ���� ����");
		}
		
		//NumberFormatException
		int num;
		try {
			num = Integer.parseInt("123.456");
		}catch(NumberFormatException e) {
			System.out.println("������ �޶�");
		}
		
		//StringIndexOutOfBoundsException
		String str1 = "abc";
		try {
			str1.charAt(3);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("���ڿ� ���� �ʰ�");
		}
	}
	
	
	
	//try catch ���� ���� �Ͱ�, throws�� ���� ���� ����. �� �� �ϳ��� ������ ��
	static void func()throws ArrayIndexOutOfBoundsException {
		
		int array[] = {1,2,3};		
		
		try {	
			for(int i=0;i<5;i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
			
	}
}