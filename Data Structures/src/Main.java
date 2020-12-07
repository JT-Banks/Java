import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number for how many elements in the array you want (only integers)");
		int answer = input.nextInt();
		int[] array = new int[answer];
		
		for(int i = 0; i < answer; i++)
			array[i] = rand.nextInt(1000);
		*/
		int[] array = {5, 6, 9 , 22, 42, 19, 60, 55, 71, 56, 23, 50, 19};
		Instant start = Instant.now();				
		//LinearSearch lSearch = new LinearSearch();
		int x = 71 ;
		int result = BinarySearch.binarySearch(array, x);
		if(result == -1)
			System.out.println("Sorry, " + x + " is not present in the array");
		else 
			System.out.println("Target found at index: " +result);
		Instant stop = Instant.now();
		System.out.println("Time is: "+ Duration.between(start, stop).toMillis() / 1000 +" second(s)");    		
		
		
		
	}		
}
