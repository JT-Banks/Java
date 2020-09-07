package email;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first name of employee");
		String input = in.nextLine();
		System.out.println("Please enter last name of employee");
		String input2 = in.nextLine();
		set em1 = new set(input, input2);
		System.out.println("Would you like to set an alternative email? Y/N");
		String altEmail = in.nextLine().toLowerCase();
			if(altEmail.equals("y")) {
				System.out.println("Please enter alternative email for " + input + " " + input2);
				String altEmailInput = in.nextLine();
				em1.setAlternateEmail(altEmailInput);
				System.out.println("Success!\n\nYou have set the alternative email as: " + altEmailInput);
		}
		System.out.println("\nWould you like to change the password for " +input + " " + input2 + "? Y/N");
		String userInput = in.nextLine().toLowerCase();
			if(userInput.equals("y")) {
				System.out.println("Please type new password now");
				String newPassword = in.nextLine();
				em1.changePassword(newPassword);
			}
				System.out.println("\nPress P to print info of employee to screen, any other key will exit.");
				String print = in.nextLine().toLowerCase();
			if(print.equals("p")) {
				System.out.println(em1.printInfo());
			}
		System.out.println("\nGoodbye, and thank you for using Sparx Systems!"); 
		in.close();
	}
}
