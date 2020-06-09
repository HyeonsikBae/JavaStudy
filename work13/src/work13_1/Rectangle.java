package work13_1;

public class Rectangle extends Shape {
	
	int width;
	int height;
	boolean rec;
	public Rectangle() {
	}
	
	public Rectangle(Point p) {
		this.width = p.x;
		this.height = p.y;
	}
	
	public boolean isSquare() {
		if(this.width==this.height) {
			rec = true;
		}
		else {
			rec = false;
		}
		return rec;
	}
	@Override
	
	double calcArea() {
		double area = this.width*this.height;
		return area;
	}

}
