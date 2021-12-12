package finalProject;

import java.util.ArrayList;

public class Stack {
	static BinarySearchTree binary = new BinarySearchTree();
	
	static ArrayList<BSTNode> stck = new ArrayList<BSTNode>();

	static int top = 0;
	
	
/**
 * Pushes an item onto the top of this stack.
 * @param n ( the item to be pushed onto this stack.)
 * 
 */
	public void push(BSTNode n) {
		
			if(n == null)
			{   
             return;
			}  
			
			else
			{  
	             stck.add(n);
	             top++;
				if(n.left!= null)
				{
					push(n.left);  
				}
				if(n.right!= null)
				{
					push(n.right);  
				}
			}  
		}  

	

	/**
	 * Removes the object at the top of this stack and returns that object as the value of this function.
	 * @return --> (The object at the top of this stack)
	 */
	
	public BSTNode pop() {
		BSTNode n;
		top--;
		n = stck.get(top);
		stck.set(top,null);
		return n;
	}  
	
	
	/**
	 * Tests if this stack is empty or not.
	 * @return --> true if and only if this stack contains no items; false otherwise.
	 */
	public boolean isEmpty() {
		return top <= 0;
	}
	
	
}
	

