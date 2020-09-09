import java.util.Scanner;

public class travelTimeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator");
		hours = (int) Math.round(hours * 10) / 10;
		minutes = (int) Math.round(minutes * 10) / 10;
		System.out.println("Enter miles");
		double miles = sc.nextDouble();
		System.out.println("Enter miles per hour");
		double speed = sc.nextDouble();

		System.out.println("Estimated Travel Time");
		double hours = miles / speed;
		double minutes = miles * speed;

		System.out.println("Hours");
		System.out.println("Minutes");

	}
}
