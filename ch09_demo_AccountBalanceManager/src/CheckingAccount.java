
public class CheckingAccount extends Account {

	private double monthlyFee;

	public CheckingAccount() {
		monthlyFee = 0.0;
	}

	// when you see super you are calling the constructor from base class
	// doing this, means when you call this and pass initalBalance, it will go up
	// into the account class, because of super
	public CheckingAccount(double initalBalance, double monthlyFee) {
		super(initalBalance);
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void applyMonthlyFee() {
		balance -= monthlyFee;
	}
}