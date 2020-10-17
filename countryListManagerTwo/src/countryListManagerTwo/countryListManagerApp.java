package countryListManagerTwo;

import java.util.ArrayList;

public class countryListManagerApp {

	public static void main(String[] args) {

		CountryIO countriesIO = new CountryIO();

		System.out.println("Country list manager");
		System.out.println();
		System.out.println("Command menu");
		System.out.println("1 - list countries");
		System.out.println("2 - add country");
		System.out.println("3 exit");

		int command = 0;
		while (command != 3) {
			command = Console.getInt("enter menu number");

			if (command == 1) {
				// calling the get countries method from our class
				// and storing it in a new list
				// the class already handles showing the countries
				ArrayList<String> countries = countriesIO.getCountries();
				for (String country : countries) {
					System.out.println(country);
				}
			} else if (command == 2) {
				String newCountry = Console.getString("enter Country");
				// this is giving you back the list of countries from io
				// which you apprently need to do first
				ArrayList<String> countries = countriesIO.getCountries();
				countries.add(newCountry);
				if (countriesIO.saveCountries(countries)) {
					System.out.println("this country has been saved");
				}

			}
		}

	}

}
