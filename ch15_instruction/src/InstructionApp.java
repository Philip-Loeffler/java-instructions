import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InstructionApp {

	public static void main(String[] args) throws IOException {

		String dirString = "/Users/philiploeffler/Desktop/java/files";
		Path dirPath = Paths.get(dirString);
		System.out.println("exists return " + Files.exists(dirPath) + " " + "that");

		String fileString = "product.txt";
		Path filePath = Paths.get(dirString, fileString);
		System.out.println("exists return " + Files.exists(filePath) + " " + "that");

		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory" + dirPath.toAbsolutePath());
			System.out.println("Files");

			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);

			for (Path p : dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println(p.getFileName());

				}
			}
		}

		Path productsPath = Paths.get("product.txt");
		File productsFile = productsPath.toFile();

		FileWriter fw = new FileWriter(productsFile);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);

		out.println("j\tM\t50.00");

		out.close();

		BufferedReader in = new BufferedReader(new FileReader(productsFile));
		String line = in.readLine();
		System.out.println(line);
		in.close();
	}

}
