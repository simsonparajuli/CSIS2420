  
/*
 * HashNode.java - Node class for use with the hash demo.
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedHashing.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 */
package hashTable;

public class HashNode
{
	HashNode next;
	int customerID;
	String lastName;
	
	public HashNode(int customerID, String lastName)
	{
		this.customerID = customerID;
		this.lastName = lastName;
	}
}
