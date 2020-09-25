
public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the person manager");
		String choice = Console.getString("enter c for customer e for employee");

		if (choice.equalsIgnoreCase("c")) {
			Customer newCustomer = customerInput();
			System.out.println(newCustomer.toString());

		} else if (choice.equalsIgnoreCase("e")) {
			Employee newEmployee = employeeInput();
			System.out.println(newEmployee.toString());

		} else {
			System.out.println("sorry wrong input");
		}

	}

	public static Customer customerInput() {
		String firstName = Console.getString("enter customer first name");
		String lastName = Console.getString("enter customer last name");
		String CustomerNumber = Console.getString("enter customer number");
		Customer customer = new Customer(firstName, lastName, CustomerNumber);
		System.out.println("you entered in a new customer");
		return customer;

	}

	public static Employee employeeInput() {
		String firstName = Console.getString("enter employee first name");
		String lastName = Console.getString("enter employee last name");
		String ssn = Console.getString("enter ssn number");
		Employee employee = new Employee(firstName, lastName, ssn);
		return employee;

	}

}
