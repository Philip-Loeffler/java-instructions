
public class contactListApp {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			String firstName = Console.getString("enter first name");
			String lastName = Console.getString("enter last name");
			String email = Console.getString("enter email ");
			String phoneNumber = Console.getString("enter phone Number ");

			// test without object params
			ContactList contactList = new ContactList();
			contactList.setfirstName(firstName);
			contactList.setlastName(lastName);
			contactList.setEmail(email);
			contactList.setPhoneNumber(phoneNumber);

			// test with object params
			ContactList contactListConstructor = new ContactList(firstName, lastName, email, phoneNumber);
			contactListConstructor.setfirstName(firstName);
			contactListConstructor.setlastName(lastName);
			contactListConstructor.setEmail(email);
			contactListConstructor.setPhoneNumber(phoneNumber);

			System.out.println(contactList.getfirstName());
			System.out.println(contactList.getlastName());
			System.out.println(contactList.getEmail());
			System.out.println(contactList.getPhoneNumber());

			System.out.println(contactListConstructor);

			System.out.println(contactListConstructor.getfirstName());
			System.out.println(contactListConstructor.getlastName());
			System.out.println(contactListConstructor.getEmail());
			System.out.println(contactListConstructor.getPhoneNumber());

		}
	}
}
