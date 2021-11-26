
package LinkedListII;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.w3c.dom.Node;

public class PlayerLinkedListDemo {
	
	public static void main(String[] args) {
        // Instantiating application-specific linked list
		PlayersLinkedList list = new PlayersLinkedList();
		
		// Adding nodes to the linked list by reading all records from the .csv file
		String path = "src/Players.csv";
		String line ="";
		String[] values = {};

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				
				 values = line.split(",");
				 		
		list.append(StrToInt(values[0]),values[1],values[2],values[3],values[4],StrTodouble(values[5]),StrToInt(values[6]));  
			  
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	 }
		
		
		int x;
		
		do {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1. Add a new player");
			System.out.println("2. Delete a player(based on playerID");
			System.out.println("3. Report total number of players");
			System.out.println("4. Print full player list");
			System.out.println("5. Search by Player ID");
			System.out.println("6. Search by Player's Real Name(Either first name or last name)");
			System.out.println("7. Search by Player's Game Name(PlayerName)");
			System.out.println("8. Report Players with Highest Total Score");
			System.out.println("9. Report Players with Lowest Total Score");
			System.out.println("0. Exit");
			System.out.println("-------------------------------------------------------------------");
			
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter menu Choice: ");
		     x = scr.nextInt();
		
		switch(x) {
		    case 1:
		    scr.nextLine();
			System.out.println("Add a new Player");
			System.out.print("firstName: ");
			String fname = scr.nextLine();
			System.out.print("lastName: ");
			String lname = scr.nextLine();
			System.out.print("playerName: ");
			String playerName = scr.nextLine();
			System.out.print("playerType: ");
			String playerType = scr.nextLine();
			
			int id1 = (int) (Math.random()*10000+1001);
		
			list.append(id1,fname, lname, playerName, playerType, 0.0,0);
			
			System.out.println("New Player have been Successfully Added!\n");
		    break;
		    
		    case 2: 
			System.out.println("Please enter playerID to delete the player.");
			System.out.print("PlayerID: ");
			int id = scr.nextInt();
			
			list.delete(id);
			System.out.println("Player have been successfully deleted");	
			break;
		
		    case 3: 
			System.out.println("Total number of Players = "+ list.length());
		    break;
		    
		    case 4:
			list.printPlayerList();	
			break;
		
		    case 5:
			System.out.println("Please enter playerID to Search the player.");
			System.out.print("PlayerID: ");
			int id2 = scr.nextInt();
			
			list.search(id2);
			break;
		
		    case 6:
			System.out.print("First Name: ");
			String firstname = scr.nextLine();
			scr.nextLine();
			System.out.print("Last Name: ");
			String lastname = scr.nextLine();
			
			list.search(firstname, lastname);	
			break;
		    
		    case 7:
		    scr.nextLine();
			System.out.print("GameName: ");
			String gname = scr.nextLine();
		    list.search(gname);
		   
			break;
			
		    case 8:
			System.out.println(list.highScore());
			break;
		
		    case 9:
			System.out.println(list.lowScore());
			break;
		
		    case 0:
			System.out.println("GOOD BYE!");
			break;
		
            default:
			System.out.println("Invalid Input");
			
		}
		
	} while(x !=0); 
	
		
		
  }
	/*
	 * This method Converts String into int
	 * Integer.parseint() method didn't work here. because values were from csv file.
	 */
	public static int StrToInt(String value) {
		StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c > 47 && c < 58){
                builder.append(c);
            }    
        }
        String s = builder.toString();
       int x = Integer.parseInt(s);
       return x;
		
	 }
	
	/*
	 * This method Converts String into int
	 * Java API method (Integer.parseint()) didn't work here. because values were from csv file.
	 */
	public static double StrTodouble(String value) {
		StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
                builder.append(c);
            }
        String s = builder.toString();
        double d = Double.parseDouble(s);
        return d;
   }
}
