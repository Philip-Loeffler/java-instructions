import java.util.Scanner;

public class diceRollerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("roll the dice?");
		int limit = 6;

		double rand1 = Math.random() * limit;
		double rand2 = Math.random() * limit;
		int dice1 = (int) rand1;
		int dice2 = (int) rand2;
		int total = 0;
		total = dice1 + dice2;

		if (total == 12) {
			System.out.println("box cars!");
		} else if (total == 2) {
			System.out.println("snake eyes");
		}
		System.out.println("die 1:" + dice1);
		System.out.println("die 2:" + dice2);
		System.out.println("total:" + total);
		;
	}
}
