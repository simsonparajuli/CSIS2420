package finalProject;

import java.util.ArrayList;

public class SortMethods {
	
	
	public static BinarySearchTree bst = new BinarySearchTree();
	static Stack stack = new Stack();
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static ArrayList<BSTNode> sortByRanking(BSTNode n) 
	{
		ArrayList<BSTNode> xxx = new ArrayList<BSTNode>();
	    stack.push(n);
	    
	    while (!stack.isEmpty()) {
	    	xxx.add(stack.pop());
	    }
		BSTNode temp, temp2;
		
	      for (int i = 0; i < xxx.size(); i++) {
	    
	         for (int j = 0; j < xxx.size()-1; j++) {
	            // comparing strings
	        	 if ((xxx.get(j).ranking) > (xxx.get(j+1).ranking)) {
	        		 temp = xxx.get(j);
	        		 temp2 = xxx.get(j+1);
	        		 xxx.set(j,temp2);
	        		 xxx.set(j+1, temp);
	        	 }
	         }
	      }
	      return xxx;
	         
	}  	 
	 
	

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static ArrayList<BSTNode> sortByUniversity(BSTNode n) 
	{
		ArrayList<BSTNode> xxx = new ArrayList<BSTNode>();
	    stack.push(n);
	    
	    while (!stack.isEmpty()) {
	    	xxx.add(stack.pop());
	    }
		BSTNode temp, temp2;
		
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
	      return xxx;
	         
	}  	 
	 
	
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static ArrayList<BSTNode> sortByCity(BSTNode n) 
	{
		ArrayList<BSTNode> xxx = new ArrayList<BSTNode>();
	    stack.push(n);
	    
	    while (!stack.isEmpty()) {
	    	xxx.add(stack.pop());
	    }
		BSTNode temp, temp2;
		
	      for (int i = 0; i < xxx.size(); i++) {
	    
	         for (int j = 0; j < xxx.size()-1; j++) {
	            // comparing strings
	        	 if ((xxx.get(j).city).compareTo(xxx.get(j+1).city) > 0) {
	        		 temp = xxx.get(j);
	        		 temp2 = xxx.get(j+1);
	        		 xxx.set(j,temp2);
	        		 xxx.set(j+1, temp);
	        	 }
	         }
	      }
	      return xxx;
	         
	}  	 
}
	

