import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CountryListManagerApp {

	private final static String inputFileName = "countries.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> Countries = new ArrayList<>();

		System.out.print("command manager");
		System.out.print("1 - list of countries");
		System.out.print("2 - add a country");
		System.out.print("3 - exit");

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
	}

	PrintWriter out = new PrintWriter(new FileWriter(inputFileName));

}

//		int choice = Console.getInt("enter in a number");
//		if (choice == 1) {
//			try {
//				FileReader reader = new FileReader(inputFileName);
//				int character;
//
//				while ((character = reader.read()) != -1) {
//					System.out.print((char) character);
//				}
//				reader.close();
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		int choiceTwo = Console.getInt("enter in a number");
//		if (choiceTwo == 2) {
//			String Country = Console.getString("enter a country");
//			Countries.add(Country);
//
//		}
//	}
//}

//		try (BufferedReader in = new BufferedReader(new FileReader(inputFileName))) {
//			// taking line you just read from the file and putting it into the list
//			String line = in.readLine();
//			while (line != null) {
//				// add is the method in array list to ADD(obvi) into the list
//				lines.add(line);
//				line = in.readLine();
//			}
//		} catch (FileNotFoundException e) {
//			System.err.println("input file" + inputFileName + "not found");
//		} catch (IOException e) {
//			System.err.println("caught IOException. Msg: " + e.getMessage());
//		}
//
//		Path path = Paths.get("/Users/philiploeffler/Desktop/CountryListManager");
//		Files.createDirectory(path);
//		System.out.println("exists return " + Files.exists(path) + " " + "that");
//
//		String fileString = "product.txt";
//		Path filePath = Paths.get(fileString);
//
//		DirectoryStream<Path> dirStream = Files.newDirectoryStream(path);
//		File productsFile = filePath.toFile();
//
//	}
