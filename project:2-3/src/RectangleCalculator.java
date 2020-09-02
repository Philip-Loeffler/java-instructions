import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Area and Perimeter app");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("enter length: \n");
			double length =	sc.nextDouble();
			System.out.println("enter width: \n");
			double width =	sc.nextDouble();
			double area = length * width;
			double perimeter = length * 2 + width * 2;
			System.out.println("area: " + " " + area);
			System.out.println("perimeter: " + " " + perimeter);			
		}
		System.out.println("would you like to continue (y\n)");
		choice = sc.nextLine();
	}
}
