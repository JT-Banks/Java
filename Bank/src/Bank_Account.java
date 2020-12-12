import java.util.Scanner;

public class Bank_Account {

	double balance;
	double previousTrans;
	String customerName;
	String customerID;

	Bank_Account(String cName, String cID) {
		customerName = cName;
		customerID = cID;
	}

	public void deposit(double amount) {
		if (amount > 0)
		{
			balance = balance + amount;
			previousTrans = amount;
		}
	}

	public void withdraw(double amount) {
		if(amount != 0)
		{
			balance = balance - amount;
			previousTrans =- amount;
		} else {
			System.out.println("-----------------------------------");
			System.out.println("Insufficient funds");
			System.out.println("-----------------------------------");
			System.out.println();
		}
	}

	public void getPreviousTrans() {
		if(previousTrans > 0)
		{
			System.out.printf("Deposited: $%,.2f\n" , Math.abs(previousTrans));
		}
		else if (previousTrans < 0) 
		{
			System.out.printf("Withdrawn: $%,.2f\n" , Math.abs(previousTrans));
		} 
		else
		{
			System.out.println("No transaction occured");
		}
	}

	public void showMenu() {
		String option;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Super Bank " +customerName +"\n");
		System.out.println("Your ID is " +customerID);
		System.out.println("=====================================");
		do {
			System.out.printf("Your current balance is $%,.2f\n", balance);
			System.out.println("A.) Check Balance");
			System.out.println("B.) Deposit");
			System.out.println("C.) Withdraw");
			System.out.println("D.) Previous Transaction");
			System.out.println("E.) Exit");
			System.out.println("=====================================");
			System.out.println("\tPlease select an option");
			System.out.println("=====================================");
			option = scan.nextLine().toUpperCase();	

			switch(option) {

			case "A":
				System.out.println("-------------------------------------");
				System.out.printf("Balance = $%,.2f\n",balance);
				System.out.println("-------------------------------------");				
				break;

			case "B":
				System.out.println("-------------------------------------");
				System.out.println("Enter amount to deposit");
				double depositAmount = Double.parseDouble(scan.nextLine());
				deposit(depositAmount);
				System.out.printf("You deposited: $%,.2f\n", depositAmount);
				System.out.println("-------------------------------------");
				break;

			case "C":
				System.out.println("-------------------------------------");
				System.out.println("Enter an amount to withdraw");				
				double withdrawAmount = Double.parseDouble(scan.nextLine());
				withdraw(withdrawAmount);		
				System.out.printf("You withdrew: $%,.2f\n" , withdrawAmount);
				System.out.println("-------------------------------------");
				break;

			case "D":
				System.out.println("-------------------------------------");
				getPreviousTrans();
				System.out.println("-------------------------------------");			
				break;	

			case "E":
				System.out.println("You choose to exit the system. Thank you for using Super Bank, and have a great day! Goodbye!\n");
				System.out.println("Program terminated by user.");				
				return;				
			}	
		}
		while (option != "E");
		scan.close();
	}
}				



