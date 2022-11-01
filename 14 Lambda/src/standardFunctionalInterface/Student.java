package standardFunctionalInterface;

public class Student {
	private String name;
	private String sex;
	private int engScore;
	private int mathScore;
	private Address address;

	public Student(String name, int engScore) {
		this.name = name;
		this.engScore = engScore;
	}

	public Student(String name, int engScore, int mathScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public Student(String name, String sex, int engScore, int mathScore) {
		this.name = name;
		this.sex = sex;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public Student(String name, String sex, Address address) {
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
