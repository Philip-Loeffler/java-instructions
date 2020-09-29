
public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double calculatedInterest;

	public SavingsAccount() {
		monthlyInterestRate = 0.0;
		calculatedInterest = 0.0;
	}

	// when you see super you are calling the constructor from base class
	// doing this, means when you call this and pass initalBalance, it will go up
	// into the account class, because of super
	public SavingsAccount(double initalBalance, double monthlyInterestRate) {
		super(initalBalance);
		this.monthlyInterestRate = monthlyInterestRate;
		this.calculatedInterest = calculatedInterest;

	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public double getCalculatedInterest() {
		return calculatedInterest;
	}

	public void applyMonthlyInterest() {
		calculatedInterest = balance * monthlyInterestRate / 100.00;
		balance += calculatedInterest;
	}
}