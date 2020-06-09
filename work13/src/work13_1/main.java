package work13_1;

public class main {
	
	public static void main(String[] args) {
		
		Point p = new Point(3,3);
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(p);

		System.out.println(c.calcArea());
		System.out.println(r.isSquare());
	}
}