import java.util.Scanner;
public class baseClass 
{
	private int maxHp = 5;
	private int maxMp = 5;
	private int maxStr = 5;
	private int maxDex = 5;
	private int maxMnd = 5;
	private int maxInt = 5;
	private int maxLck = 5;
	private int maxLevel = 1;
	private int exp = 0;
	
	public baseClass(int maxHp, int maxMp, int maxStr, int maxDex, int maxMnd, int maxInt, int maxLck, int maxLevel, int exp)
	{
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.maxStr = maxStr;
		this.maxDex = maxDex;
		this.maxMnd = maxMnd;
		this.maxInt = maxInt;
		this.maxLck = maxLck;
		this.maxLevel = maxLevel;
		this.exp = exp;
	}
	public void stats()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("At any time while playing the game you wish to see your current stats, just type !stats");
		String userInput = in.findInLine("!stats");
		if (userInput.contentEquals("!stats")) 
		{ 
		System.out.println("Your stats are as follows:\nHp: " +maxHp+ "\nMp: " +maxMp+ "\nStr: " +maxStr+ "\nDex: " +maxDex+ "\nMind: " +maxMnd+ "\nInt: " +maxInt+ "\nLuck: " +maxLck+  "\nLevel: " +maxLevel+ "\nExp: " +exp);	
		}
		in.close();
	}
	public void classInfoWarrior()
	{
		System.out.println("The warrior specializes in front line combat. Able to take hits, and dish them out as well. This class is best suited for those who prefer up close and personal combat /nYour speciality stats are Str, HP, and Mind");
	}
	public void classinfoRogue ()
	{
		System.out.println("The rogue class specializes in cloak and dagger tactics. With this class you'll have to play more tactful, carefully planning your course of action. /nRogues recieves bonuses in Dex, Luck, and Mind");
	}
	public void classinfoMage()
	{
		System.out.println("The mage class specializes in ranged combat using spells to take foes out from afar. Although devasting in combat, mages are equally as weak in terms of physical defense. /nMage recieves bonuses in Intelligence, MP, and Luck");
	}
} 