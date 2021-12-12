package finalProject;

import java.util.ArrayList;

public class testCode {
	
	public static BinarySearchTree bst = new BinarySearchTree();
	static Stack stack = new Stack();
	
	public long treeTraversalTimeCount(BSTNode n)
	{  
		long start = System.nanoTime();
		if(n == null)
		{  
			return 0; 
		}  
		else
		{  
			if(n.left!= null)
			{
				treeTraversalTimeCount(n.left);  
			}
			if(n.right!= null)
			{
				treeTraversalTimeCount(n.right);  
			}
		}  	
		long end = System.nanoTime();
		
		
		return end - start;
	}
	
	
	public static void stringBubbleSortTimeCount(BSTNode n) 
	{
		ArrayList<BSTNode> xxx = new ArrayList<BSTNode>();
	    stack.push(n);
	    
	    while (!stack.isEmpty()) {
	    	xxx.add(stack.pop());
	    }
		BSTNode temp, temp2;
		
		long start = System.nanoTime();
	      for (int i = 0; i < xxx.size(); i++) {
	    
	         for (int j = 0; j < xxx.size()-1; j++) {
	            // comparing strings
	        	 if ((xxx.get(j).university).compareTo(xxx.get(j+1).university) > 0) {
	        		 temp = xxx.get(j);
	        		 temp2 = xxx.get(j+1);
	        		 xxx.set(j,temp2);
	        		 xxx.set(j+1, temp);
	        	 }
	         }
	      }
	      long end = System.nanoTime();
	      double totalTime = end - start;
	      
	      System.out.printf("String Bubble Sorting time: %.0f nanoseconds (%.9f seconds)\n\n",totalTime,totalTime/1000000000);
	         
	}  	 

	
	public static void numberOfComparisonInBubbleSort(BSTNode n) 
	{
		
		ArrayList<BSTNode> xxx = new ArrayList<BSTNode>();
	    stack.push(n);
	    
	    while (!stack.isEmpty()) {
	    	xxx.add(stack.pop());
	    }
		BSTNode temp, temp2;
	          int count = 0;
	      for (int i = 0; i < xxx.size(); i++) {
	    
	         for (int j = 0; j < xxx.size()-1; j++) {
	            // comparing strings
	        	 if ((xxx.get(j).university).compareTo(xxx.get(j+1).university) > 0) {
	        		 
	        		 count++;
	        		 
	        		 temp = xxx.get(j);
	        		 temp2 = xxx.get(j+1);
	        		 xxx.set(j,temp2);
	        		 xxx.set(j+1, temp);
	        		 
	        	 }
	         }
	      }
	      
	      
	      System.out.println("Number of Comparison Made duing Bubble Sorting: "+count+" times\n");   
	         
	}  	 
}
