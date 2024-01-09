package com.sunbeam;
import java.util.Scanner;
public class Tester {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        MaxStack maxStack = new MaxStack();

	        System.out.println("Push 5 elements onto the stack:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            int value = scanner.nextInt();
	            maxStack.push(value);
	        }

	        System.out.println("Maximum element in the stack: " + maxStack.getMaxElement());

	        scanner.close();
	    }
	
	
}
