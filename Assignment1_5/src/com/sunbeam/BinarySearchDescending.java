package com.sunbeam;

import java.util.Scanner;

public class BinarySearchDescending {

	    public static int binarySearchDescending(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == target) {
	                return mid; // Target found
	            } else if (arr[mid] < target) {
	                high = mid - 1; // Target is in the right half
	            } else {
	                low = mid + 1; // Target is in the left half
	            }
	        }

	        return -1; // Target not found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input array
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] descendingArray = new int[n];

	        System.out.println("Enter the elements of the array in descending order:");
	        for (int i = 0; i < n; i++) {
	            descendingArray[i] = scanner.nextInt();
	        }

	        // Input target value
	        System.out.print("Enter the target value: ");
	        int targetValue = scanner.nextInt();

	        // Perform binary search
	        int result = binarySearchDescending(descendingArray, targetValue);

	        // Output result
	        if (result != -1) {
	            System.out.println("Target " + targetValue + " found at index " + result + ".");
	        } else {
	            System.out.println("Target " + targetValue + " not found in the array.");
	        }
	    }
	}

	
