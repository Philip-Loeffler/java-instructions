import java.util.Scanner;

public class diceRollerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("roll the dice?");
		int limit = 6;
// need to make sure to check for only returning between certain numbers 
		// this one will not return a 0
		int dieRoll = (int) (Math.random() * 6 + 1);
		// this will return a zero
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

	}
}
// getting your two dice with a method
//	int dice1 = getDiceRoll;
//	int dice2 = getDiceRoll;
//}	
//	private static int getDiceRoll() {
//		int diceRoll = (int)(Math.random() + 6 + 1);
//		return diceRoll;
//		
//	}
//}
