import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percentage = NumberFormat.getPercentInstance();
		percentage.setMinimumFractionDigits(3);

		System.out.println("Welcome to the Interest Calculator");
		System.out.println("Enter in loan amount");

		BigDecimal loan = new BigDecimal(sc.next());
		String loanAmount = currency.format(loan);

		System.out.println("Enter in interest rate");

		BigDecimal interest = new BigDecimal(sc.next());
		String interestRate = percentage.format(interest);
		loan = loan.multiply(interest).setScale(2, RoundingMode.HALF_UP);
		String loanformatted = currency.format(loan);

		System.out.println("loan amount" + " " + loanAmount);
		System.out.println("interst rate" + " " + interestRate);
		System.out.println("interest" + " " + loanformatted);
	}

}
