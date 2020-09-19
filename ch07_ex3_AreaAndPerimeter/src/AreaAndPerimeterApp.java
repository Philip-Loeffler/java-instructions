import java.util.Scanner;

public class AreaAndPerimeterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get input from user
			System.out.print("Enter length: ");
			double length = Double.parseDouble(sc.nextLine());

			System.out.print("Enter width:  ");
			double width = Double.parseDouble(sc.nextLine());

			// calculate total
			Rectangle rectangle = new Rectangle();
			rectangle.setLength(length);
			rectangle.setWidth(width);

			Rectangle rectangle2 = new Rectangle(length, width);

			String message2 = "Area:" + rectangle2.getAreaFormatted() + "\n" + "Perimeter:"
					+ rectangle2.getPermiterFormatted() + "\n";
			System.out.println(message2);

//			String message2 = "Area:" + rectangle.getAreaFormatted() + "\n" + "Perimeter:"
//					+ rectangle.getPermiterFormatted() + "\n";
//			System.out.println(message2);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		System.out.println("Bye!");
	}
}
