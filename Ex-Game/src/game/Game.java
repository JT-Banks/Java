package game;
import java.util.Random;
import java.util.Scanner;
public class Game extends Enemies{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Random rand = new Random();
		Mage mage = new Mage();
		Enemies enemies = new Enemies();
		String[] enemyArray = {enemies.brittleSkeleton()};
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my work in progress.\nThe goal of this game is to practice the structure of 'good' code.");
		System.out.println("Current version: Alpha (ver 1.0)");
		System.out.println("Please choose a class: \n##Warrior##\n~*Mage*~\n>>Rogue<<\n**Necromancer**");
		System.out.println("Currently during Alpha, only mage is available. Please select 'Mage'");
		String answer = scan.nextLine();
		boolean running = false;
		if(answer.equalsIgnoreCase("Mage")) {
			running = true;
			GAME:
				while(running) {
					String enemy = enemyArray[rand.nextInt(enemyArray.length)];
					System.out.println("\n\t ### " +enemy+ " has appeared!###");

					//while(Enemies.hp > 0)
					System.out.println("\nYour HP: " );
					System.out.println("Your Mana: " );
					System.out.println(enemy + "'s HP: " );
					System.out.println("\nWhat would you like to do?");
					System.out.println("1. Attack");
					System.out.println("2. Magic");
					System.out.println("3. Use items");
					System.out.println("4. Defend");
					System.out.println("5. Scan enemy");
					System.out.println("6. Run\n");
					String input = scan.nextLine();

					if(input.equals("1")) {
						Mage.attack();
					}
				}
		}
	}
}


