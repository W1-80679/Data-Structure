package com.sunbeam;

import java.util.Scanner;

public class linearSearch {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input array elements
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Input element to search for
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        // Input value of n
	        System.out.print("Enter the value of n: ");
	        int nthOccurrence = scanner.nextInt();

	        // Call linear search function
	        int result = linearSearchNthOccurrence(array, target, nthOccurrence);

	        // Display the result
	        if (result != -1) {
	            System.out.println("The element " + target + " has its " + nthOccurrence + " occurrence at index " + result);
	        } else {
	            System.out.println("The element " + target + " does not have its " + nthOccurrence + " occurrence in the array.");
	        }
	    }

	    // Linear search function to find the nth occurrence of an element
	    public static int linearSearchNthOccurrence(int[] array, int target, int nthOccurrence) {
	        int count = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                count++;
	                if (count == nthOccurrence) {
	                    return i; // Return the index of the nth occurrence
	                }
	            }
	        }

	        return -1; // Return -1 if nth occurrence is not found
	    }
	}


