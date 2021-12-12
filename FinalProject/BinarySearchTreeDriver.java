package finalProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class BinarySearchTreeDriver {
	
	static BinarySearchTree bst = new BinarySearchTree();
	static Stack stack = new Stack();
	static searchMethods methods = new searchMethods();
	static SortMethods sort = new SortMethods();
	static testCode test = new testCode();
	

	public static void main(String[] args) {
	  
            String path = "src/university15.csv";
    		String line ="";
    		String[] values = {};

    		try {
    			BufferedReader br = new BufferedReader(new FileReader(path));
    			while ((line = br.readLine()) != null) {
    				
    				 values = line.split(",");
    				 
    				
                     bst.add(StrToInt(values[0]), values[1], values[2]);
    				 		  
    			}
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    	 }
    		
    		Scanner scr = new Scanner(System.in);
    		int x;
    		
    		do {
    		
    		System.out.println("---------------------------------------------------------------------------------------------------------");
    		System.out.printf("%60s","	UNIVERSITY FINDER\n\n");
    		System.out.println("[There are 1765 top US higher education institutions ranked by uniRank™ in 2021]\n");
    		System.out.println("uniRank™  is the leading international higher education directory and search engine featuring reviews and rankings of over 13,600 officially recognized Universities and Colleges in 200 countries (https://www.4icu.org/about/).");
    		System.out.println("----------------------------------------------------------------------------------------------------------\n");
    		System.out.printf("%40s","Search Your University Below\n");
    		System.out.printf("%42s","=============================\n\n");
    		System.out.println("1. Search University (By Ranking)");
    		System.out.println("2. Search University (By Name)");
    		System.out.println("3. Search University (By City)");
    		System.out.println("4. Show All Univeristies (Sorted List by Ranking)");
    		System.out.println("5. Show All Universities (Sorted Alphabetically by University Name)");
    		System.out.println("6. Show All Universities (Sorted Allphabetically by City)");
    		System.out.println("7. Time taken to Treaverse the Tree");
    		System.out.println("8. Bubble Sort (Time)");
    		System.out.println("9. Bubble sort (Steps)");
    		System.out.println("0. Exit");
    		System.out.println("--------------------------------------------------------------------");
   //===============================================================================================
    		System.out.print("Choose 1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9 or 0: ");
    		 x = scr.nextInt();
    		 System.out.println();
    		 
    		switch(x) {
    		 case 1: 
    		    	   System.out.print("Enter Ranking: ");
    		    	   int ranking = scr.nextInt();
    		    	   methods.searchByRanking(bst.root, ranking);
    		    	   break;
    		    	   
    		 case 2:
    		    	  scr.nextLine();
    		    	  System.out.print("Enter University Name: ");
    		    	  String university = scr.nextLine();
    		    	  methods.searchByuniversity(bst.root, university);
    		          break;
    		 case 3: 
    		    	  scr.nextLine();
    		    	  System.out.println("Enter City Name: ");
    		    	  String city = scr.nextLine();
    		    	  System.out.printf("\n%s %40s %40s\n", "RANKING","UNIVERSITY","CITY");
  					  System.out.printf("%s %40s %40s\n", "-------","----------","----");
    		    	  methods.searchByCity(bst.root, city);
    		          break;
    		      
    		case 4: 
    			//BSTNode node = bst.preOrderTraverse(bst.root);
    			System.out.printf("\n%s %15s %25s\n", "RANKING","CITY","UNIVERSITY");
				System.out.printf("%s %15s %25s\n", "-------","----------","----------");
				for (BSTNode el: sort.sortByRanking(bst.root)) {
					 System.out.printf("%d %20s %25s\n",el.ranking,el.city,el.university);
				}
    				 break;
    				 
    	    case 5:
    				 
    					 System.out.printf("\n%s %40s\n", "RANKING","UNIVERSITY");
    						System.out.printf("%s %40s\n", "-------","----------");
    						for (BSTNode el: sort.sortByUniversity(bst.root)) {
    							 System.out.printf("%d %50s\n",el.ranking,el.university);
    						}
    				 
    				 break;
    				 
    		case 6:
	    			System.out.printf("\n%s %40s\n", "CITY","UNIVERSITY");
					System.out.printf("%s %35s\n", "-------","----------");
    				 for (BSTNode el: sort.sortByCity(bst.root)) {
    					 System.out.printf("%s %40s\n",el.city,el.university);
    				 }
    				 break;
    		case 7:
    			double time = test.treeTraversalTimeCount(bst.root);
    			System.out.printf("Time taken to Traverse: %.0f nanoseconds (%.9f seconds)\n\n",time,time/1000000000);
    			break;
    			
    		case 8:
    		    test.stringBubbleSortTimeCount(bst.root);
    			break;
    			
    		case 9:
    			test.numberOfComparisonInBubbleSort(bst.root);
    			break;
    		case 0:
    			System.out.println("Good Bye !!! ");
    			break;
    		default:
    			System.out.println("Invalid Input");
    		 }
    	
    	} while (x != 0);
    		
    		
    	
	}
	
		
	
	
	
	// Integer.parseint(String) Method doesn't work in this case(Don't know why)
	// So I created my own method that converts String into integer.
	public static int StrToInt(String value) {
		StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c > 47 && c < 58){
                builder.append(c);
            }    
        }
        String s = builder.toString();
       int x = Integer.parseInt(s);
       return x;
		
	 }

}
