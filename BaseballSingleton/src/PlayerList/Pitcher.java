package PlayerList;

public class Pitcher extends Human {
	private int win; // 승
	private int lose; // 패
	private double defence; // 방어율 0.0~10.0
	
	public Pitcher() {
		
	}

	public Pitcher(String type, int number, String name, int age, double height, int win, int lose, double defence) {
		super(type, number, name, age, height);
		/*
		this.setType(type);
		this.setNumber(number);
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		 */
		this.win = win;
		this.lose = lose;
		this.defence = defence;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	@Override
	public String toString() {
		return super.toString() + win + "-" + lose + "-" + defence;
	}
	
}
