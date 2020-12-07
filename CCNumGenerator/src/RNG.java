//Bank card Random number Generator
import java.util.Scanner; 
public class RNG {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num1; //2nd set of 4 numbers
		int num2; //3rd set of 4 numbers
		int num3; //4th set of 4 numbers
		int sum = 0;
		int userInput; //1st set of 4 numbers from user
		int userCards; //Declaring how many cards

		//Gets value for the loop, to determine how many times it will generate valid cards
		System.out.println("How many cards would you like to enter? \n"); 
		userCards = in.nextInt();		
		System.out.print("Enter the first four digits of your credit card number.\n"); 
		userInput = in.nextInt(); 
		//If user input 4 digits only, falls out and prompts next segment
		while (userInput < 0 || userInput > 9999) { 
			System.out.println("Invalid input. Please enter four digits ONLY."); 
			System.out.println("You entered: " +userInput);					
			System.out.println("Enter the first four digits of your credit card number."); 
			userInput=in.nextInt(); //Record next input
		}

		int first4Digits = 0;
		int temp = userInput;

		while(temp > 0) {
			first4Digits += temp % 10;
			temp /= 10;
		}
		//Loop to validate, then loop until desired cards are generated
		while(userCards > 0) { 

			num1 = 0 + (int)(Math.random()*(9999) + 1);		//Generates random numbers
			num2 = 0 + (int)(Math.random()*(9999) + 1);		//Between 0 and 9999
			num3 = 0 + (int)(Math.random()*(9999) + 1);		//
			int temp1 = num1;
			int temp2 = num2;
			int temp3 = num3;
			sum = first4Digits;

			while(temp1 > 0) {
				sum += temp1 % 10;
				temp1 /= 10;
			}

			while(temp2 > 0) {
				sum += temp2 % 10;
				temp2 /= 10;
			}

			while(temp3 > 0) {
				sum += temp3 % 10;
				temp3 /= 10;
			}
			//If sum checks out, print the card number
			if (sum %10 == 0) {  			
				userCards--;
				System.out.printf("%04d%04d%04d%04d\n", userInput, num1, num2, num3);
				in.close();
			}
		}		
	}	
}