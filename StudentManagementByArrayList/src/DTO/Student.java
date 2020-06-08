package DTO;

public class Student {
	private String name;
	private int age;
	private int scoreKor;
	private int scoreEng;
	private int scoreMath;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int scoreKor, int scoreEng, int scoreMath) {
		super();
		this.name = name;
		this.age = age;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMath = scoreMath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreKor() {
		return scoreKor;
	}

	public void setScoreKor(int scoreKor) {
		this.scoreKor = scoreKor;
	}

	public int getScoreEng() {
		return scoreEng;
	}

	public void setScoreEng(int scoreEng) {
		this.scoreEng = scoreEng;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", scoreKor=" + scoreKor + ", scoreEng=" + scoreEng
				+ ", scoreMath=" + scoreMath + "]";
	}
	
	
}
