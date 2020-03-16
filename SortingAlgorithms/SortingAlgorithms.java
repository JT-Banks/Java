package SortingAlgorithms;
import java.util.Random;
import java.time.Instant;
import java.time.Duration;
import java.util.Scanner;
public class SortingAlgorithms {
	static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Please enter the size of your file: ");
       // Scanner input = new Scanner(System.in);
        int listSize = input.nextInt();
        int[] array = new int[listSize];
        Random rand = new Random();
        
        for(int i= 0 ; i<listSize; i++)
            array[i] = rand.nextInt(1000);
        
        Instant start = Instant.now();
        //bubbleSort(array.clone());
        //bubbleSortCS(array.clone());
        selectionSort(array.clone());
        //insertionSort(array.clone());
        //mergeSort(array.clone());
        Instant finish = Instant.now();
        System.out.println("Time is: "+ Duration.between(start, finish).toMillis());
        }
    
    public static void bubbleSort(int[] array)
    {
        //Method to bubbleSort
        long count = 0;
        for(int i = 1; i < array.length-1; i++)    
            for(int j = 0; j < array.length-i-1; j++) {
            count++;
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;                   
                } 
            }
        //count/1000 does not work for size < 1000
        System.out.println("Number of steps for BubbleSort: " + count/1000);
    }
    public static void bubbleSortCS(int[] array)
    {
        //Method for bubble sort short circuit
        long count = 0;
        for(int i = 1; i < array.length-1; i++)
        {
           
            boolean swap = false;
            for(int j = 0; j < array.length-i-1; j++)
            { 
             count++;
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;           
                }   
            }
        if(!swap)
            break;
        }     
        //count/1000 does not work for size < 1000
        System.out.println("Number of steps for BubbleSort CS: " + count/1000);
    }
    
    public static void selectionSort(int[] array)
    {
        //Method for selection sort
        long count = 0;
        for (int i = 0; i < array.length-1; i++) 
        {
            
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                count++;
                if (array[j] < array[minIndex])
                {
                    minIndex = j;
                }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            }  
        }
        //count/1000 does not work for size < 1000
        System.out.println("Number of steps for Selection Sort: " + count/1000);
    }
    
    public static void insertionSort(int[] array)
    {
        //Method for insertion sort
        long count = 0;
        int i, key, j;
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i -1;
            while (j >= 0 && array[j] > key)
            {
                count++;
                array[j+1] = array[j];
                        j = j -1;
            }
            array [j+1] = key;
        }
        //count/1000 does not work for size < 1000
        System.out.println("Number of steps for Insertion Sort: " + count/1000);
    } 
    
    public static void mergeSort(int[] array)
    {
    	if(array.length<2)
    		return;
    	
    	int mid = array.length/2;
    	int[] l = new int[mid];
    	int[] r = new int[array.length-mid];
    	
    	for(int i = 0; i < mid; i++)
    		l [i] = array[i];
    	for(int j = mid; j < array.length; j++)
    		r[j-mid]=array[j];
    	mergeSort(l);
    	mergeSort(r);
    	merge(array, l, r, mid, array.length - mid);
    }
    
    public static void merge(int[] array, int[] l, int[] r, int left, int right)
    {   	
    	int i = 0, j = 0, k = 0;
    	
    		while (i < left && j < right)
    		{
    				if (l[i] <= r[j])
    				{
    					array[k] = l[i];
    					i++;
    				}
    				else
    				{
    					array[k] = r[j];
    					j++;
    				}
    				
    				k++;
    		}
    			while (i < left)
    				array[k++] = l[i++];
    			while (j < right)
    				array[k++] = r[j++];
    }
}
