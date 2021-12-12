package finalProject;

public class BinarySearchTree {
	BSTNode root;
	int countNodes;
	
	/**
	 * This is the implementation of tree in java 
	 * this constructs Tree Recursively
	 * @param current
	 * @param ranking
	 * @param university
	 * @param city
	 * @return
	 */
	public BSTNode addRecursive(BSTNode current, int ranking,String university,String city) {
	    if (current == null) {
	        return new BSTNode(ranking,university,city);
	    }

	    if (ranking < current.ranking) {
	        current.left = addRecursive(current.left, ranking,university,city);
	    } else if (ranking > current.ranking) {
	        current.right = addRecursive(current.right, ranking,university,city);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	
	/*
	 * This method add elements into the tree by the Node's values provided by the user
	 * and calling our previous method addRecursive()
	 */
	public void add(int ranking,String university,String city) {
	    root = addRecursive(root,ranking,university,city);
	}
	
	
	/**
	 * Prints all Node's values by Traversing tree in preOrderTreaversal (i.e  node --> left --> right)
	 * @param n
	 */
	public void preOrderTraverse(BSTNode n)
	{  
		if(n == null)
		{  
			System.out.println("Tree is empty\n");  
			return;  
		}  
		else
		{  
			
            System.out.println(n.ranking+" \t "+n.university+" \t \t \t"+n.city);
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
