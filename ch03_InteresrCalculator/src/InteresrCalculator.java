import java.math.BigDecimal;
import java.util.Scanner;

public class InteresrCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Interest Calculator");
		System.out.println("Enter loan amount");
		System.out.println("Enter Interest Rate");
		int interestRate = sc.nextInt();
		int loanAmount = sc.nextInt();

		BigDecimal interestRateBD = new BigDecimal(interestRate);
		BigDecimal loanAmountBD = new BigDecimal(loanAmount);
		BigDecimal finalRateBD = interestRateBD.multiply(loanAmountBD);
		System.out.println("interest:" + " " + finalRateBD);

		// interest is loan x interest rate

	}

}
