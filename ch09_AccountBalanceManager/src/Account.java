
public class Account implements Balanceable, Withdrawable, Depositable {

	Double balance;

	@Override
	public void withdraw(double amt) {
		balance = -amt;
		if (amt > balance)
			System.out.println("amount exceeds balance");
		else
			balance -= amt; // same as balance = balance - amt

	}

	@Override
	public void deposit(double amt) {
		balance += amt;

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double amt) {
		this.balance = amt;
	}

}
