
public class MiscApp {

	public static void main(String[] args) {

		int value1 = 10;
		int value2 = 20;

		int min;
		if (value1 < value2) {
			min = value1;
		} else {
			min = value2;
		}

		min = value1 < value2 ? value1 : value2;

		System.out.println(min);

	}

}
