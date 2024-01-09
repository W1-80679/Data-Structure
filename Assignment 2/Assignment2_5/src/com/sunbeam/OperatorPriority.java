package com.sunbeam;
import java.util.Scanner;
public class OperatorPriority 
{
	

	    public static int getPriority(char operator) {
	        switch (operator) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	            default:
	                throw new IllegalArgumentException("Invalid operator: " + operator);
	        }
	    }


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first operator (+, -, *, /, ^): ");
	        char operator1 = scanner.next().charAt(0);

	        System.out.print("Enter the second operator (+, -, *, /, ^): ");
	        char operator2 = scanner.next().charAt(0);

	        int priority1 = getPriority(operator1);
	        int priority2 = getPriority(operator2);

	        if (priority1 > priority2) {
	            System.out.println("Priority of '" + operator1 + "' is higher than '" + operator2 + "'");
	        } else if (priority1 < priority2) {
	            System.out.println("Priority of '" + operator1 + "' is lower than '" + operator2 + "'");
	        } else {
	            System.out.println("Priority of '" + operator1 + "' is equal to '" + operator2 + "'");
	        }

	        scanner.close();
	    }
	}
