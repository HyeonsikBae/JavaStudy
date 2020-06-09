package work13_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));//주소 비교
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));//멤버 변수 값 비교
	}
}