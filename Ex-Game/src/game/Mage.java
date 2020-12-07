package game;

import java.util.concurrent.ThreadLocalRandom;

public class Mage extends Creature {

	public Mage() {
		
		Creature.hp += 12;
		Creature.mp += 40;
		Creature.str -= 4;
		Creature.dex += 6;
		Creature.intell += 16;
		Creature.mnd += 10;
		Creature.lck += 1;
		Creature.attack -= 6;
		Creature.level = 1;
	}
	
	public static void statSheet() {
		
		System.out.println("==== Stats ====\nClass: Mage\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex 
				+ "\nIntelligence: " +intell + "\nMind: " + mnd + "\nLuck: " + lck);
	}
	
	public static void attack() {
		Creature.playerAttack(attack);
		int damageDealt = ThreadLocalRandom.current().nextInt(5, attack);
		System.out.println("You attacked for: " +damageDealt+ " damage!");
	}
	
	public void spells() {
		
		
	}
}
