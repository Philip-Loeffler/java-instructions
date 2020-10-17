import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCleanerApp {

	private static final String inputFileName = "prospect.csv";
	private static final String outputFileName = "prospect_clean.csv";

	public static void main(String[] args) {

		System.out.println("file cleaner");
		System.out.println();
		// you make the array list so you can read all of the files and then store then
		// into an arraylist
		// read the input file into a List of Strings
		List<String> lines = new ArrayList<>();

		try (BufferedReader in = new BufferedReader(new FileReader(inputFileName))) {
			// taking line you just read from the file and putting it into the list
			String line = in.readLine();
			while (line != null) {
				// add is the method in array list to ADD(obvi) into the list
				lines.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("input file" + inputFileName + "not found");
		} catch (IOException e) {
			System.err.println("caught IOException. Msg: " + e.getMessage());
		}

		List<Prospect> prospects = new ArrayList<>();
		// iterate through each line in lines collection
		// we make a new prospect
		for (String line : lines) {
			Prospect prospect = createProspect(line);
			prospects.add(prospect);
		}

		// write the email recipient to the output file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)))) {
			// iterate through all prospects and write them to the file
			for (Prospect p : prospects) {
				out.print(p.getFirstName());
				out.print(",");
				out.print(p.getLastName());
				out.print(",");
				out.println(p.getEmail());
			}
		} catch (FileNotFoundException e) {
			System.err.println("input file" + outputFileName + "not found");
		} catch (IOException e) {
			System.err.println("caught IOException. Msg: " + e.getMessage());
		}

		// cleans and convert Strings to emailRecipients
	}

	// write the email recipients to the output file
	public static Prospect createProspect(String csvStr) {
		String[] nameParts = csvStr.split(",");

		String emailAddress = nameParts[2].toLowerCase();
		String firstName = convertToTitleCase(nameParts[0]);
		String lastName = convertToTitleCase(nameParts[1]);

		Prospect prospect = new Prospect(firstName, lastName, emailAddress);

		return prospect;
	}

	public static String convertToTitleCase(String inputStr) {
		String firstNameTrimmed = inputStr.trim();
		String nameFirstLetter = firstNameTrimmed.substring(0, 1);
		nameFirstLetter = nameFirstLetter.toUpperCase();

		String nameAfterFirstLetter = firstNameTrimmed.substring(1);
		nameAfterFirstLetter = nameAfterFirstLetter.toLowerCase();

		String titleCaseName = nameFirstLetter + nameAfterFirstLetter;

		return titleCaseName;
	}
}
