import java.util.Scanner;

public class changeCalculatorApp {

	public static void main(String[] args) {
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKLE = 5;

		System.out.println("Welcome to the change calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("enter number of cents (0-99)");
			int cents = sc.nextInt();

			int numQuarters = cents / CENTS_PER_QUARTER;
			// how many cents can be left over
			cents %= CENTS_PER_QUARTER;

			int numDime = cents / CENTS_PER_DIME;
			cents %= CENTS_PER_DIME;

			int numNickles = cents / CENTS_PER_NICKLE;
			cents %= CENTS_PER_NICKLE;

			int numPennies = cents;

			System.out.println(numQuarters);
			System.out.println(numDime);
			System.out.println(numNickles);
			System.out.println(numPennies);

			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();

		}

		System.out.println("bye");
	}

}
