package textRPG;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopyLoop {
	
	private static int maxEnemyHealth = 165;
	private static int enemyAttackDmg = 15;
	private static int health = 105;
	private static int attackDmg = 55;
	private static int mana = 14;
	private static int numHealthPots = 3;
	private static int healthPotionHealAmount = 40;
	private static int healthPotionDropChance = 20;
	private static int manaPotionRecoveryAmount = 16;
	private static int count = 0;
	private static int count2 = 0;
	private static int expUp = 0;
	private static int level = 1;	
 
	public static void main(String[] args) {
		
		Spells spells = new Spells();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		//String Array for enemies, more can be added, or taken away, Probably best to put this into another class, along with relative variables
		String[] enemies = {"Skeleton", "Zombie", "Goblin", "Tiny Dragon", "Ben Afleck", "Little weird man", "Huge Bee", "Jeff", "Crazy Ray"};			
		//Set a variable running to true, to allow the program to run, so that if the user chooses to end the game early, they can do so
		boolean running = true;
		System.out.println("==================================================================");
		System.out.println("Welcome to Mysterical World of Mysterical Things!");
		System.out.println("Please press the number corresponding the action you wish to take.");	
		System.out.println("==================================================================");
		//Clause to keep the game running with invalid inputs
		GAME:			
		while(running) {
	
			int enemyHealth = ThreadLocalRandom.current().nextInt(55, maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\n\t### " + enemy + " has appeared! ###\n");
			//The only bug so far, (not nearly enough testing) is this. It will display twice to the user when exiting the switch menu, or as they know it, magic menu(Methods will fix this, unsure if this is avoidable at this time)
			while (enemyHealth > 0) {
				 System.out.println("\n\tYour HP: " + health);
				 System.out.println("\tYour Mana: " + mana);
				 System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				 System.out.println("\n\tWhat would you like to do?");
				 System.out.println("\t1. Attack");
				 System.out.println("\t2. Spells");
				 System.out.println("\t3. Use potion");
				 System.out.println("\t4. Run\n");
				 String input = in.nextLine();
				 //Attack command, should later be converted to a method, to clean up clutter code				
				if (input.equals("1")) {
					int damageDealt = ThreadLocalRandom.current().nextInt(28, attackDmg);
					int damageTaken = ThreadLocalRandom.current().nextInt(10, enemyAttackDmg);
					enemyHealth -= damageDealt;
					health -= damageTaken;
					System.out.println("\t>>> You hit " + enemy + " for " + damageDealt + " damage <<<");
					System.out.println("\t>>>" + enemy + " hit you for " + damageTaken + " damage <<<");
					System.out.println();
					//Check to see if the enemy died each time the user inputs "1", or attack. (This can possibly stay in main, while using an attack method				
					if(enemyHealth < 0) {
						count++;
						System.out.println("=========================================");
						System.out.println(" *** " + enemy +" was defeated! ***");
						System.out.println("### You have " + health + " HP ### \n### And " + mana + " mana ###");
						expUp += expUp + 25;			
						//Check to see if experience gained exceeds 99, if so, level up, this checks after every enemy defeated, can also be put into a method to clean up clutter						
						if(expUp > 99) {
			    			level++;
			    			health = health+22;
			    			attackDmg = attackDmg + 2;
			    			mana = mana + 7;
			    			System.out.println("****** LEVEL UP!!! ******");
			    			System.out.println("You are now level " + level + "!");
			    			System.out.println("Each level up rewards 22 to total health, +2 to attack, and +7 to mana!");
			    			//Random chance for potion drop, put into a method to clean up clutter(CODE IS TOO CLUTTERED!!)						
						    if (rand.nextInt(100) < healthPotionDropChance) {					
						    	numHealthPots++;
						    	System.out.println("### The " + enemy + " dropped a health potion ###");
						    	System.out.println("### You now have " + numHealthPots + " health potion(s) ###");					
						    	//Attempting to fix Experience calculating for case(This issue appears to fixed as of 12/3/2019(7:14 A.M)
						    		if(expUp > 99) {
						    			level++;
						    			health = health+22;
						    			attackDmg = attackDmg + 2;
						    			mana = mana + 7;
						    			System.out.println("****** LEVEL UP!!! ******");
						    			System.out.println("You are now level " + level + "!");
						    			System.out.println("Each level up rewards 22 to total health, +2 to attack, and +7 to mana!");
						    		}
						    }
					}
				}
					//Each loop pass, check to see if the user's health is less than 1, if so, they died, and this will terminate the program. Once again...I really need to put this clutter into methods					
					if(health < 1) {
						System.out.println("\t=== You died! ===");
						break;
					}
					//This entire section is held up with old glue and the miracles of christ, I really need to USE METHODS(At this point you can really see I've learned my lesson)					
				}else if (input.equals("2")) {
					boolean set=true;
					while(set) { 
						//First thing's first, check to see if the user is dead, if so, why execute needless code, so we'll terminate if so						
						if(health < 1) {
							System.out.println("You pitifully limp out of the dungeon, too weak to go on!");
								return;
							}
						//Display vital information for the user, this will loop each spell cast, so you can keep track of mana, HP and enemy HP						
						System.out.println("============================================");
						System.out.println("\tYour HP: " + health);
						System.out.println("\tYour Mana: " + mana);
						System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
						System.out.println("____________________________________________\n");
						System.out.println("1. Fireblast (Cost: 6 mana, Damage: 10-19)");					
						System.out.println("2. Ice Sickle (Cost: 9 mana, Damage: 22-26)");						
						System.out.println("3. Whirlwind (Cost: 14 mana, Damage: 31-36)");						
						System.out.println("4. Earth shard (Cost: 28 mana, Damage: 38-42)");						
						System.out.println("5. Heal (Cost: 36 mana, Heals: 35 to 55 HP)");						
						System.out.println("6. Exit this menu");
						System.out.println("____________________________________________");
						int spellInput = in.nextInt();
						//Here's where it gets real dicey, I coded this so bad I can hardly understand it myself, METHODS!!!						
						switch (spellInput) {
						
						case 1: if(mana >= 6) {
							mana -= 6;
							int damageDealt = spells.fireBlast();
							int damageTaken = rand.nextInt(enemyAttackDmg);
							enemyHealth -= damageDealt;
							health -= damageTaken;													
							System.out.println("\t====================");
							System.out.println("\tYou cast Fire Blast!");
							System.out.println("\t====================");
							System.out.println("\n\t>>> Fireblast hits the " + enemy + " for " + damageDealt + " damage <<<"); 
							System.out.println("\t>>> You took " + damageTaken+ " damage<<<"); 
							System.out.println();	
							break;						
							} 
							
							else {
								System.out.println("You need more mana! Drink a potion!");
							break;
							}		
						
						
						case 2: if (mana >= 9) {
							mana -= 9;
							int damageDealt = spells.iceSickle();
							int damageTaken = rand.nextInt(enemyAttackDmg);
							enemyHealth -= damageDealt;
							health -= damageTaken;								
							System.out.println("\t====================");
							System.out.println("\tYou cast Ice Sickle!");
							System.out.println("\t====================");
							System.out.println("\n\t>>> Ice Sickle slashes the " + enemy + " for " + damageDealt + " damage <<<"); 
							System.out.println("\t>>> You took " + damageTaken+ " <<<"); 
							System.out.println();
							break;
						}
						else {
							System.out.println("You need more mana! Drink a potion!");
							break;										 
						}	
						
						case 3: if(mana >= 14) {
							mana -= 14;		
							int damageDealt = spells.whirlWind();
							int damageTaken = rand.nextInt(enemyAttackDmg);
							enemyHealth -= damageDealt;
							health -= damageTaken;						
							System.out.println("\t====================");
							System.out.println("\tYou cast Whirlwind!");
							System.out.println("\t====================");
							System.out.println("\n\t>>> Whirlwind ravages " + enemy + " for " + damageDealt + " damage <<<"); 
							System.out.println("\t>>> You took " + damageTaken+ " <<<"); 
							System.out.println();
							break;
						}
						else {
							System.out.println("You need more mana! Drink a potion!");
							break;
						}
						
						case 4: if(mana >= 28) {
							mana -= 28;	
							int damageDealt = spells.earthShard();
							int damageTaken = rand.nextInt(enemyAttackDmg);
							enemyHealth -= damageDealt;
							health -= damageTaken;						
							System.out.println("\t====================");
							System.out.println("\tYou cast Earth Shard!");
							System.out.println("\t====================");
							System.out.println("\n\t>>> Earth shard pummels " + enemy + " for " + damageDealt + " damage <<<"); 
							System.out.println("\t>>> You took " + damageTaken+ " <<<"); 
							System.out.println();
							break;
						}
						else {
							System.out.println("You need more mana! Drink a potion!");
							break;
						}						
						case 5: if(mana >= 36) {
							mana -= 36;								
							health += spells.Heal();
							int damageTaken = rand.nextInt(enemyAttackDmg);									
							health -= damageTaken;				
							System.out.println("\t===============");
							System.out.println("\tYou cast Heal!");
							System.out.println("\t===============");
							System.out.println("\n\t>>> You recover " + spells.Heal() + " HP <<<"); 
							System.out.println("\t>>> You took " + damageTaken+ " damage <<<");
							System.out.println("\tYour HP: " + health);
							System.out.println("\tYour Mana: " + mana);
							System.out.println();
							break;
						}
						else {
							System.out.println("You need more mana! Drink a potion!");
							break;
						}						
						case 6: set = false;

						default: break;					
						}	
						//Check to see if enemy has died, if so, tally experience and check if user can level up
						if(enemyHealth < 0) {
								count++;
								System.out.println("=========================================");
								System.out.println(" *** " + enemy +" was defeated! ***");
								System.out.println("### You have " + health + " HP ### \n### And " + mana + " mana ###");
								expUp += expUp + 25;										
								if(expUp > 99) {
									level++;
									health = health+22;
									attackDmg = attackDmg + 2;
									mana = mana + 7;
									System.out.println("****** LEVEL UP!!! ******");
									System.out.println("You are now level " + level + "!");
									System.out.println("Each level up rewards 22 to total health, +2 to attack, and +7 to mana!");
															
										if (rand.nextInt(100) < healthPotionDropChance) {					
												numHealthPots++;
												System.out.println(" # The " + enemy + " dropped a health potion");
												System.out.println(" # You now have " + numHealthPots + " health potion(s) # ");
										}		
							}
							break;
						}												
					}					
				}
				
				else if (input.equals("3")) {	
					
						if (numHealthPots > 0) {
							count2++;
							health += healthPotionHealAmount;
							mana += manaPotionRecoveryAmount;
							numHealthPots--;
							System.out.println("\tYou drink a potion, healing for " + healthPotionHealAmount + " HP and recovering " + manaPotionRecoveryAmount + " mana" +
											   "\n\t>> You now have " + health + " HP and " + mana +" Mana <<" +
											   "\n\t>> You have " + numHealthPots + " potions left <<\n");
						}
						
						else {
							System.out.println("\tYou have no potions left! Defeat enemies for a chance to get one!");
						}
						
				} else if (input.equals("4")) {				
							System.out.println("\tYou run away from the " + enemy + "!");
					continue GAME;
				  }
				
				  else {					  
					  	System.out.println("============================================");
				  }
			}			
				System.out.println("=========================================");
				System.out.println("What would you like to do now?");
				System.out.println("Press 1 to continue fighting");
				System.out.println("Pess 2 to exit");
				String input = in.nextLine();
			
			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid command");
				input = in.nextLine();
			}
			if (input.equals("1")) {
				System.out.println("You choose to continue, good luck!");
			}
			else if (input.equals("2")) {
				System.out.println("You exit the game");
				break;
			}
		}
				System.out.println("####################");
				System.out.println("Thanks for playing!");
				System.out.println("####################");
				System.out.println("Press 5 to see your score!");
				String input2 = in.nextLine();
					if (input2.equals("5")){
						System.out.println("You defeated " + count + " enemies");
						System.out.println("Max level achieved: " + level);
						System.out.println("And you used " + count2 + " potions");					
				}
					else {
						System.out.println("Invalid input");
						input2 = in.nextLine();
					}
				in.close();
		}
}