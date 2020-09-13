import java.util.Scanner;

public class tableOfPowersApp {

	public static void main(String[] args) {

		int squared = 0;
		int cubed = 0;
		int numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the squares and cubes table");
		System.out.println("enter and integer");
		int integer = sc.nextInt();
		// correct logic need to format
		for (int i = 0; i < integer; i++) {
			System.out.println("numbers" + " " + i + "\t");
			squared = i * i;
			System.out.println("square" + " " + squared + "\t");
			cubed = i * i * i;
			System.out.println("cubed" + " " + cubed + "\t");
		}

	}
}
