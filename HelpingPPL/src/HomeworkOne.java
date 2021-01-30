
//Import each required Java program
import java.util.Scanner;

/**
 * HomeworkOne
 */
public class HomeworkOne {

	public static void main(String[] args) {
		// Variables to hold values
		int id = 0;
		double quizOne = 0;
		double quizTwo = 0;
		double quizThree = 0;
		long months = 0;
		int years = 0;
		double tempC = 0;
		double tempF = 0;
		double average = 0;
		char d = '°';
		// Create a new scanner
		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter their EMPLID
		System.out.println("Enter your student EMPLID (0 - 999999): ");
		id = scan.nextInt();
		// Prompt the user to enter their quiz scores
		System.out.println("Enter your quiz 1 percentage score (0.0 - 100.0): ");
		quizOne = scan.nextDouble();

		System.out.println("Enter your quiz 2 percentage score (0.0 - 100.0): ");
		quizTwo = scan.nextDouble();

		System.out.println("Enter your quiz 3 percentage score (0.0 - 100.0): ");
		quizThree = scan.nextDouble();

		average = quizOne + quizTwo + quizThree / 3;

		// Prompt the user to enter their age in months
		System.out.println("What is your age in months (0-1440): ");
		months = scan.nextLong();

		// Prompt the user to enter their age in years

		years = (int) ((months / 12));

		// Prompt the user to enter the current temperature
		System.out.println("What is the current temperature in celsius: ");
		tempC = scan.nextDouble();
		tempF = ((tempC / 5 * 9 + 32));

		System.out.println("***Thank you***");
		System.out.println("Student EMPLID: " + id);
		System.out.println("Quiz 1 Score: " + quizOne);
		System.out.println("Quiz 2 Score: " + quizTwo);
		System.out.println("Quiz 3 Score: " + quizThree);
		System.out.printf("Average quiz score: %.1f\n", average);
		System.out.println("Age in months: " + months);
		System.out.println("Age in years: " + years);
		System.out.println("Temperature in Celsius: " + tempC + "°");
		System.out.printf("Temperature in Farenheit: %.1f%c", tempF, d);

		scan.close();
	}
}
//end class
