import java.util.Arrays;

public class SortedCustomersApp {

	public static void main(String[] args) {

		Customer[] c = new Customer[3];
		c[0] = new Customer("philiploeffler@gmail.com", "philip", "loeffler");
		c[1] = new Customer("hannahDahlby@gmail.com", "hannah", "dahlby");
		c[2] = new Customer("lori@gmail.com", "lori", "the dog");

		Arrays.sort(c);
		for (Customer cust : c) {
			System.out.println(cust.toString());
		}

	}
}
