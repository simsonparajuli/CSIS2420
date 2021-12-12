package finalProject;

import java.util.ArrayList;
import java.util.Stack;

import BinarySearchTree.BSTNode;


public class searchMethods {

	public static BinarySearchTree tree = new BinarySearchTree();
	

/**
 * Search Nodes based on Ranking provided by the user.
 * @param n
 * @param ranking
 * @return
 */
  public void searchByRanking(BSTNode n,int ranking) {
	  
			if (n == null) {
				System.out.println("No University Found");
			}
			while (n != null && ranking != n.ranking)
			{
				if (ranking < n.ranking)
				{
					n = n.left;
				}
				else
				{
					n = n.right;
				}
			}
			System.out.printf("\n%s %40s %40s\n", "RANKING","UNIVERSITY","CITY");
			System.out.printf("%s %40s %40s\n", "-------","----------","----");
			System.out.printf("%s %50s %37s\n\n",n.ranking,n.university,n.city);
		
		}
  
/**
 * Search by university name provided by the user.
 * @param n
 * @param university
 */
  public static void searchByuniversity(BSTNode n,String university)
  {
		  ArrayList<BSTNode> colleges = new ArrayList<BSTNode>();
	 
	      // return if the tree is empty
	      if (n == null) {
	          return;
	      }
	  
	      // create an empty stack and push the root node
	      Stack stc = new Stack();
	      stc.push(n);
	  
	      // loop till stack is empty
	      while (!stc.isEmpty())
	      {
	      		
	          // pop a node from the stack
	         BSTNode current = (finalProject.BSTNode) stc.pop();
	         
	         // Capturing the Node that has UserName searched by the user.
	         if ((current.university).equalsIgnoreCase(university)) {
	        	 colleges.add(current);
	      	 
	         }
	      	   
	          // push the right child of the popped node into the stack
	          if (current.right != null) {
	              stc.push(current.right);
	          }
	  
	          // push the left child of the popped node into the stack
	          if (current.left != null) {
	              stc.push(current.left);
	          }
	  
	          // the right child must be pushed first so that the left child
	          // is processed first (LIFO order)
	          
	      }
	      
	      if (!colleges.isEmpty() ) {
	      	for (BSTNode college: colleges) {
	      		System.out.printf("\n%s %40s %40s\n", "RANKING","UNIVERSITY","CITY");
				System.out.printf("%s %40s %40s\n", "-------","----------","----");
				System.out.printf("%s %50s %35s\n\n",college.ranking,college.university,college.city);
			
	      	}
	
	      }
	      else {
	      	System.out.println("\nnot found");
	          System.out.println();
	      }
  }
  
  
 /**
  * Search the Universities based on the name of the city provided by the user.
  * Traverse tree and store Nodes into the Stack
  * @param n
  * @param city
  */
public static void searchByCity(BSTNode n,String city)
{
	
			ArrayList<BSTNode> colleges = new ArrayList<BSTNode>();
		    // return if the tree is empty
		    if (n == null) {
		        return;
		    }
		
		    // create an empty stack and push the root node
		    Stack stc = new Stack();
		    stc.push(n);
		
		    // loop till stack is empty
		    while (!stc.isEmpty())
		    {
		    		
		        // pop a node from the stack
		       BSTNode current = (finalProject.BSTNode) stc.pop();
		       
		       // Capturing the Node that has UserName searched by the user.
		       if ((current.city).equalsIgnoreCase(city)) {
		    	   colleges.add(current);
		    	  
		       }
		    	   
		        // push the right child of the popped node into the stack
		        if (current.right != null) {
		            stc.push(current.right);
		        }
		
		        // push the left child of the popped node into the stack
		        if (current.left != null) {
		            stc.push(current.left);
		        }
		
		        // the right child must be pushed first so that the left child
		        // is processed first (LIFO order)
		        
		    }
		    
		    if (!colleges.isEmpty() ) {
		    	for (BSTNode college: colleges) {
		    
					System.out.printf("%s %50s %37s\n\n",college.ranking,college.university,college.city);
		    	}
		
		    }
		    else {
		    	System.out.println("\nUser  not found");
		        System.out.println();
		    }
   } 
  
  	  
}	  
  
  
 
