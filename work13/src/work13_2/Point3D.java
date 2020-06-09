package work13_2;

public class Point3D {
	int x,y,z;
	Point3D(int x, int y, int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	}
	Point3D() {
	this(0,0,0);
	}

	public boolean equals(Object obj) {
		boolean check;
		
		Point3D pos= (Point3D)obj;
		if(this.x==pos.x && this.y==pos.y && this.z==pos.z) {
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}

