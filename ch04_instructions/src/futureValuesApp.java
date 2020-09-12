import java.text.NumberFormat;

public class futureValuesApp {

	public static void main(String[] args) {
		// get formatter
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(1);

		// set and display month payment
		int monthlyInvestment = 100;
		System.out.println("monthly investment:" + currency.format(monthlyInvestment) + "\n");

		// create header and add to the table string, will hold all values
		String table = "";
		String headerRow = "year        ";

		for (double rate = 5.0; rate < 7.0; rate += 0.5) {
			headerRow += percent.format(rate / 100) + "     ";
		}
		table += headerRow + "\n";
		System.out.println(table);

		for (int year = 1; year < 7; year++) {
			// add year to the start of the row
			String row = year + "      ";

			for (double rate = 5.0; rate < 7.0; rate += 0.5) {
				int months = year * 12;
				double monthlyInterstRate = rate / 12 / 100;
				double futureValue = 0.0;

				for (int i = 1; i <= months; i++) {
					futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterstRate);
				}
				row += currency.format(futureValue) + "        ";
			}
		}
	}
}
