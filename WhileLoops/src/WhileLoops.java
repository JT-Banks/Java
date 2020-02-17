import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		int maxMultiples = 4;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you want multiples for");
		int multiplesOf = in.nextInt();
		for (int i=1; i<=maxMultiples;i++) {
			int answer = i*multiplesOf;
			System.out.printf("%d * %d = %d\n", i, multiplesOf, answer);
		}
		in.close();
	}
}
