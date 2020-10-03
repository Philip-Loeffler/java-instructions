import java.util.Scanner;

public class BattingStatisticApp {

	public static void main(String[] args) {
		double sluggingAverage = 0;
		double battingAverage = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number between 1-30");
		int num = sc.nextInt();
//		if (num >= 30) {
//			System.out.println("to high! try again");
//		}

		int atBats[] = new int[num];
		int basesEarned = 0;
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun");

		// loops over number input and adds all at bat inputs
		for (int i = 0; i < atBats.length; i++) {
			System.out.print("Enter results at bat ");
			atBats[i] = sc.nextInt();
			basesEarned = basesEarned + atBats[i];
		}
		sluggingAverage = (double) basesEarned / num;
		battingAverage = (double) num / basesEarned;
		System.out.println(basesEarned);
		System.out.println("Batting Average" + battingAverage);
		System.out.println("Slugging Average" + sluggingAverage);

	}
}
