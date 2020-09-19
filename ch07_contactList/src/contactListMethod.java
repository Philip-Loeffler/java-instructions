
public class contactListMethod {

	public static contactList getContactInput(String inputFirstName, String inputLastName, String inputEmail,
			int inputPhoneNumber) {

		contactList contactList = new contactList();

		contactList.setEmail(inputFirstName);
		contactList.setfirstName(inputLastName);
		contactList.setlastName(inputEmail);
		contactList.setPhoneNumber(inputPhoneNumber);
		return contactList;

	}
}