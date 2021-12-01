package BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
	BSTNode root;
	BSTNode current;
	
	/*
	 * This method add Nodes to the tree Iteratively
	 */
	public void add(int ip,String userName)
	{
		BSTNode newNode = new BSTNode(ip,userName);  
		if(root == null)
		{  
			root = newNode;  
			return;  
		}  
		else
		{  
			BSTNode current = root;
			BSTNode parent = null;  
			while(true) 
			{  
				parent = current;  
				if(ip < current.ip)
				{  
					current = current.left;  
					if(current == null)
					{  
						parent.left = newNode;  
						return;  
					}  
				}  
				else
				{  
					current = current.right;  
					if(current == null)
					{  
						parent.right = newNode;  
						return;  
					}  
				}  
			}  
		}  
	}
	
	
	
	public BSTNode searchIterative(BSTNode n, int ip)
	{
		if (n == null) {
			return null;
		}
		while (n != null && ip != n.ip)
		{
			if (ip < n.ip)
			{
				n = n.left;
			}
			else
			{
				n = n.right;
			}
		}
		return n;
	
	}
	

	/*
	 *  Iterative(Without Recursion) function to perform preorder traversal on the tree
	 *  to find the username provided by the user
	 */
    public static void searchByUser(BSTNode n,String user)
    {
    	BSTNode foundNode = null;
    	int count = 0;
        // return if the tree is empty
        if (n == null) {
            return;
        }
    
        // create an empty stack and push the root node
        Stack<BSTNode> stack = new Stack<>();
        stack.push(n);
    
        // loop till stack is empty
        while (!stack.empty())
        {
        		
            // pop a node from the stack and print it
           BSTNode current = stack.pop();
           
           // Capturing the Node that has UserName searched by the user.
           if ((current.userName).equalsIgnoreCase(user)) {
        	   foundNode = current;
        	   count++;
           }
        	   
            // push the right child of the popped node into the stack
            if (current.right != null) {
                stack.push(current.right);
            }
    
            // push the left child of the popped node into the stack
            if (current.left != null) {
                stack.push(current.left);
            }
    
            // the right child must be pushed first so that the left child
            // is processed first (LIFO order)
            
        }
        
        if (count > 0 ) {
        	System.out.println("\nFound: 10.0.0."+foundNode.ip+" "+foundNode.userName);
        	System.out.println();
        }
        else {
        	System.out.println("\nUser "+user+" not found");
            System.out.println();
        }
    }
    

	/*
	 * Method to count number of Nodes to the tree Recursively
	 */
	public int countNodes(BSTNode n)
	{
		        
		//base case
        if(n==null)
            return 0;

        //recursive call to left child and right child and
        // add the result of these with 1 ( 1 for counting the root)
        return 1 + countNodes(n.left) + countNodes(n.right);	
		    
	 }
	
	
	
	
	
	public void preOrderTraverse(BSTNode n)
	{  
		if(root == null)
		{  
			System.out.println("Tree is empty\n");  
			return;  
		}  
		else
		{  
			
            System.out.printf("%d %27s\n",n.ip,n.userName);  
			if(n.left!= null)
			{
				preOrderTraverse(n.left);  
			}
			if(n.right!= null)
			{
				preOrderTraverse(n.right);  
			}
		}  
		
		
	}  
	
	

}
