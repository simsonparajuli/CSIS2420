package BinaryTree;

/*
 * BinarySearchTree.java - Class to manage binary search 
 *                         tree implementations.
 * 
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedtrees.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 *
 */

public class BinarySearchTree 
{
	
	public BSTNode root;
	public int BSTDepth = 0;

	/*
	 * Implementing a Binary Tree Recursively
	 */
	public BSTNode insertRecursive(BSTNode current, int value) {
	    if (current == null) {
	        return new BSTNode(value);
	    }

	    if (value < current.data) {
	        current.left = insertRecursive(current.left, value);
	    } else if (value > current.data) {
	        current.right = insertRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	   
	    return current;
	}
	
	
	
	/*
	 * Implementing binary search tree Iteratively.
	 * This method insert Node into tree Iteratively(using loop)
	 */
	public void insertIterative(int data)
	{
		BSTNode newNode = new BSTNode(data);  
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
				if(data < current.data)
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
	
	
	public void preOrderTraverse(BSTNode n)
	{  
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			System.out.print(n.data + " ");  
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
	

	public void inOrderTraverse(BSTNode n)
	{  
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			if(n.left!= null)
			{
				inOrderTraverse(n.left);  
			}
			System.out.print(n.data + " ");  
			if(n.right!= null)
			{
				inOrderTraverse(n.right);  
			}
		}  
	}  

	public void postOrderTraverse(BSTNode n)
	{  
		if(root == null)
		{  
			System.out.println("Tree is empty");  
			return;  
		}  
		else
		{  
			if(n.left!= null)
			{
				postOrderTraverse(n.left);  
			}
			if(n.right!= null)
			{
				postOrderTraverse(n.right);  
			}
			System.out.print(n.data + " ");  
		}  
	}

	public BSTNode searchRecursive(BSTNode n, int data)
	{
	    if (n == null || n.data == data)
	    {
	    	return n;
	    }
	    if (n.data < data)
	    {
	       return searchRecursive(n.right, data);
	    }
	    return searchRecursive(n.left, data);
	}

	
	public BSTNode searchIterative(BSTNode n, int data)
	{
		while (n != null && data != n.data)
		{
			if (data < n.data)
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
	
	public int depth(BSTNode n)
	{
		if (n == null)
		{
			return 0;
		}
		else
		{
			int left = depth(n.left);
			int right = depth(n.right);
			// Option 1
			//return (1 + ((l > r) ? l : r));
			// Option 2
			//if (left > right)
			//	return(left + 1);
			//else return(right + 1);
			// Option 3
			return Math.max(left, right) + 1;
		}
	}

	public void treeDepth(BSTNode n, int counter)
	{
		if (n == null)
		{
			return;
		}
		if (n.left == null && n.right == null)
		{
			this.BSTDepth = Math.max(BSTDepth, counter);
		}
		treeDepth(n.left, counter + 1);
		treeDepth(n.right, counter + 1);
	}


	
	public static BSTNode deleteNode(BSTNode n, int data) 
	{
        if(n == null) return n;
        if(data > n.data)
        {
        	// Traverse right
            n.right = deleteNode(n.right, data);
        }
        else if(data < n.data)
        {
        	// Traverse left
            n.left = deleteNode(n.left, data);
        }
        else
        {
        	// Found the node
            if(n.left == null && n.right == null)
            {
            	// It is a leaf, set it to null (delete it)
                n = null;
            }
            else if(n.right != null)
            {
            	// It has a right-child, get the successor 
                n.data = getSuccessor(n);
                n.right = deleteNode(n.right, n.data);
            }
            else
            {
            	// No successor so go back
                n.data = getPredecessor(n);
                n.left = deleteNode(n.left, n.data);
            }
        }
        return n;
    }
	
	
    private static int getSuccessor(BSTNode n){
        n = n.right;
        while(n.left != null){
            n = n.left;
        }
        return n.data;
    }
	
    private static int getPredecessor(BSTNode n){
        n = n.left;
        while(n.right != null){
            n = n.right;
        }
        return n.data;
    }
	

    /*
     * Another approach ...
     * 
	static BSTNode deleteNode(BSTNode n, int data)
	{
		// The base case
		if (n == null)
			return n;

		// Recurse for ancestors of n
		if (n.data > data)
		{
			n.left = deleteNode(n.left, data);
			return n;
		}
		else if (n.data < data)
		{
			n.right = deleteNode(n.right, data);
			return n;
		}
		
		// If one child node is empty
		if (n.left == null)
		{
			BSTNode hold = n.right;
			return hold;
		}
		else if (n.right == null)
		{
			BSTNode hold = n.left;
			return hold;
		}

		// If both child nodes are present
		else
		{
			BSTNode parent = n;

			// Find the successor
			BSTNode successor = n.right;
			while (successor.left != null)
			{
				parent = successor;
				successor = successor.left;
			}
			// We'll assume successor is from the left
			// unless it's null, otherwise we'll use
			// the right
			if (parent != n)
				parent.left = successor.right;
			else
				parent.right = successor.right;

			// Copy successor's data value
			n.data = successor.data;

			return n;
		}
	}


    */
    
    
}
