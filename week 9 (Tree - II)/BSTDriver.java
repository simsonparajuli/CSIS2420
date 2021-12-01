package BinarySearchTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BSTDriver {
	
	
	static BSTNode node;
	static BinarySearchTree tree = new BinarySearchTree();
	
	public static void main(String[] args) {
		
		int x;
		do {
		System.out.println("------------------------");
		System.out.println("1 Build Users Tree");
		System.out.println("2 Find by IP Address");
		System.out.println("3 Find by UserName");
		System.out.println("4 Report Number of Nodes");
		System.out.println("5 Print Entire Tree");
		System.out.println("6 Exit");
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.print("Enter 1, 2, 3, 4, 5 or 6: ");
		
		Scanner scr = new Scanner(System.in);
		 x = scr.nextInt();
		
		switch (x) {
			case 1: 
				buildUser();
				System.out.println("\nCongratulation! Your tree has been successfully Build\n");
			break;
		   
		    case 2: 
		    	System.out.print("\nEnter ip address to find (just the last 3 digits): ");
		    	int address = scr.nextInt();
		    	node = tree.searchIterative(tree.root,address);
				if (node == null) {
					System.out.println("\nIP 10.0.0."+address+" not found");
				     }
				else 
				System.out.println("\nFound: 10.0.0."+node.ip+" "+node.userName);
				break;
				
		    case 3: 
		    	scr.nextLine();
		    	System.out.print("\nEnter the User You would like to search: ");
		    	String username = scr.nextLine();
		    	tree.searchByUser(tree.root, username);
		    	break;
		    	
		    case 4:
		    	System.out.println("\nTotal number of Nodes in the tree: "+tree.countNodes(tree.root));
		    	break;
		    	
		    case 5:
		    	System.out.printf("\n%s %20s\n","IP Address","User Name");
		    	System.out.printf("%s %20s\n","-----------","----------");
		    	
		    	
		    	tree.preOrderTraverse(tree.root);
		    	break;
		    	
		    case 6:
		    	System.out.println("\nGOOD BYE!");
		    	break;
		    	
		    default:
		    	System.out.println("\nInvalid Input: Enter between 1 to 6\n");
		    	
		}
		}while (x != 6);
		
	
		
		
	}	
		
	
	/*
	 * creates the tree's root node and then reads the CSV file and adds one node to the tree per
	 *  user listed in the file.
	 */
	public static void buildUser() {
    
		
		String path = "src/users.CSV";
		String line = "";
		String[] values = {};
		try {
			BufferedReader reader = new BufferedReader (new FileReader(path));
			while ((line = reader.readLine()) != null) {
				values = line.split(",");
				for (int i = 0; i< values.length; i=i+2) {
					tree.add(Integer.parseInt(values[i]),values[i+1]);
				}
			
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}


