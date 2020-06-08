package DTO;

public class Batter extends Human {
	private int batcount; // 타수
	private int hit; // 안타 수
	private double hitAvg; // 타율 0.0~1.0
	
	public Batter() {
	
	}
	
	public Batter(String type, int number, String name, int age, double height, int batcount, int hit, double hitAvg) {
		super(type, number, name, age, height);
		/*
		this.setType(type);
		this.setNumber(number);
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		 */
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}

	public int getBatcount() {
		return batcount;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}
	
	@Override
	public String toString() {
		return super.toString() + batcount + "-" + hit + "-" + hitAvg;
	}
	
}
