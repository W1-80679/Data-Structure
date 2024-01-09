package com.sunbeam;

import java.util.Scanner;

public class Array {
	
	    public static void reverseArray(int[] arr) 
	    {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	           
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter " + size + " integers:");

	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Original array: ");
	        printArray(array);

	        reverseArray(array);

	        System.out.println("Reversed array: ");
	        printArray(array);

	        scanner.close();
	    }

	    private static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}
