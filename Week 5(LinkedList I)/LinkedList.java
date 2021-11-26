package Linkedlist;

public class LinkedList {
	Node head;

	/*
	 * Inserting element at the end of the LinkedList
	 */
	  public void append(int data)
	  {
	    if (head == null)
	    {
	      head = new Node(data);
	      return;
	    }
	    Node current = head;
	    
	    while (current.next != null)
	    {
	      current = current.next;
	    }
	    current.next = new Node(data);
	    
	  }

	
	  
	   // Method Prepend (Inserting new Node at the beginning of our ArrayList)
	  public void Prepend(int data)
	  {   
		  // Creating new Node(Object of Node class) that goes in the beginning of ArrayList
		  Node node = new Node(data);
		  // Inserting head node into Newly created Node's Tail(node.next)
		  node.next = head;
		  // Making newly created(current) Node our head node
		  head = node;  
		  
	  } 
	  
	  
	 
	  // Method that prints all Nodes 
	  public void printList()
	  {
	    Node current = head;
	    System.out.print("List Contents: ");
	    while (current != null)
	    {
	      System.out.print(current.data + " -> ");
	      current = current.next;
	    }
	    System.out.println("null");
	  }
	  
	  /*
	   * Delete method --> Deletes node according to user's specification.
	   */
	  public void Delete(int index) {
		  // if the Node we are deleting is the first Node
		  if (index ==0) {
			 // making second Node (i.e head.next) the head Node
			  head = head.next;  
		  }
		  
		  
		  // if the Node we deleting is not the first Node
		  else {
			  // Storing head Node in temporary variable [Node n] for loop operation.
			  Node n = head;
			  // Creating variable of type Node for later use.
			  Node n1 = null;
			  // for-loop
			  for (int i = 0; i<index-1; i++) {
			  // Shifting to next node by replacing n node by its next node (until loop continues)
				  n = n.next;
			  }
			  // n1 is n.next([__.next] always refers next node)
			     n1 = n.next;
			  // replacing n.next by n1.next so that n1 node gets lost in connection with other nodes.
			     n.next = n1.next;
			  
		  }  	  
		  
	  }
	  
	 
	   /*
	    * Search method.
	    */
	  public void Search(int value) {
		 int message = 1;
		 Node current = head;
		  while (current != null) {
			  if (current.data == value) {
				  message++;
			  }
			  current = current.next;
		  }
		  
		  if (message > 1)
			  System.out.println("Value has been found!!");
		  else 
			  System.out.println("No value found!!");	  
		  
	  }
	  
	  /*
	   * Length Method
	   * It gives length of the linked List
	   */
	  public void Length() {
		  int count = 0;
          Node current = head;
          while (current != null) {
        	  count++;
        	  current = current.next;
          }
          System.out.println("Length of LinkedList is "+count);
		  
	  }

}
