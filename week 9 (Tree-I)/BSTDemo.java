package BinaryTree;

import java.util.Random;
import java.util.Scanner;

/*
 * BSTDemo.java - Class to demonstrate a binary search tree.
 * 
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedtrees.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 *
 **/

public class BSTDemo 
{
	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		TimeCounter count = new TimeCounter();
		// Sample Data: 20, 33, 18, 19, 46, 29, 4, 62
	/*	bst.insertIterative(20);
		bst.insertIterative(12);
		bst.insertIterative(18);
		bst.insertIterative(19);
		bst.insertIterative(46);
		bst.insertIterative(29);
		bst.insertIterative(4);
		bst.insertIterative(62);
		bst.insertIterative(4500);
		*/
		
		 
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number of Nodes you want to insert into Tree: ");
		int noOfNodes = scr.nextInt();
		System.out.println();
		
		
		Random rand = new Random();
		// Inserting elements into an Array
		for (int i = 0; i < noOfNodes; i++) {
			
			bst.insertIterative(rand.nextInt(noOfNodes)); 
			
		}	
		
		double value1 = (double) count.preOrderCounter(bst.root);
        System.out.println("preOrderTraverse Tree: \n----------------");
        System.out.printf("Time taken to Traverse: %.0f nanoseconds (%.9f seconds)\n\n",value1,value1/1000000000);
        double value2 = (double) count.inOrderCounter(bst.root);
        System.out.println("inOrderTraverse Tree: \n----------------");
		System.out.printf("Time taken to Traverse: %.0f nanoseconds (%.9f seconds)\n\n", value2,value2/1000000000);
		double value3 = (double) count.postOrderCounter(bst.root);
		System.out.println("postOrderTraverse Tree: \n----------------");
		System.out.printf("Time taken to Traverse: %.0f nanoseconds (%.9f seconds)", value3,value3/100000000);
		
		
		
		
		
		System.out.println();
				
		
	}
}
