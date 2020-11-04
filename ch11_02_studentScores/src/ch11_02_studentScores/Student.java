package ch11_02_studentScores;

public class Student {

	private String firstName;
	private String lastName;
	private int Score;

	public Student() {
		this("", "", 0);
	}

	public Student(String firstName, String lastName, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Score = score;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", Score=" + Score + "]";
	}

}
