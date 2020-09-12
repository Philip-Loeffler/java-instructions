public class chapter4insttructionapp {

	public static void main(String[] args) {
		double discountPercent = 0.05;
		double subtotal = 317.0;
		if (subtotal >= 100) {
			discountPercent = 0.01;
		} else if (subtotal >= 200.0) {
			discountPercent = 0.2;
		}
		// since the statement is true, discount percent should go to one
		// once you hit one a true statement, the code is done
		System.out.println("discountPercent = " + discountPercent);

		// statement

		String productCode = "hm01";
		String productDescription;

		if (productCode.equals("hm01")) {
			productDescription = "hammer";
		} else if (productCode.equals("hm01")) {
			productDescription = "box of nails";
		} else {
			productDescription = "product not found";
		}

		System.out.println(productDescription);

		// same code, but a switch statement
		switch (productCode) {
		case "hm01":
			// having a second case here is an applied 'or'
		case "hm02":
			productDescription = "hammer";
			break;
		case "bn03":
			productDescription = "box of nails";
			break;
		default:
			productDescription = "product not found";
			break;
		}

		// a switch with an if statement as well
		String customerType = "r";
		double subtotal1 = 50.0;
		double discountPercent1 = 0.0;

		switch (customerType) {
		case "r":
		case "R":
			if (subtotal1 < 100) {
				discountPercent1 = 0.0;
			} else if (subtotal1 >= 100 && subtotal1 < 250) {
				discountPercent1 = 0.1;
			} else if (subtotal1 >= 250.00) {
				discountPercent1 = 0.2;
			}
			break;
		case "c":
		case "C":
			if (subtotal1 < 250) {
				discountPercent1 = 0.2;
			} else if (subtotal1 >= 250) {
				discountPercent1 = 0.3;
			}
			break;
		default:
			discountPercent1 = 0.1;
		}
	}
}

////		 do while 
//	Scanner sc = new Scanner(System.in);
//	String word;
//
//	do
//	{
//		System.out.print("Say the magic word: ");
//		word = sc.next();
//	}while(!word.equalsIgnoreCase("please"));System.out.print("thankyou");
//}
