package game;

import java.util.concurrent.ThreadLocalRandom;

public class Creature {
	
	protected static int hp = 150;
    protected static int mp = 35;
	protected static int str = 10;
	protected static int dex = 10;
	protected static int intell = 10;
	protected static int mnd = 10;
	protected static int lck = 10;
	protected static int attack = 15;
	protected static int level = 1;
	protected static int enemyHP = 150;
	
	public static int playerAttack(int attackDmg) {
		int damageDealt = ThreadLocalRandom.current().nextInt(5, attackDmg);
		return damageDealt;
	}
	
	public static int damageDealt(int damage) {
		int damageTaken = ThreadLocalRandom.current().nextInt(25, damage);
		return damageTaken;
	}
	
	public static int defend(int dmgReduction) {
		int damageTaken = ThreadLocalRandom.current().nextInt(25, dmgReduction);
		return damageTaken;
	}
	
	public static void enemyDeath(int enemyHP) {
		
	}
	
	public static void playerDeath() {
		
	}
}
