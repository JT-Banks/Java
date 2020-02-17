import java.util.Scanner;

public class Staircase {
	//Inefficient
	/*
	 * static void staircase(int n) {
	 * 
	 * 		for (int i = 1; i <=n; i++) {
	 *  		for (int j = 1; j <= n-i; j++) {
	 * 				System.out.print(" "); } 
	 * 		for (int k = 1; k <= i; k++) {
	 * 			System.out.print("#"); }
	 *  System.out.println(); 
	 *  	} 
	 *  }
	 */
	static void staircase(int n) {
		String str ="#";
		for(int i = 0; i < n; i++) {
			System.out.printf("%" + n + "s\n", str);
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		staircase(n);
		in.close();
	}

}
