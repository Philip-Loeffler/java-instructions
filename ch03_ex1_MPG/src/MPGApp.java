import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Miles Per Gallon calculator");
		System.out.println(); // print a blank line

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles driven: ");
			double miles = sc.nextDouble();

			System.out.print("Enter gallons of gas used: ");
			double gallons = sc.nextDouble();

//			code for steps 3, 4, 5
//			double mpg = Math.round(miles / gallons);
//			mpg = (double) Math.round(mpg * 100) / 100;
//			System.out.println("Miles per gallon is " + mpg + ".");
//			
//			done with big decimal
//			BigDecimal milesBigDec = new BigDecimal(miles);
//			BigDecimal gallonsBigDec = new BigDecimal(gallons);
//			BigDecimal mpgBigDec = milesBigDec.divide(gallonsBigDec, 2, RoundingMode.HALF_UP);
//			System.out.println("Miles per gallon is " + mpgBigDec + ".");

			double mpg = miles / gallons;
			NumberFormat mpgFormatter = NumberFormat.getNumberInstance();
			mpgFormatter.setMaximumFractionDigits(3);
			String mpgFormatted = mpgFormatter.format(mpg);
			System.out.println("Miles per gallon is " + mpgFormatted + ".");
			System.out.println();

			System.out.print("Calculate another MPG? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}
