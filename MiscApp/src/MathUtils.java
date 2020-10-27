
public class MathUtils {

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b, int c) {
		return a < b ? a : b;
	}

	// saying we are passing 0 to many ints into this
	public static int sum(int... values) {
		System.out.println(values.length);
		return 0;
	}

	public static int power(int value, int raiseTo) {
		int result = value;
		for (int i = 1; i <= raiseTo; i++) {
			result *= result;
		}
		return result;
	}
}
