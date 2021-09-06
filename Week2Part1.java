package javareview;
import java.util.Scanner;

public class Week2Part1 {
	public static void main(String[] args) {
	int min;
	int max;
    int total = 0;
    
    // Prompt from the User
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter min value: ");
    min = scr.nextInt();
    System.out.print("Enter max value: ");
    max = scr.nextInt();
    
    // for loop
    for (int i = min; i<=max; i++) {
    	total = total + i;
    }
    
    // Printing 
    System.out.printf("The total of the min value to the max value is %,d",total);
    
	
	// Two blank lines to the console
	System.out.println("\n\n");
	
	// Two Dimensional Array
	int [][] gameScores = {
			{44,63,45,23,76,45},
			{76,23,56,98,33,24},
			{23,71,92,39,45,44},
			{70,20,46,64,77,29},
			{83,45,99,20,10,21},
			{86,34,92,34,88,11}
		};
	
	System.out.println("--------------------------");
	System.out.println("Total Scores");
	System.out.println("--------------------------");
	int Row0 =0, Row1=0, Row2=0,Row3=0,Row4=0,Row5=0; 
	
	// Nested for-loop
	for (int i = 0; i<gameScores.length; i++) {
		for (int j = 0; j<gameScores[i].length; j++) {
			if (i ==0 )
				Row0 = Row0 + gameScores[i][j];
			else if (i==1)
				Row1 = Row1 + gameScores[i][j];
			else if (i==2)
				Row2 = Row2 + gameScores[i][j];
			else if (i == 3)
				Row3 = Row3 + gameScores[i][j];
			else if (i == 4)
				Row4 = Row4 + gameScores[i][j];
			else if(i == 5)
				Row5 = Row5 + gameScores[i][j];	
		}
	}
	 
	 //  Row-value into an Array
	 int[] sumOfgameScores = {Row0,Row1,Row2,Row3,Row4,Row5};
	 int highScore = sumOfgameScores[0];
	 
	 // Printing all elements of an array
	 for(int i = 0; i< sumOfgameScores.length; i++) {
		 System.out.printf("Row %d: %d\n",i,sumOfgameScores[i]); 
		 
		 // Finding highest score in an array by Iterative Way.
		 if (sumOfgameScores[i] > highScore)
			 highScore = sumOfgameScores[i];
	  }
	 System.out.println("-------------------------");	
	 // Printing the Highest Score
	 System.out.println("High Score: "+highScore);
	 
	
	 }
	}

