package ch11_02_studentScores;

import java.util.Scanner;

public class studentScoresApp {

	public static void main(String[] args) {
		String firstName = null;
		String lastName = null;
		int score = 0;
		Student student = new Student(firstName, lastName, score);
		System.out.println("the student score application");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter in number of students");

		int num = sc.nextInt();
		Student[] arrayOfStudents = new Student[num];

		for (int i = 0; i < arrayOfStudents.length; i++) {
			System.out.println("set students firs name");
			String studentFirstName = sc.nextLine();
			arrayOfStudents[i] = student;
			student.setFirstName(studentFirstName);

			System.out.println("set students last Name");
			String studentLastName = sc.nextLine();
			arrayOfStudents[i] = student;
			student.setLastName(studentLastName);

			System.out.println("set students score");
			int studentScore = sc.nextInt();
			arrayOfStudents[i] = student;
			student.setScore(studentScore);

			arrayOfStudents[i] = new Student(studentFirstName, studentLastName, studentScore);

		}

		System.out.println(student.getFirstName() + student.getLastName() + student.getScore());

	}

}
