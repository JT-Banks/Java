/*
 * Investment Project
 * @author Joshua Bankston
 * @since 4/3/2019
 * 
 * File must be named investments.txt
 * and located in the source folder for code to work
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
public class Prog07_InvestmentManager {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);   	
	Scanner inFile=null;
	File file=null;
	boolean flag=true;
	while(flag) { //Boolean flag to test true or false for input from user
		try {
			flag=false;
			System.out.println("Please enter the file name to import, including file extension."); 
			file = new File(in.nextLine()); //store user input in a variable
			inFile = new Scanner(new FileReader(file)); //read file	
		} 
		catch (FileNotFoundException e1) { //Catch exception, in case the user names the wrong file
			flag=true;
		}
	}
	
	int count = inFile.nextInt();
	double[] fileArray = new double[(int) (count)];
	for (int i=0; i < count; i++) {
		fileArray[i] = inFile.nextDouble();
	}
	
	double min = Integer.MAX_VALUE; //Declaring min, max, and mean to use later
	double max = 0;
	double mean = 0;	
	double line = 0;
	int sum = 0;
	int counter = 0;
	
	for (int j = 0; j < fileArray.length; j++) { //Loop to get all output to print to user
		
		line=fileArray[j];
		sum+=line;
		counter++;
		
		if(line>max)
			max=line;
		
		if(line<min)
			min=line;
	}
	
	int countA = 0;
	int countB = 0;
	int countC = 0;
	int countD = 0;
	int countF = 0;
	
	for (int i = 0; i < fileArray.length; i++) { //for loop to assign values to A, B, C, D, and F 
		if (fileArray[i] >= 1250) {
			countA++;
		}
		else if (fileArray[i] <= 1500 && fileArray[i] >= 1100) { //This keeps track of how many loops, therefore counting how many values at that set value and assigning it to countB
			countB++;
		}
		else if(fileArray[i] <= 1100.0 && fileArray[i] >= 900.0) {
			countC++;
		}
		else if(fileArray[i] > 750 && fileArray[i] <= 900) {
			countD++;
		}
		else if(fileArray[i] <= 750) {
			countF++;
		}
	}	
	
	int sum2 = countF + countD + countC + countB + countA; //adding how many times each value looped, to get a total
	BubbleSort(fileArray);
	System.out.println(Arrays.toString(fileArray));
	
	mean = (sum/counter); //printing information back to the user
	System.out.printf("Max: $%-6.3f\n", max);
	System.out.printf("Min: $%-6.3f\n", min);
	System.out.printf("Mean: $%-6.3f\n", mean);
	System.out.println();
	System.out.printf("Number of A's = %d", countA);
	System.out.println();
	System.out.printf("Number of B's = %d", countB);
	System.out.println();
	System.out.printf("Number of C's = %d", countC);
	System.out.println();
	System.out.printf("Number D's = %d", countD);
	System.out.println();
	System.out.printf("Number of F's = %d", countF);
	System.out.println();
	System.out.println();
	System.out.printf("Total Number of Investments: %d", sum2);
	System.out.println();
	System.out.println();
	
	
	System.out.println("Would you like to search for an investment amount? (Y/N)");
	String answer= in.nextLine();//Prompt the user for binary search
	
		while (answer.equalsIgnoreCase("Y")) { //This loop to check answer eliminates a need for a "N" response, simply doesn't execute when "N"
		System.out.println("Enter the investment amount");
		double userSrc = in.nextDouble();
		int n = fileArray.length;
		int first = 0;
		int last = n - 1;
		int middle = (first+last)/2;
		
		   while (first <= last) {
			   
		      if (fileArray[middle] < userSrc)
		         first = middle + 1; 
		      
		      else if (fileArray[middle] == userSrc) {
		         System.out.printf("%.2f found at location %d.", userSrc, middle);
		       break;
		      }
		      else {
		    	 last = middle - 1;
		      }
		       	 middle = (first + last)/2;
		   }
		   
		   if (first > last)
		         System.out.printf("%.2f not found", userSrc);
		   		 System.out.println();
		}
		in.close();
	}

	/*
	 * Method to Bubble sort
	 *
	 * Section 1
	 * 
	 * @author Joshua Bankston
	 * @since April 23, 2019
	 * 
	 */
public static void BubbleSort(double[] array){ //Bubble sort method
	boolean sorted = false; 
	int i = 1;
	while (!sorted) { //While not true, or not sorted, enter loop
	if (i == array.length) {
	sorted = true; 
	}
	else {
	sorted = true;
	for(int j = 0; j < array.length-i; j++){ //sorting by descending order, we can easily change to ascending by changing to greater than
	if(array[j] < array[j+1]) {
	swap(array, j, j+1); //Swap method from below implemented here
	sorted = false;
	  }
	}
 }
	i++; 
	}
}
/*
 *  Method to swap elements in the array to assist the Bubble sort
 *  
 *  Section 1
 *  
 *  @author Joshua Bankston
 *  @since April 23, 2019
 *  
 */
	public static void swap(double[] arr, int a, int b) { //Method to swap array placement
		double tmp;
		tmp = arr[a]; //a must be placed in a temporary value so it doesn't get overwritten
		arr[a] = arr[b]; //b goes to a
		arr[b] = tmp; //value stored in tmp (which is just a) goes to b
	}
}
