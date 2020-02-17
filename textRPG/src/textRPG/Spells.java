package textRPG;
import java.util.concurrent.ThreadLocalRandom;

public class Spells {
			
	public int fireBlast() {
		
		int fb = 26;
		return fb = ThreadLocalRandom.current().nextInt(22, fb);
	}
	public int iceSickle() {
		int iS = 31;
		return iS = ThreadLocalRandom.current().nextInt(23, iS);
		
	}
	public int whirlWind() {
		int ww = 36;
		return ww = ThreadLocalRandom.current().nextInt(31, ww);
	}
	public int earthShard() {
		int earthShard = 42;
		return earthShard = ThreadLocalRandom.current().nextInt(38, earthShard);
	}
	public int Heal() {
		int heal = 55;
		return heal = ThreadLocalRandom.current().nextInt(35, heal);
	}

}
