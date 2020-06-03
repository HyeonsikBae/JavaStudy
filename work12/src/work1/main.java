package work1;

public class main {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
	}
}
class Child extends Parent {
	int x = 3000;
	Child() {
		this(1000);
		System.out.println("2.1000 "+x);
	}
	Child(int x) {
		this.x = x;
	}
}
class Parent {
	int x=100;
	Parent() {
		this(200);
		System.out.println("1.200 "+x);
	}
	Parent(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}