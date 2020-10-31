import java.util.ArrayList;
import java.util.List;

public class LengthConverterApp {

	public static void main(String[] args) {

		List<Conversion> conversions = new ArrayList<>();
		conversions.add(new Conversion("miles", 0.0, "kilometers", 1.6093));
		conversions.add(new Conversion("kilometers", 0.0, "miles", 0.6214));
		conversions.add(new Conversion("inches", 0.0, "centimeters", 2.14));

		System.out.println("length converter");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int action = getUserAction();

			switch (action) {
			case 1:
				doConversion(conversions);
				break;
			case 2:
				addConversion(conversions);
				break;
			case 3:
				deleteConversion(conversions);
				break;
//			case 4:
//				doConversion();

			}

			choice = Console.getString("continue (y/n)");
		}
	}

	private static int getUserAction() {
		System.out.println("1- convert a length");
		System.out.println("2- add a conversion");
		System.out.println("3- delete conversion");
		System.out.println("4- exit");
		return Console.getInt("enter a menu number");

	}

	private static void doConversion(List<Conversion> conversions) {
		int counter = 1;
		for (Conversion conversion : conversions) {
			System.out.println(counter + " - " + conversion);
			counter++;
		}
		int conversionNum = Console.getInt("enter converstion number");
		if (conversionNum < 1 || conversionNum > conversions.size()) {
			System.out.println("invalid number");
			return;
		}
		// Decrement a conversionNum to make it zero-based;
		conversionNum--;
		Conversion con = conversions.get(conversionNum);

		double fromValue = Console.getDouble("enter" + con.getFromUnit() + ":");
		con.setFromValue(fromValue);
		System.out.print(con.getFromValue() + " " + con.getFromUnit() + " " + con.getToValue() + " " + con.getToUnit());

	}

	private static void addConversion(List<Conversion> conversions) {
		String getFromUser = Console.getString("enter from unit");
		String getToUser = Console.getString("get to unit");
		double conversionRation = Console.getDouble("Enter the conversion ratio");
		if (conversions.add(new Conversion(getFromUser, 0.0, getToUser, conversionRation))) {
			System.out.println("this entry has been saved");
		} else {
			System.out.println("entry not saved");
		}

	}

	private static void deleteConversion(List<Conversion> conversions) {
		int counter = 1;
		for (Conversion conversion : conversions) {
			System.out.println(counter + " - " + conversion);
			counter++;
		}

		int deleteConversion = Console.getInt("select conversion number to delete");
		if (deleteConversion < 1 || deleteConversion > conversions.size()) {
			System.out.println("invalid number");
			return;
		}
		Conversion removedCon = conversions.remove(deleteConversion - 1);
		System.out.println("removed conversion!" + removedCon);

	}

}
