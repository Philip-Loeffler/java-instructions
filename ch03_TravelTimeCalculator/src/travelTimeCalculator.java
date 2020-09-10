import java.util.Scanner;

public class travelTimeCalculator {

	public static void main(String[] args) {
		final int MINUTES_PER_HOUR = 60;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator");

		System.out.println("Enter miles");
		double miles = sc.nextDouble();
		System.out.println("Enter miles per hour");
		double mph = sc.nextDouble();

		int hours = (int) (miles / mph);
		double milesRemaining = hours % mph;
		int minutes = (int) ((milesRemaining / mph * MINUTES_PER_HOUR) % MINUTES_PER_HOUR);

		System.out.println("Estimated Travel Time");

		System.out.println("Hours" + hours);
		System.out.println("Minutes" + minutes);

	}
}
