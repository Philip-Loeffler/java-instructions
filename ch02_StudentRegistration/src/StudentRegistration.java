import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Registration Form \n");

		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		System.out.println("Enter year of birth");
		int birthYear = sc.nextInt();

		
		System.out.println("Welcome" + " " + firstName + " " + lastName);
		System.out.println("your registration is complete");
		System.out.println("your temporary password is:" + " " + firstName + "*" + birthYear);
	}
}
