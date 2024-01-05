package com.sunbeam;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindromeLinear(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String userString = scanner.nextLine();

        boolean isPalindromeResult = isPalindromeLinear(userString);

        System.out.println("Entered string '" + userString + "' is a palindrome: " + isPalindromeResult);

                scanner.close();
    }
}