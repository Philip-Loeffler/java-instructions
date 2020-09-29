
public class AccountBalanceCalculator {

	public static void main(String[] args) {

		CheckingAccount ca = new CheckingAccount(1000);
		SavingsAccount sa = new SavingsAccount(1000);
		System.out.println("Checking: " + ca.getBalance());
		System.out.println("Savings: " + sa.getBalance());
		String choice = Console.getString("Withdrawl or deposit");
		CheckingAccount checkingAccount = new CheckingAccount(0);

		String transType = Console.getString("Withdraw or Deposit (w/d)?");
		String acctType = Console.getString("Checking or Savings?");
		Double amount = Console.getDouble("Amount");

		// here you can initialize what type of acct based on user input
		Account acct = null;
		if (acctType.equalsIgnoreCase("c"))
			acct = ca;
		else if (acctType.equalsIgnoreCase("s"))
			acct = sa;

		if (transType.equalsIgnoreCase("w"))
			acct.withdraw(amount);
		else if (transType.equalsIgnoreCase("d"))
			;
		acct.deposit(amount);
	}

}
