import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCleanerApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create prospect file
		PrintWriter writerCsvFile = new PrintWriter(new File("prospect.csv"));
		// create path and store in string
		Path pathToCsv = Paths.get("prospect.csv");
		File fileCsv = pathToCsv.toFile();
		// write data to the stream
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileCsv)));
		out.println("firstName\tlastName\temail");
		out.println("phil\tloeffler\tphiliploeffler@gmail.com");
		out.close();
		// Read line from file to console
		BufferedReader in = new BufferedReader(new FileReader(fileCsv));
		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();

	}
}

// create stream to send file to a new file
