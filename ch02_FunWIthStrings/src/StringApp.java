import java.util.Scanner;

public class StringApp {

	public static void main(String[] args) {
		System.out.println("Welcomes to the string app!");

		String firstName = "bob";
		String lastName = "Marley";
		
		//this is a string literal
		System.out.println("hello, " + firstName + " " + lastName);
		
		
		String fullName = firstName;
		fullName = fullName + " ";
		//compound assignment
		// plus equals, taking what full name was, and appending lastName to it. 
		fullName += lastName;
		//escape sequence, \n new lines
		System.out.println("this is a sentence that\n" + "is on two lines" );

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter a sentence:  ");
		String sentence = sc.nextLine();
		System.out.println("you entered: "+ sentence);
		
		System.out.println("Enter a name: ");
		// need to declare variable and store it in it 
		String name = sc.next();
		System.out.println("you entered"  + " " + name);
		
		// get numbers from users 
		System.out.println("enter a whole number: ");
		int number = sc.nextInt();
		System.out.println("you entered" + " " + number);
		
		System.out.println("enter a decimal number: ");
		double d = sc.nextDouble();
		System.out.println("you entered" + " " + number);
		
		// use relational operators
		//if this condition is true, do what is inside these curly braces
		if (number > 10) {
			System.out.println("number is greater than ten!");
		}
		
		
		
		
		

		
		System.out.println("BYE");

	}

}
