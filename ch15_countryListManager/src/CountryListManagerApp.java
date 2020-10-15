import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountryListManagerApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("/Users/philiploeffler/Desktop/CountryListManager");
		Files.createDirectory(path);
		System.out.println("exists return " + Files.exists(path) + " " + "that");

		String fileString = "product.txt";
		Path filePath = Paths.get(fileString);

		DirectoryStream<Path> dirStream = Files.newDirectoryStream(path);
		File productsFile = filePath.toFile();

	}
}
