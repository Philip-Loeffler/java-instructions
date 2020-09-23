
public class ContactList {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public ContactList() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
	}

// use this way, to just pass in the inputs to not need to use the setters 
//	public ContactList("","","","") {
//		this();
//	}
	public ContactList(String firstName, String lastName, String email, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;

	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
