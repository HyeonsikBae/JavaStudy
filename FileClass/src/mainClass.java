import java.io.File;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		/*

		Code -> logic(����)
				����� : file, database
		
		�����ü : ����, DB
				�̸�		����		�ּ�
				ȫ�浿	24		����		->	���� : write / �б� : read
		
		���� : data�� ����, �ҷ�����
		
		��� ������ txt�κ��� ���.
		.dll(Dynamic Link Library) - ���� (Dynamic) : ���� ���� ��, �ʿ��� �޸𸮸� �׶��׶� �Ҵ� �� ����
		.lib					   - ���� (Static) : ���� ���� ��, lib�� ���� �޸� Ȯ��
			-> java �������� ���� �� .jar
		 */
		
		
		//���� ���
		/*
		File fdir = new File("c:\\");
		
		String fileList[] = fdir.list();
		
		for(int i=0;i<fileList.length;i++) {
			System.out.println(fileList[i]);
		}
		
		System.out.println(java.util.Arrays.toString(fileList));
		*/
		
		//����, ���丮, �� �� ��� 
		/*
		File fdir = new File("d:\\");
		File fileList[] = fdir.listFiles();
		
		for(int i=0;i<fileList.length;i++) {
			if(fileList[i].isFile())
				System.out.println("[����]" + fileList[i].getName());
			else if(fileList[i].isDirectory()) {
				System.out.println("[����]" + fileList[i].getName());
			}
			else {
				System.out.println("[etc]" + fileList[i].getName());
			}
		}
		*/
		
		//���� ����
		String fileStr = "d:\\temp\\newfile.txt";
		File newFile = new File(fileStr);
		try {
			if(newFile.createNewFile()) { // ������ ���� �����Ǵ� �κ�
				System.out.println("���� ���� �Ϸ�");
			}
			else {
				System.out.println("���� ���� ����");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//���� ���翩�� Ȯ��
		if(newFile.exists()) {
			System.out.println("���� �����մϴ�.");
		}
		else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		//���� ����
		/*
		if(newFile.delete()) {
			System.out.println("���� ���� �Ϸ�");
		}
		else {
			System.out.println("���� ���� �Ұ�");
		}
		*/
		
		//�б� ���� ���� 
		if(newFile.canRead()) {
			System.out.println("�б� ����");
		}
		else {
			System.out.println("�б� �Ұ�");
		}
		
		//���� ���� ����
		if(newFile.canWrite()) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� �Ұ�");
		}
		
	}
}