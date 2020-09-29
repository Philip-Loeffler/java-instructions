import java.text.NumberFormat;

public class AccountBalanceApp {

	public static void main(String[] args) {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Welcome to the account balance calculator");
		CheckingAccount ca = new CheckingAccount(1000.0, 1.0);
		SavingsAccount sa = new SavingsAccount(1000.0, 1.0);

		System.out.println("starting balance");
		System.out.println("checking" + currencyFormatter.format(ca.getBalance()));
		System.out.println("savings" + currencyFormatter.format(sa.getBalance()));

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String withdrawOrDepoist = Console.getString("withdraw or deposit? (w/d) ");
			String checkingOrSaving = Console.getString("Checking or saving? (c/s) ");
			double amount = Console.getDouble("Amount?: ");

			if (withdrawOrDepoist.equalsIgnoreCase("w")) {
				if (checkingOrSaving.equalsIgnoreCase("c")) {
					withdrawAmount(ca, amount);
				} else {
					withdrawAmount(sa, amount);
				}
			} else {
				if (checkingOrSaving.equalsIgnoreCase("c")) {
					depositAmount(ca, amount);
				}
			}
			System.out.println();
			choice = Console.getString("continue? (y/n)");
		}
		ca.applyMonthlyFee();
		sa.applyMonthlyInterest();

		System.out.println(ca.getMonthlyFee());
		System.out.println(sa.getCalculatedInterest());

	}

	private static void withdrawAmount(Withdrawable w, double amount) {
		w.withdraw(amount);
	}

	private static void depositAmount(Depositable d, double amount) {
		d.deposit(amount);
	}
}
