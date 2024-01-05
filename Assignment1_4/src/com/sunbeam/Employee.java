package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	
	


	    int empId;
	    String name;
	    double salary;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }
	}

	public class EmployeeSearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an array of employees (assuming it's sorted by empId for binary search)
	        Employee[] employees = {
	            new Employee(101, "John Doe", 50000),
	            new Employee(102, "Jane Smith", 60000),
	            new Employee(103, "Bob Johnson", 55000),
	            // Add more employees as needed
	        };

	        // Sort the array by empId for binary search
	        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.empId, e2.empId));

	        // Menu for searching
	        System.out.println("Search by:");
	        System.out.println("1. Employee ID (Linear Search)");
	        System.out.println("2. Name (Linear Search)");
	        System.out.println("3. Salary (Binary Search)");

	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                searchByIdLinear(employees);
	                break;
	            case 2:
	                searchByNameLinear(employees);
	                break;
	            case 3:
	                searchBySalaryBinary(employees);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        scanner.close();
	    }

	    // Linear search by ID
	    private static void searchByIdLinear(Employee[] employees) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        int targetId = scanner.nextInt();

	        for (Employee emp : employees) {
	            if (emp.empId == targetId) {
	                displayEmployee(emp);
	                return;
	            }
	        }

	        System.out.println("Employee not found with ID: " + targetId);
	    }

	    // Linear search by name
	    private static void searchByNameLinear(Employee[] employees) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee Name: ");
	        String targetName = scanner.next();

	        for (Employee emp : employees) {
	            if (emp.name.equalsIgnoreCase(targetName)) {
	                displayEmployee(emp);
	                return;
	            }
	        }

	        System.out.println("Employee not found with name: " + targetName);
	    }

	    // Binary search by salary
	    private static void searchBySalaryBinary(Employee[] employees) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee Salary: ");
	        double targetSalary = scanner.nextDouble();

	        int index = binarySearchBySalary(employees, targetSalary);

	        if (index != -1) {
	            displayEmployee(employees[index]);
	        } else {
	            System.out.println("Employee not found with salary: " + targetSalary);
	        }
	    }

	    // Binary search helper method by salary
	    private static int binarySearchBySalary(Employee[] employees, double targetSalary) {
	        int low = 0;
	        int high = employees.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (employees[mid].salary == targetSalary) {
	                return mid;
	            } else if (employees[mid].salary < targetSalary) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1; // Employee not found
	    }

	    // Display employee details
	    private static void displayEmployee(Employee emp) {
	        System.out.println("Employee Details:");
	        System.out.println("ID: " + emp.empId);
	        System.out.println("Name: " + emp.name);
	        System.out.println("Salary: " + emp.salary);
	    }
	}
	
