package com.sunbeam;

import java.util.Scanner;

public class InsertionSort 

{
	

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        System.out.println("Enter the elements of the array:");
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int comparisons = insertionSort(arr);

	        
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\nNumber of comparisons: " + comparisons);

	      
	        scanner.close();
	    }

	    public static int insertionSort(int[] arr) {
	        int n = arr.length;
	        int comparisons = 0;

	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	                comparisons++;
	            }

	            arr[j + 1] = key;
	        }

	        return comparisons;
	    }
	    
}

	

