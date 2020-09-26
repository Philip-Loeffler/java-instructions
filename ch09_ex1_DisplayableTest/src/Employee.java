public class Employee implements DepartmentConstants, Displayable {

	private int department;
	private String firstName;
	private String lastName;

	public Employee(int department, String lastName, String firstName) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		String dept = "unknown";
		if (department == ADMIN) {
			dept = "ADMINISTRATOR";
		} else if (department == EDITORIAL) {
			dept = "EDITORIAL";
		} else if (department == MARKETING) {
			dept = "MARKETING";
		}
		return firstName + " " + lastName + " (" + dept + ")";
	}
}