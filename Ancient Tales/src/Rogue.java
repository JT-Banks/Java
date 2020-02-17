public class Rogue extends baseClass{
	
	
	public Rogue (int maxHp, int maxMp, int maxStr, int maxDex, int maxMnd, int maxInt, int maxLck, int maxLevel, int exp) 
	{	
		
		super(maxHp, maxMp, maxStr, maxDex, maxMnd, maxInt, maxLck, maxLevel, exp);
		
	}
	public void levelUp (int hp, int mp, int str, int dex, int mnd, int intel, int lck, int level)
	{
		level++;
		int hpSum = hp + 4;
		int mpSum = mp + 4;
		int strSum = str + 2;
		int dexSum = dex + 6;
		int mndSum = mnd + 2;
		int intelSum = intel + 2;
		double lckSum = lck + 0.50;
		
	
		System.out.println("You leveled up! \n Level: " +level+ "\n HP = " + hpSum + "\n MP = " +mpSum+ " \n Strength = " +strSum+ " \n Dexterity = "
									+ dexSum+ "\n Intelligence = " +intelSum+ " \n Mind = " +mndSum+ "\nLuck = " +lckSum);
	}
	
}
