package exception;

public class StudyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,'d',5};
		try {
			for(int i=0;i<5;i++) {
				System.out.println(array[i]);
			}
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}