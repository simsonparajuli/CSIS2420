
package Linkedlist;

public class LinkedListDemo1 {
	
	 Node head;
	 
	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	
	ll.append(2);
	
	ll.append(45);
	
	ll.append(43);
	
	ll.append(5);
	
	ll.append(45);
	
	ll.append(23);
	
	ll.append(34);

	ll.Prepend(120);
	
	ll.Delete(7);
	
	ll.append(3);
	
	
	ll.Delete(0);
	
	
	ll.Search(23);
	
	ll.Length();
	
	
	ll.printList();

 }
}
