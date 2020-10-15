import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourcesTesterApp {

	public static void main(String[] args) {
		String s1 = readLineWithResources();
		String s2 = readLineWithFinally();
	}

	public static String readLineWithResources() {
		System.out.println("Starting readLineWithResources() method.");

		// if this try is gucci then it will do execute the read line. if it doesnt work
		// then it goes
		// into the catch
		try (BufferedReader in = new BufferedReader(new FileReader("products.txt"))) {
			String s = in.readLine();
			return s;

		} catch (IOException e) {
			System.out.println(e.toString());
			return null;
		}
	}

	public static String readLineWithFinally() {
		System.out.println("Starting readLineWithFinally() method.");
		BufferedReader in = null;

		try {
			in = new BufferedReader(new FileReader("products.txt"));
			String s = in.readLine();
			return s;
		} catch (IOException e) {
			System.out.println(e.toString());
			return null;
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("caught io exception");
				}
			}
		}
	}
}
