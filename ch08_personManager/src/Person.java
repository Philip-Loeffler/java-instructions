public class Person {
	// fields
	private String firstName;
	private String lastName;

	// constructors
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getters and setters
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

	// overrides
	@Override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName;
	}
}