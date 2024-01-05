package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the key to search: ");
	        int key = scanner.nextInt();

	        int comparisons = linearSearch(arr, key);
	        System.out.println("Number of comparisons in linear search: " + comparisons);

	        scanner.close();
	    }

	    private static int linearSearch(int[] arr, int key) {
	        int comparisons = 0;
	        for (int i = 0; i < arr.length; i++) {
	            comparisons++;
	            if (arr[i] == key) {
	                System.out.println("Key found at index " + i);
	                return comparisons;
	            }
	        }
	        System.out.println("Key not found in the array");
	        return comparisons;
	    }
	}
	
	
	

