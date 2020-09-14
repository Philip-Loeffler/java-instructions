package tippingCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class tippingCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal fifteenPercent = new BigDecimal("0.15");
		BigDecimal twentyPercent = new BigDecimal("0.20");
		BigDecimal twentyFivePercent = new BigDecimal("0.25");

		System.out.print("Tip calculator");
		System.out.print("cost of meal");
		BigDecimal costOfMeal = sc.nextBigDecimal();

		BigDecimal fifteenPercentDiscount = costOfMeal.multiply(fifteenPercent);
		fifteenPercentDiscount = fifteenPercentDiscount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal fifteenTotalAmount = costOfMeal.add(fifteenPercentDiscount);

		BigDecimal twentyPercentDiscount = costOfMeal.multiply(twentyPercent);
		twentyPercentDiscount = twentyPercentDiscount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal twentyTotalAmount = costOfMeal.add(twentyPercentDiscount);

		BigDecimal twentyFivePercentDiscount = costOfMeal.multiply(twentyFivePercent);
		twentyFivePercentDiscount = twentyFivePercentDiscount.setScale(2, RoundingMode.HALF_UP);
		BigDecimal twentyFiveTotalAmount = costOfMeal.add(twentyFivePercentDiscount);

		System.out.println("15%");
		System.out.println("tip amount" + fifteenPercentDiscount);
		System.out.print("total amount" + fifteenTotalAmount);

		System.out.println("20%");
		System.out.println("tip amount" + twentyPercentDiscount);
		System.out.println("total amount" + twentyTotalAmount);

		System.out.println("25%");
		System.out.println("tip amount" + twentyFivePercentDiscount);
		System.out.println("total amount" + twentyFiveTotalAmount);

	}

}
