package game;
import java.util.Random;

public class Enemies extends Creature {
	
	
	public static String brittleSkeleton() {
		
		String enemy = "Brittle Skeleton";
		Creature.hp += 5;
		Creature.mp += 15;
		Creature.str += 1;
		Creature.dex += 2;
		Creature.intell += 4;
		Creature.mnd += 0;
		Creature.lck += 3;
			
		return enemy;
	}
}