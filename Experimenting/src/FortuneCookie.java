import java.util.Random;

public class FortuneCookie {
	
	static String [] fortunes = {"Today is your day!", 
			"Today is not your day...", 
			"You will find stuff today",
			"Today you will meet a companion",
			"Hardwork pays off in the future, laziness pays off now",
			"You should probably buy a boat...???",
			"Don't go fishing!!!",
			"Lies never tell, truth will swing like a bird fishing for lollipops",
			"Don't go chasing waterfalls..."};

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int r = rand.nextInt(fortunes.length);
		System.out.println(fortunes[r]);
	}

}
