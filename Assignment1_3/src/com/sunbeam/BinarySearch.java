package com.sunbeam;

import java.util.Arrays;

import java.util.Scanner;

public class BinarySearch {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter sorted elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the key to search: ");
	        int key = scanner.nextInt();

	        int comparisons = binarySearch(arr, key);
	        System.out.println("Number of comparisons in binary search: " + comparisons);

	        scanner.close();
	    }

	    private static int binarySearch(int[] arr, int key) {
	        int comparisons = 0;
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            comparisons++;
	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                System.out.println("Key found at index " + mid);
	                return comparisons;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        System.out.println("Key not found in the array");
	        return comparisons;
	    }
	}

	

