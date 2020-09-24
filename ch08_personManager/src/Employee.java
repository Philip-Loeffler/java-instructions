
public class Employee extends Person {

	private String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
		// TODO Auto-generated constructor stub
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		String maskedSsn = "xxx-xxxx" + ssn.substring(ssn.length() - 4);

		return super.toString() + "\nSSn: " + maskedSsn;
	}
}
