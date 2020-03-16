import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class FilesProject {

	public static void main(String[] args) throws FileNotFoundException  {	
		
		Scanner scan = new Scanner(System.in);
		//Ask user for file name
		System.out.println("Enter your file name: ");
		String fileName = scan.nextLine();
		File inputFile = new File(fileName);		
		System.out.println("Enter your file size: ");
		int size = scan.nextInt();
		//Print to screen
		System.out.print("File: " + fileName + "\tMean: " + getMean("numbers.txt") + " Max: " + getMax("numbers.txt"));
		scan.close();
	}
	
	public static void populateFile(String fileName, int size) throws FileNotFoundException {
		
		//Initializing utilities
		
		Random r = new Random();
		PrintWriter outFile = new PrintWriter("numbers.txt");
		//File inputFile = new File(fileName);
		//For loop to populate file with numbers between 1000 and 2000
			for (int i = 0; i < size; i++)
			
				outFile.println(r.nextInt(1001)+1000);
			
				outFile.close();		
	}
	
	public static double getMean (String fileName) throws FileNotFoundException {
		//Utilities
		File inputFile = new File(fileName);
		Scanner scan = new Scanner(inputFile);
		double mean = 0;
		int count = 0;
		while (scan.hasNextDouble()) {
			mean += scan.nextDouble();
			count++;
		}
		
		scan.close();	
		return mean/count;
	}
	
	public static int getMax(String fileName) throws FileNotFoundException {
		//Method to get max
		File inputFile = new File(fileName);
		Scanner scan = new Scanner(inputFile);
		int max=0;
		
		//While loop to iterate through the file to find max
		while (scan.hasNextInt()) {
			
			  int number = scan.nextInt();
			
			if (number > max) {
				max = number; 
			}
		}
		return max;
	}
}
