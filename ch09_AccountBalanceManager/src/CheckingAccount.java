
public class CheckingAccount extends Account {

	private double monthlyFee;

	public CheckingAccount(double balance) {
		setBalance(balance);
		this.monthlyFee = 1;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public void eductMonthlyFee() { // creating a method
		balance -= monthlyFee;

	}
}
