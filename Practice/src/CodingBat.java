import java.util.HashMap;

public class CodingBat {

	public static void main(String[] args) {
			
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("attack", 500);
		map.put("defend", 0);
		System.out.println(map.get("attack"));
		
	}
}