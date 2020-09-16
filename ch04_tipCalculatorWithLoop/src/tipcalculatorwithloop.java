import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class tipcalculatorwithloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tip calculator\n");

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		String choice;
		do {
			System.out.println("cost of meal:");
			BigDecimal cost = sc.nextBigDecimal();
			BigDecimal tipIncrement = new BigDecimal("0.05");
			BigDecimal tipPercent = new BigDecimal("0.15");

			for (int i = 0; i < 3; ++i) {
				// calculate tip and total
				BigDecimal tipAmount = cost.multiply(tipPercent);
				BigDecimal totalCost = cost.add(tipAmount);

				System.out.println(percent.format(tipPercent));
				System.out.println("tip amount" + currency.format(tipAmount));
				System.out.println("total amount" + currency.format(totalCost));

				// increment to next tip amount
				tipPercent = tipPercent.add(tipIncrement);
			}
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));

	}

}
