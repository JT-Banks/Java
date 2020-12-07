public class Warmup_2 {

	public String frontTimes(String str, int n) {

		int length = 3;
		if(length > str.length()) {
			length = str.length();
		}
		String front = str.substring(0, length);

		String answer = "";
		for(int i = 0; i < n; i++) {
			answer += front;
		}
		return answer;
	}

	int countXX(String str) {

		int counter = 0;
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.substring(i, i+2).equals("xx"))
				counter++;
		}
		return counter;
	}


	boolean doubleX(String str) {

		int i = str.indexOf("x");
		if (i == -1) 
			return false; // no "x" at all

		// Is char at i+1 also an "x"?
		if (i+1 >= str.length()) 
			return false; // check i+1 in bounds?
		return str.substring(i+1, i+2).equals("x");

		// Another approach -- .startsWith() simplifies the logic
		// String x = str.substring(i);
		// return x.startsWith("xx")
	}

	public String stringBits(String str) {
		String ans = "";
		
		for(int i = 0; i < str.length(); i+=2) {
			ans += str.substring(i, i+1);
			
		}
		return ans;
	}
	
	public String stringSplosion(String str) {
		
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			ans += str.substring(0, i+1);
		}
		return ans;
	}
	
	public int last2(String str) {
		
		if(str.length() < 2)
			return 0;
		String end = str.substring(str.length() - 2);
		int counter = 0;
		for(int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i+2);
			if(sub.equals(end))
				counter++;
		}
		return counter;
	}
}

