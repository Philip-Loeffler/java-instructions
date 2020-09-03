import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gradeA = "A";
		String gradeB = "B";
		String gradeC = "C";
		String gradeD = "D";
		String gradeF = "F";

		//could also do this String LetterGrade = ""
		//then define letter grade as lettergrade = "A" after one of the ifs

		System.out.println("Welcome to the letter grade converter");
        String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("enter a numerical grade:");
		int numericalGrade = sc.nextInt();
		if(numericalGrade >= 88) {
			System.out.println("letter grade:" + " " + gradeA);	
		} else if(numericalGrade >= 80) {
			System.out.println("letter grade:" + " " + gradeB);
		}  else if(numericalGrade >= 67) {
			System.out.println("letter grade:" + " " + gradeC);
		} else if(numericalGrade >=61) {
			System.out.println("letter grade:" + " " + gradeD);
		} else {
			System.out.println("letter grade:" + " " + gradeF);
		}
		 System.out.print("Continue? (y/n): ");
         choice = sc.next();
         System.out.println();
		
	}
		System.out.println("bye");
	}
}
		
		
	


