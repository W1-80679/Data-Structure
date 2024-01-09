package com.sunbeam;

import java.util.Scanner;

public class Tester {

	
			public static void main(String[] args) 
			
			{
	        
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the stack: ");
	        int size = scanner.nextInt();

	        DescendingStack descendingStack = new DescendingStack(size);

	        System.out.println("Enter values to push onto the stack (enter -1 to stop):");
	        int value;
	        while ((value = scanner.nextInt()) != -1) {
	            descendingStack.push(value);
	        }

	        descendingStack.display();

	        System.out.println("Enter the number of values to pop from the stack:");
	        int numPops = scanner.nextInt();

	        System.out.println("Performing pop operations:");
	        for (int i = 0; i < numPops; i++) {
	            descendingStack.pop();
	        }

	        descendingStack.display();

	        scanner.close();
	    }
	}