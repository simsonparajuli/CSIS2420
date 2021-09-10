package week3Assignment;


import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		
		// Add a memory consumption calculation and store it in a variable
		int min = 1;
        int max = 10;
        int numElements = 10000000;
        long memoryEstimate = (4 * numElements) + 24 +8;
        Random rand = new Random();
        
        int[] dataArray = new int[numElements];
        
        for (int i = 0; i < dataArray.length; i++)
        {
       	dataArray[i] = (rand.nextInt(max-min)+1)+min;
       	
        }
        
        int SeekValue = 54713;
       System.out.println("The Comparison made was "+ Comparison(dataArray,SeekValue));
       
       
	}
       // This is the Method that counts the number of Comparison
       static int Comparison (int[] dataArray, int Seekvalue) {
    	   Arrays.sort(dataArray);       // Sorting an Array
    	   int count = 0;
    	   
    	   int low = 0;                     
    	   int high = dataArray.length - 1;
    	    while (low <= high) {
    	    	int mid = low + (high- low) / 2;
    	        if (dataArray[mid] != Seekvalue)
    	            count++;
    	        if (dataArray[mid] < Seekvalue)
    	        	low = mid + 1;
    	        else
    	      	high = mid - 1;	        
       }
    	    return count;
       }    
 
}
