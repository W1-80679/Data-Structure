package com.sunbeam;

import java.util.Scanner;

public class SelectionSort 

{
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int comparisons = selectionSort(array);

        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nNumber of comparisons: " + comparisons);

        scanner.close();
    }

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++; // Increment comparison count

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return comparisons;
    }
}


