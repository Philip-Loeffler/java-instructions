import java.util.Scanner;

public class BattingStatisticApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		int resultsAtBatNum[] = new int[num];
		int atBats = 0;
//		for (int i = 0; i < num; i++) {
//			System.out.println("Enter results at bat");
//			int resultsAtBat = sc.nextInt();
//			resultsAtBatNum = new int[resultsAtBat];
//		}

		for (int i = 0; i < resultsAtBatNum.length; i++) {
			System.out.println("Enter results at bat");
			resultsAtBatNum[i] = sc.nextInt();
			atBats = atBats + resultsAtBatNum[i];
		}

		System.out.println(atBats);
		System.out.println("Batting Average");
		System.out.println("Slugging Average");

	}
}
