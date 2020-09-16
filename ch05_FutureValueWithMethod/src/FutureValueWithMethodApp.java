import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueWithMethodApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			double monthlyInvestment;
			double interestRate;
			int years;

			// get the input from the user

			monthlyInvestment = getDouble(sc, "enter Monthly Investment");
			interestRate = getDouble(sc, "enter yearly interest rate:");
			years = getInt(sc, "Enter number of years");
			double monthInvestment = getDoubleWithinRange(sc, "enter monthly invest" + 0, 1000);
			// continue takes you to the top of the current loop

			// convert yearly values to monthly values
			double monthlyInterestRate = interestRate / 12 / 100;
			int months = years * 12;

			// call the future value method
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			// format and display the result
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value:               " + currency.format(futureValue));
			System.out.println();

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}

	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0.0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}
		return futureValue;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double retVal = 0.0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);

			if (sc.hasNextDouble()) {
				retVal = sc.nextDouble();
				isValid = true;
				sc.nextLine();
			} else {
				System.out.println("invalid decimal number");
				sc.nextLine();
			}
		}
		return retVal;
	}

	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0.0;
		boolean isValid = false;

		while (!isValid) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("error");
			} else if (d >= max) {
				System.out.println("error");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static int getInt(Scanner sc, String prompt) {
		int retVal = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);

			if (sc.hasNextInt()) {
				retVal = sc.nextInt();
				isValid = true;
				sc.nextLine();
			} else {
				System.out.println("invalid int");
				sc.nextLine();
			}
		}
		return retVal;
	}
}
