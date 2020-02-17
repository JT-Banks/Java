
public class forLoops {

	public static void main(String[] args) {
		int max = 10;
		int i = 1;
		
		System.out.println("Counting up...");
		while (i <= max) {
			System.out.printf("%d",  i);
			i++;
		}
		System.out.println();
		
		i = max;
		System.out.println("Counting down...");
		while (i >= i) {
			System.out.printf("%d", i);
			i--;
		}
		System.out.println();
	}

}
