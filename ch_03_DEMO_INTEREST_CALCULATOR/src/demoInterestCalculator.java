import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class demoInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to the interest calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount");
			BigDecimal loanAmount = sc.nextBigDecimal();

			System.out.println("Enter InterestRate");
			BigDecimal interesRate = sc.nextBigDecimal();

			BigDecimal interest = loanAmount.multiply(interesRate);
			interest = interest.setScale(2, RoundingMode.HALF_UP);

			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			percentFormatter.setMaximumFractionDigits(3);

			String loanAmountStr = currencyFormatter.format(loanAmount);
			String interestRateStr = percentFormatter.format(interesRate);
			String interestStr = currencyFormatter.format(interest);

			String outputMessage = "loan Amount :" + loanAmountStr + "\n" + "Interest Rate :" + interestRateStr + "\n"
					+ "Interest :" + interestStr + "\n";

			System.out.println(outputMessage);

			System.out.println("continue? (y/) ");
			choice = sc.next();

		}

		System.out.println("Bye");
	}
}
