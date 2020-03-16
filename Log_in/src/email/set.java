package email;
import java.util.Scanner;
public class set {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength;
	private String altEmail;
	private String companySuffix = "boostmoose.com";	
	//Constructor to receive first and last name
	public set (String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\nSuccess!\n\nEmail created for " + firstName + " " +lastName +"\n");
		
		//Call method to ask for department - return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call method to return password
		//Set length of password 
		this.password = randomPassword(5);
		System.out.println("Your password is: " + password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for department
	private String setDepartment() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter department\n\n1 Sales\n2 Development\n3 Accounting \n0 for None\n\nEnter department code: ");
		int departmentChoice = in.nextInt();
		
			switch(departmentChoice) {
				case 1: { return "Sales"; }
				case 2: { return "Development"; }
				case 3: { return "Accounting"; }
				default: { System.out.println("\nWrong input, try again.\n"); break; }
			}
			return "";			
	}
	
	//Generate random password from character array
	private String randomPassword(int length) {
		
		String passwordSet = "aqwecvastuhkgmvtcopgldie,d##%31#!--=$%!`*(**()%12";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//Set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set Alternative Email
	public void setAlternateEmail (String altEmail) {
		this.altEmail = altEmail;
	}	
	//Change password for employee
	public void changePassword(String password) {
		this.password = password;
		System.out.println("New password: " + password);
	}
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	public String getAltEmail() {
		return altEmail;
	}
	public String getPassword() {
		return password;
	}
	public String printInfo() {
		return "Name: " + firstName + " " + lastName + "\nPassword: "+ password + "\nCompany Email: " + email + "\nAlternative email: " + altEmail + "\nDepartment: "+ department + "\nMailbox Capacity: " + mailBoxCapacity + "mb";
	}
}
