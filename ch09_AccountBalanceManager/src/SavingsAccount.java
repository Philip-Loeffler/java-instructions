
public class SavingsAccount extends Account {

	double monthlyInterestRate;
	double monthlyInterestPayment;

	public SavingsAccount(double balance) {
		setBalance(balance);
		this.monthlyInterestRate = 0.1;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}

}
