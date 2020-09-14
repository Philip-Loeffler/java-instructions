import java.util.Scanner;

public class guessingGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = 100;
		double rand1 = Math.random() * limit;
		int randomNumber = (int) rand1;
		System.out.print("Welcome to the guess the number game");
		System.out.print("+++++++++++++++++++++++++++++++++++++");

		System.out.print("I'm thinking of a number between 1 and 100");
		System.out.print("try to guess it ");
		int guess = sc.nextInt();
		int numberOfGuesses = guess;

		if (numberOfGuesses <= 3) {
			numberComparer(randomNumber, guess, numberOfGuesses);
			goodJobMessage();
		} else if ((numberOfGuesses > 3) && (numberOfGuesses <= 7)) {
			numberComparer(randomNumber, guess, numberOfGuesses);
			notToBadMessage();
		} else {
			numberComparer(randomNumber, guess, numberOfGuesses);
			lessonsMessage();
		}
	}

	public static void goodJobMessage() {
		System.out.print("great job! you're a mathematical wizard");
	}

	public static void notToBadMessage() {
		System.out.print("Not too bad! You've got some potential.");
	}

	public static void lessonsMessage() {
		System.out.print("What took you so long? Maybe you should take some lessons");
	}

	public static int numberComparer(int randomNumber, int guessedNumber, int numberOfGuesses) {
		if (guessedNumber > randomNumber) {
			System.out.print("Way to high! guess Again");
		} else if (guessedNumber < randomNumber) {
			System.out.print("too low! guess again");
		} else if (guessedNumber < randomNumber) {
			System.out.print("not bad! you got it in" + numberOfGuesses);
		}
		return numberOfGuesses;
	}
}
