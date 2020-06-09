package work13_1;

public class Circle extends Shape {

	double r;
	
	public Circle() {
		
	}
	public Circle(double r) {
		this.r = r;
	}
	@Override
	public double calcArea() {
		double area = (r*r*Math.PI);
		return area;
	}

}
