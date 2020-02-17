/*
 * Ticket Manager Project
 * 
 * CSC 1350 Programming project No 6
 * Section 1
 * 
 * @author Josh Bankston
 * @since 3/25/2019
 * 
 */
import java.util.Scanner;
public class Prog06_TicketManager {
	
	public static void main(String[] args) {
		
		String continueQ="Y"; //Check for Y or N from user
		
		int[][] seats={{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, //Array for seats
				   	   {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				   	   {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				   	   {20, 20, 20, 20, 20, 20, 20, 20, 20, 20},
				   	   {20, 20, 20, 20, 20, 20, 20, 20, 20, 20},
				   	   {30, 30, 30, 30, 30, 30, 30, 30, 30, 30},
				   	   {40, 40, 40, 40, 40, 40, 40, 40, 40, 40},
				   	   {40, 40, 40, 40, 40, 40, 40, 40, 40, 40},
				   	   {50, 50, 50, 50, 50, 50, 50, 50, 50, 50}};
		
		Scanner in = new Scanner(System.in);
		
		while(continueQ.equalsIgnoreCase("Y")) { // Check for Y or N loop
			System.out.print("Enter the maximum amount that you would like to spend on tickets.");
			int moneySpent = in.nextInt();
			in.nextLine(); //
			
			assignSeat(moneySpent, seats);
			
			System.out.println("Would you like to purchase additional tickets? (Y/N)");
			continueQ = in.nextLine(); // User input
		}
		
		for (int i = 0;  i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%4d" , seats[i][j]);
			}
			System.out.printf("\n");
			
		}
		
		in.close(); //Closing Scanner
	}
	
	private static void assignSeat(int budget, int[][] seats) { //private method to call to main for function
		int rowNum=8; //9 rows = 0 - 8
		while(rowNum>=0) { 
			
			int seatNum=9;
			
			while(seatNum>=0) {
				
				if(budget>=seats[rowNum][seatNum] && seats[rowNum][seatNum] != 0) {
					System.out.printf("Ticket located at Row %d Seat %d for $%d\n", 9-rowNum, seatNum+1, seats[rowNum][seatNum]);
					seats[rowNum][seatNum] = 0;
					return;
				}
				
				seatNum--;
			}
			
			rowNum--;
		}
		System.out.printf("No tickets found for under $%d\n", budget);
	}
}