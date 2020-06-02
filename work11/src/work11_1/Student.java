package work11_1;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return	( this.kor + this.eng + this.math );
	}
	public double getAverage() {
		return (double)(this.kor+this.eng+this.math)/3;
	}
}
