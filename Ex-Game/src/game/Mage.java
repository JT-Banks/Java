package game;

import java.util.concurrent.ThreadLocalRandom;

public class Mage extends Creature {
	static Enemies enemies = new Enemies();
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

	public static int attack() {
		int enemyRemainingHealth = 0;
		Creature.playerAttack(attack);
		System.out.println("You attacked for: " + attack + " damage!");
		//enemyRemainingHealth = enemies.getEnemyHp() - attack;
		//System.out.println("Test: Enemy HP: " + enemyRemainingHealth);
		return attack;
	}
	
	public int getEnemyHp(int x) {
		int enemyRemainingHealth = 0;
		enemyRemainingHealth = enemies.getEnemyHp() - x;
		return enemyRemainingHealth;
	}

	public void spells() {


	}

	public int getHp() {
		return Creature.hp;
	}

	public static int getAttack() {
		return Creature.attack;
	}
}
