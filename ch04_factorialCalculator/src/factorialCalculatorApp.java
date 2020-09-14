import java.util.Scanner;

public class factorialCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, fact = 1;
		System.out.println("Welcome to the factorial calculator");
		System.out.println("Enter an integer thats greater than 0 and less than ten");
		int factorial = sc.nextInt();
		if ((factorial > 0) && (factorial < 10)) {
			for (i = 1; i <= factorial; i++) {
				fact = fact * i;
			}

		}
		System.out.println("the factorial of" + factorial + "is" + fact);

	}
}
