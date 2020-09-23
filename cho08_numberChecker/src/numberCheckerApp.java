
public class numberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the odd/Even checker");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			MyConsole myConsole = new MyConsole();

			int IntInput = myConsole.getInt("enter a number");
			myConsole.setIntInput(IntInput);
			System.out.println(myConsole.getntInput());

			choice = Console.getString("Continue? (y/n): ");
			System.out.println();
		}
	}
}
