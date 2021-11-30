package BinaryTree;

public class TimeCounter {
	public BSTNode root;
	
	public long preOrderCounter(BSTNode n)
	{  
		long start = System.nanoTime();
		if (n == null)
		{  
			return 0; 
		}  
		else
		{  
			if(n.left!= null)
			{
				preOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				preOrderCounter(n.right);  
			}
				
		} 
		long end = System.nanoTime();
		return end-start;
		
	}  
	
	
	public long inOrderCounter(BSTNode n)
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
				inOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				inOrderCounter(n.right);  
			}
		}  
		long end = System.nanoTime();
		return end-start;
	}  
	
	public long postOrderCounter(BSTNode n)
	{  
		long start = System.nanoTime();
		if(n == null)
		{   
			return 1;  
		}  
		else
		{  
			if(n.left!= null)
			{
				postOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				postOrderCounter(n.right);  
			} 
		}  
		long end = System.nanoTime();
		return end - start;
	}

}
