import java.util.Scanner;

public class tempperatureConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the temperature converter");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degrees in Fahreneit");
		Double Fahrenheit = sc.nextDouble();
		Double Celcius = (Fahrenheit - 32) * 5 / 9;
		System.out.println("Degrees in Celsius:" + " " + Celcius);

	}

}
