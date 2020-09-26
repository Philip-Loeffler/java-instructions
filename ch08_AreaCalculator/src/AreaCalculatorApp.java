
public class AreaCalculatorApp {

	private static void printArea(String shapeName, Shape shape) {
		System.out.println("the area of the" + shapeName + "you entered is" + shape.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String csr = Console.getString("Calculate are of a cirlce, square or rectangle? (c/s/r");

			switch (csr) {
			case "c":
			case "C":
				double radius = Console.getDouble("enter radius: ");
				Circle circle = new Circle(radius);
				System.out.println("the are of the circle you entered is" + circle.getArea());
				printArea("circle", circle);
				break;
			case "s":
			case "S":
				double squareWidth = Console.getDouble("enter width: ");
				Square square = new Square(squareWidth);
				System.out.println("the are of the circle you entered is" + square.getArea());
				printArea("circle", square);

				break;
			case "r":
			case "R":
				double rectangleWidth = Console.getDouble("enter width: ");
				double height = Console.getDouble("enter height: ");
				Rectangle rectangle = new Rectangle(rectangleWidth, height);
				System.out.println("the area of the circle you entered is" + rectangle.getArea());
				printArea("circle", rectangle);

				break;
			}
			choice = Console.getString("Continue? (y/n)");
		}
	}

}
