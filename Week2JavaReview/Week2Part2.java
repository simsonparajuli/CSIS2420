package javareview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Week2Part2 {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new FileReader("src/javareview/text.txt"));
	String str;
	int counter = 0;
	Float sum =0f;
   while ((str = br.readLine()) != null) {
	   // Counting number of Rows
	   counter++;
	   // Converting String value to Float Value
	   Float fvalue = Float.parseFloat(str);
	  // adding all float values
	   sum = sum + fvalue;
   }
   br.close();
   // average 
   float avg = sum / counter;
   
   // Printing user-friendly Statement
   System.out.printf("Number of Rows in the file: %d\n",counter);
   System.out.printf("Total of all of the numbers: %.2f\n",sum);
   System.out.printf("The average number in the file: %.2f",avg);
}
}
