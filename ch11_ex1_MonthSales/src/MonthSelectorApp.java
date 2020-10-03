import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		// you could create an array length of 12 then put them in, or
		// String[] monthNames = new String[12];

		String[] monthNames = { "jan", "feb", "march" };
		double[] monthSales = { 100.00, 200.01, 300.02 };
		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthNames.length) {
				Console.displayLine("Invalid month number. Try again.");
				continue;
			}

			// get the index number for the month
			// and display the month name and sales
			int monthIndex = monthNumber - 1;
			String monthName = monthNames[monthIndex];
			double salesForMonth = monthSales[monthIndex];

			System.out.println("sales for" + monthName + " " + currency.format(salesForMonth));

			// check if the user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			Console.displayLine();
		}

		double totalSales = 0.0;
		for (int i = 0; i < monthSales.length; i++) {
			totalSales = totalSales + monthSales[i];
		}

		// enhanced for loop, very similar to map in js, sales becomes the new object
//		for (double sales : monthSales) {
//			totalSales += sales;
//		}

		System.out.println("total sales" + currency.format(totalSales));

		// display the total sales for the year

		Console.displayLine();
	}

}
