package com.sunbeam;

import java.util.Scanner;

public class LinearSearch 
{
	

	    public static int lastIndexOf(int[] array, int key) {
	        int lastIndex = -1;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == key) {
	                lastIndex = i;
	            }
	        }

	        return lastIndex;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the key to search: ");
	        int key = scanner.nextInt();

	        int lastIndex = lastIndexOf(array, key);

	        if (lastIndex != -1) {
	            System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
	        } else {
	            System.out.println(key + " not found in the array.");
	        }

	        scanner.close();
	    }
	}


	
	
	
	
	
	
	
