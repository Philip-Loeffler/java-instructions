import java.math.BigDecimal;
import java.text.NumberFormat;

public class instructionApp {

	public static void main(String[] args) {
		// final is the const of java
		final int lastDayOfDecember = 31;

		int x = 7;
		int y = 3;

		// modules is going to see how many times 3 goes into seven
		int remainder = x % y;
		System.out.println(remainder);

		int divResult = x / y;
		System.out.println(divResult);

		// unary operator
		// post increment is used much more
		int a = 10;
		a++;
		// 10 will be 11
		// putting the unary before means its a preincrement. so a will increment first
		// then be assigned to b
		int b = ++a;
		// opposed to this
		int q = a++;

		// will print out d
		char letter1 = 'C';
		letter1++;
		System.out.println(letter1);

		// compound operators
		int number = 5;
		// will add three into our number variable
		number += 3;

		// arthimetic
		double curval = 5000;
		double monthlyInv = 100.00;
		double yearlyIntRate = 0.12;

		curval = curval + monthlyInv * 1 + yearlyIntRate / 12;
		// this will print out one, so you need to do something like this
		// order of precedence
		curval = (curval + monthlyInv) * (1 + yearlyIntRate / 12);

		int nums = Integer.parseInt("1090920920909");
		System.out.println(nums);

		double xx = 10.315;
		// treat this like a double, and then you'll get the decimals in it
		xx = (double) Math.round(x * 100) / 100;

		// perfomatter becomes and instance of number format, then you can call the
		// format method on it
		double percent = 0.505;
		NumberFormat perFormatter = NumberFormat.getPercentInstance();
		String formattedPercent = perFormatter.format(percent);
		System.out.println(formattedPercent);

		BigDecimal myBD = new BigDecimal(56.0);
		BigDecimal pi = new BigDecimal(3.1459);
		myBD = myBD.add(pi);

	}

}
