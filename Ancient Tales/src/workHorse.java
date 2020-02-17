import java.util.Scanner;

public class workHorse {
	static int maxHp = 5;
	static int maxMp = 5;
	static int maxStr = 5;
	static int maxDex = 5;
	static int maxMnd = 5;
	static int maxInt = 5;
	static int maxLck = 5;
	static int maxLevel = 1;
	static int exp = 0;
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		baseClass bC = new baseClass(maxHp, maxHp, maxHp, maxHp, maxHp, maxHp, maxHp, maxHp, maxHp);
		System.out.println("Welcome, to the wonderful world of Numeria!");
		System.out.println("---------------------------------------------------------");
		System.out.println("This is a text based, RPG fantasy game set in the wonderful, and adventerous world of Numeria.");
		System.out.println("Please select your name for your character.");
		String userName = in.nextLine();
		System.out.println("");
		System.out.println("Please select your starting class " +userName);
		boolean valid = !false;
		while (valid)
		System.out.println("You may select from three different classes: Warrior, Mage, and Rogue. \nIf you would like more information about a specific class please type: [name of class] info."
				+ "Otherwise press X to move on to class selection");
		String userClass = in.nextLine();
		if (userClass.equalsIgnoreCase("x"))
		{
			
		}
		String userInput = in.findInLine("Warrior info");
		if (userInput.contentEquals("Warrior info"))
		{
			bC.classInfoWarrior();
		}
		bC.stats();
		
		in.close();
	}



}
