
package LinkedListII;


public class PlayersLinkedList {
	PlayerNode head;
	
	/* Method No 1
	 * append Method 
	 * (Insert node at the end of the List)
	 */
	
	public void append (int id,String firstName,String lastName,String playerName,String playerType,double lifePoints,int totalScore)
	  {
	    if (head == null)
	    {
	      head = new PlayerNode (id,firstName,lastName,playerName,playerType,lifePoints,totalScore);
	      return;
	    }
	    PlayerNode current = head;
	    
	    while (current.next != null)
	    {
	      current = current.next;
	    }
	    current.next = new PlayerNode(id,firstName,lastName,playerName,playerType,lifePoints,totalScore);
	  }
	
	
	/*
	 * Method No 2
	 * Deletes a node based on a playerID
	 */
	public void delete (int playerID) {
		PlayerNode current = head;
		int index = 0;
		int indexOfNode = 0;
        
		// First Finding the index of node that we are going to delete
		while (current.next != null) {
			index++;
			current = current.next;
			if (current.id == playerID) {
				indexOfNode = index;
			}
		}
		

		// Now actually Deleting that Node 
		if (indexOfNode == 0) {
			head = head.next;
			return;
		}
		PlayerNode n = head;
		PlayerNode n1 = null;
		for (int i = 0; i<indexOfNode-1; i++) {
			n = n.next;
		}
		n1 = n.next;
		
		n.next = n1.next;
		    	
	}
	
	/*
	 * Method No 3 
	 * Finding the length of LinkedList
	 */
	public int length() {
		PlayerNode current = head;
		int count = 1;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		return count;
		
	}
	
	
	/*
	 * Method No: 4
	 * prepend()--> Add a node to the front of the list
	 */
	public void prepend(int id,String firstName,String lastName,String playerName,String playerType,double lifePoints,int totalScore)
	{
		PlayerNode node = new PlayerNode(id,firstName,lastName,playerName,playerType,lifePoints,totalScore);

			node.next = head;
			head = node;	
	}
	
	
	/*
	 * Method No: 5
	 * printPlayerList()--> Prints a well-formatted report of all players and all of their attributes in columns.
	 */
	public void printPlayerList() {
		PlayerNode current = head;
		System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
		System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
		while (current != null) {
		System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",current.id,current.firstName,current.lastName,current.playerName,current.playerType,current.lifePoints,current.totalScore);
		current = current.next;
		}
		
	}
	
	/*
	 * Method No:6(A)
	 * search(playerID) method
	 * -->Returns the reference to the node that contains 
	 * the specified playerID, or null if not found in the list.
	 */
	
	public void search(int playerID) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;
		// IF the search node is the first node
		if (current.id == playerID) {
			PlayerFound = current;
			count++;
			}
		// IF search Node is not the first Node.
		else {
		while (current.next != null) {
			current = current.next;
			if (current.id == playerID) {
				PlayerFound = current;
				count++;
			}
			
		  }
		}
		
		if (count>0) {
			System.out.println("Player has been found!");	
			System.out.println();
			System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
			System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
			System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
			
		}
		else 
			System.out.println("No player found by this ID");	
	}
	
	
	/*
	 * Method No:6(B)
	 * search(name) method
	 * Returns the reference to the node that contains the specified name
	 * (firstName lastName combination), or null if not found in the list.
	 */
	public void search(String firstName, String lastName) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;
		if (firstName.equalsIgnoreCase(current.firstName) || lastName.equalsIgnoreCase(current.lastName)) {
			PlayerFound = current;
			count++;
			}
		while (current.next != null) {
			current = current.next;
			if (firstName.equalsIgnoreCase(current.firstName) || lastName.equalsIgnoreCase(current.lastName)) {
				PlayerFound = current;
				count++;	
	         }
		}
		if (count>0) {
				System.out.println("Player has been found!");	
				System.out.println();
				System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
				System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
				System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
				
			}
			else 
				System.out.println("No player found by this Name");
		}
	
	
	    /*
	     * Method No. 6(C)
	     * search(playerName) method
	     * Returns the reference to the node that contains the specified playerName, or null if not found in the list
	     */
	
	public void search(String playerName) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;
		// IF the search node is the first node
       if (playerName.equalsIgnoreCase(current.playerName)) {
				PlayerFound = current;
				count++;
				}
		
		// IF search Node is not the first Node.
       else {
		while (current.next != null) {
			current = current.next;
			if (playerName.equalsIgnoreCase(current.playerName)) {
				PlayerFound = current;
				count++;
			}
			
		  }
		}
		
		if (count>0) {
			System.out.println("Player found that matches your search!");	
			System.out.println();
			System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
			System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
			System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
			
		}
		else 
			System.out.println("No player found by this ID");
		
	}
	
	/*
	 * Method No: 7
	 * highScore()
	 * Returns a well-formatted string containing the player with the highest totalScore in the list
	 */
	public String highScore() {
		 
		PlayerNode current = head;
		int high = current.totalScore;
		String name = "";
		
		while (current.next != null) {
			current = current.next;
			if (current.totalScore > high) {
				high = current.totalScore;
				name = current.playerName;
			}
		
		}
		return "Highest Point: "+ high + "\nHigh Scorer: "+name;
	}
	
	/*
	 * 
	 */
	public String lowScore() {
		PlayerNode current = head;
		int low = current.totalScore;
		String playerName = "";
		
		while (current.next != null) {
			current = current.next;
			if (current.totalScore < low) {
				low = current.totalScore;
				playerName = current.playerName;
			}
		
		}
		return "Lowest Point: "+ low + "\nLow Scorer: "+playerName;
	}
	
	
	
	
	// Print Method(prints all the nodes with all thier attributes)
	public void printList()
	  {
	    PlayerNode current = head;
	    System.out.println("List Contents: ");
	    while (current != null)
	    {
	      System.out.print(current.id + " " + current.firstName+" "+current.lastName+" "+current.playerName+" "+current.playerType+" "+current.lifePoints+" "+current.totalScore+"--->");
	      System.out.println();
	      current = current.next;
	    }
	    System.out.println("null");
	  }

}
