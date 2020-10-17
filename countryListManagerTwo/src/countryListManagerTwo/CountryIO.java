package countryListManagerTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CountryIO {

	private final String countriesFilename = "countries.txt";

	public ArrayList<String> getCountries() {

		ArrayList<String> countries = new ArrayList<>();

		// the in variable is your txt file,
		// then variable reads the lines from your txt file
		// as long as its not null
		// we add can add countries
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFilename))) {
			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			System.err.println("caught IOException.msg" + e.getMessage());
		}
		return countries;
	}

	public boolean saveCountries(ArrayList<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFilename)))) {
			for (String country : countries) {
				out.println(country);
			}
		} catch (IOException e) {
			System.err.println("caught IOException.msg" + e.getMessage());
			return false;
		}
		return true;
	}
}
