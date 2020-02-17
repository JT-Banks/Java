import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FilesProject {
    
public static void populateFiles(int numberofFiles,  int numbers) throws FileNotFoundException {  
//Method to generate and populate random files, with random values
    
        Random r = new Random();
        
        for (int i = 0; i < numberofFiles; i++)
        {
            PrintWriter output = new PrintWriter("numbers_" + i + ".txt");
        
            for (int j = 0; j < numbers; j++) 
                {
                    output.println(r.nextInt(9)+ 1);
                }
            output.close();
        }  
}
   
public static void calculateStat (int num, int size) throws FileNotFoundException { 
//Method to calculate files
        
     PrintWriter outFile = new PrintWriter("stats.txt");
     
     for (int i = 0; i < num; i++){
         
         File inputFile = new File("numbers_" + i + ".txt");
         
         Scanner in = new Scanner(inputFile);
         
         int sum = 0; 
         
         while (in.hasNextInt()) 
            {  
        	 	sum += in.nextInt();
            }
         
         float avg = sum /size; 
         outFile.printf("%s\t%d\t%.3f%n", "numbers_" + i + ".txt", sum, avg); 
     }
     
     outFile.close();
}
public static void main(String[] args) throws FileNotFoundException { 
// Main method used to call other methods
        
              
        Scanner in = new Scanner(System.in);
        System.out.print("How many files would you like to create? Value must be =< 10"); 
//User input on how many files to create (Must equal to, or less than 10)
        int num = in.nextInt();
        
        System.out.print("How many numbers per line?"); 
//User input on how many digits to randomly print(Any number, as long as it's not a long)
        int size = in.nextInt();
        populateFiles(num, size);
        calculateStat(num, size);
        in.close();
        
    }
        
}
    


