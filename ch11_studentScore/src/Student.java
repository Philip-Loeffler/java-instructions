
public class Student implements Comparable {

	public String firstName;
	public String lastName;
	public String score;

	public Student(String firstName, String lastName, String score) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.getFirstName().compareToIgnoreCase(s.getFirstName()) < 0) {
			return -1;
		} else if (this.getFirstName().compareToIgnoreCase(s.getFirstName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
