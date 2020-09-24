
public class Customer extends Person {

	String customerNumber;

	public Customer(String firstName, String lastName, String customerNumber) {
		// to get the person up to the customer we use the super
		super(firstName, lastName);
		this.customerNumber = customerNumber;

	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + customerNumber;
	}
}