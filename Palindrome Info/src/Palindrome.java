import java.io.FileNotFoundException;
import java.util.*;

public class Palindrome {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        //Loading the list of names from name.txt into a String array. 
        String[] namesArray = Utilities.GetStringArray(Utilities.loadNames()); 
        
        //Sorting names using SortNames method
        Utilities.SortNames(namesArray);
             
        //Generating a name at random 
        System.out.println("My first child will be named: " +  Utilities.myFirstBornName(namesArray)); 
        
        System.out.println("-----------------------------------------------------------------------");  
        
        //Searching for a name
        String name = "James";
      
        int targetIndex = Utilities.BinarySearchNames(namesArray, name);
        
        if( targetIndex > 0)
            System.out.println(name + " is found at index: " + targetIndex);  
        else 
            System.out.println("Not found");  
        
        System.out.println("-----------------------------------------------------------------------");  
        
        //Generating the hexadecimal code of the name  
        System.out.println("Hexadecimal code for " + name + " is: " + Utilities.nameToHex(name)); 
              
        System.out.println("-----------------------------------------------------------------------");  
        
        //Printing out all the palendrome names  
        for(String a: namesArray)
            if(Utilities.isPalendrome(a))
                System.out.println(a + " is a palendrome!"); 
                               
        System.out.println("-----------------------------------------------------------------------");             
    }
}