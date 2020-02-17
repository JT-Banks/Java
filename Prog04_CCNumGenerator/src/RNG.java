/**
 * Bank card Random number Generator
 * 
 * CSC 1350 Programming Project No.4
 * Section 1
 * 
 * @author Josh Bankston
 * @since 02/27/2019
 *
 */
import java.util.Scanner; //Import keyboard use for user
public class RNG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1; //2nd set of 4 numbers
		int num2; //3rd set of 4 numbers
		int num3; //4th set of 4 numbers
		int sum = 0;
		int userInput; //1st set of 4 numbers from user
		int userCards; //Declaring how many cards
		System.out.println("How many cards would you like to enter? \n"); //Gets value for the loop, to determine how many times it will generate valid cards
		userCards = in.nextInt();
		
		System.out.print("Enter the first four digits of your credit card number.\n"); //Prompts user
		userInput = in.nextInt(); //Records what the user enters to a variable
		
		while (userInput<0 || userInput>9999) { //If user input 4 digits only, falls out and prompts next segment
		
			System.out.println("Invalid input. Please enter four digits ONLY."); //Notifying the user of invalid entry
			System.out.println("You entered: " +userInput);					
			System.out.println("Enter the first four digits of your credit card number."); //Prompts user again
		
			userInput=in.nextInt(); //Records next input
		}
		
		int first4Digits=0;
		int temp=userInput;
		
		while(temp>0) {
			first4Digits += temp % 10;
			temp /= 10;
		}
	

		while(userCards>0) { //Loop to validate, then loop until desired cards are generated
			
		    num1 = 0 + (int)(Math.random()*(9999) + 1);		//Generates random numbers
		    num2 = 0 + (int)(Math.random()*(9999) + 1);		//Between 0 and 9999
		    num3 = 0 + (int)(Math.random()*(9999) + 1);		//
		    
		    int temp1=num1;
		    int temp2=num2;
		    int temp3=num3;
		    
		    sum=first4Digits;
		    
		    while(temp1>0) {
				sum += temp1 % 10;
				temp1 /= 10;
			}
		    
		    while(temp2>0) {
				sum += temp2 % 10;
				temp2 /= 10;
			}
		    
		    while(temp3>0) {
				sum += temp3 % 10;
				temp3 /= 10;
			}
		    
		    if (sum %10 == 0) {  			//If sum checks out, print the card number
				 userCards--;
				 System.out.printf("%04d%04d%04d%04d\n", userInput, num1, num2, num3);
			}
		}		
	}	
}

	




	


